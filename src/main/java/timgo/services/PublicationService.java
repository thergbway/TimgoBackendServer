package timgo.services;

import timgo.model.dao.GoalDAO;
import timgo.model.dao.PublicationDAO;
import timgo.model.dao.dto.PublicationDTO;
import timgo.model.entities.Publication;
import timgo.model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class PublicationService {
    @Autowired
    private PublicationDAO publicationDAO;
    @Autowired
    private GoalDAO goalDAO;
    @Autowired
    private UserService userService;

    public List<Publication> getPublications() {
        List<PublicationDTO> publicationDTOs = publicationDAO.readAll();

        LinkedList<Publication> publications = new LinkedList<>();
        for (PublicationDTO publicationDTO : publicationDTOs) {
            User creator = userService.getUser(publicationDTO.getCreator());

            Publication publication = new Publication(
                publicationDTO.getId(),
                creator.getFirst_name() + " " + creator.getLast_name(),
                publicationDTO.getRole(),
                creator.getPhoto_100_url(),
                publicationDTO.getTeam() != null,
                "http://NO_THIS_URL_YET",
                publicationDTO.getPosted_timestamp()
            );

            publications.add(publication);
        }

        return publications;
    }
}
