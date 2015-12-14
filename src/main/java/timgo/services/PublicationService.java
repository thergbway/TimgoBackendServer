package timgo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import timgo.model.dao.GoalDAO;
import timgo.model.dao.PublicationDAO;
import timgo.model.dao.dto.PublicationDTO;
import timgo.services.entities.PublicationBrief;
import timgo.services.entities.PublicationDetails;
import timgo.services.entities.UserDetails;

import java.util.LinkedList;
import java.util.List;

@Service
public class PublicationService {
    @Autowired
    private PublicationDAO publicationDAO;
    @Autowired
    private GoalService goalService;
    @Autowired
    private UserService userService;

    public List<PublicationBrief> getPublications() {
        List<PublicationDTO> publicationDTOs = publicationDAO.readAll();

        LinkedList<PublicationBrief> publicationBriefs = new LinkedList<>();
        for (PublicationDTO publicationDTO : publicationDTOs) {
            UserDetails creator = userService.getUser(publicationDTO.getCreator());

            PublicationBrief publicationBrief = new PublicationBrief(
                publicationDTO.getId(),
                creator.getFirst_name() + " " + creator.getLast_name(),
                publicationDTO.getRole(),
                creator.getPhoto_100_url(),
                publicationDTO.getTeam() != null,
                publicationDTO.getPosted_timestamp()
            );

            publicationBriefs.add(publicationBrief);
        }

        return publicationBriefs;
    }

    public PublicationDetails getPublicationDetails(Integer id) {
        PublicationDTO publicationDTO = publicationDAO.read(id);
        UserDetails creator = userService.getUser(publicationDTO.getCreator());
        String goalName = goalService.getGoalName(publicationDTO.getGoal());

        return new PublicationDetails(
            publicationDTO.getId(),
            creator.getFirst_name() + " " + creator.getLast_name(),
            publicationDTO.getRole(),
            creator.getPhoto_100_url(),
            publicationDTO.getTeam() != null,
            publicationDTO.getPosted_timestamp(),
            publicationDTO.getSkill(),
            goalName,
            publicationDTO.getDescription(),
            publicationDTO.getIs_active()
        );
    }
}