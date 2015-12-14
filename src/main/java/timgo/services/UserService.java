package timgo.services;

import timgo.model.dao.UserDAO;
import timgo.model.dao.dto.UserDTO;
import timgo.services.entities.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public byte[] getUserPicture(Integer id) {
        return userDAO.read(id).getPhoto_100();
    }

    public UserDetails getUser(Integer id) {
        UserDTO dto = userDAO.read(id);
        return new UserDetails(
            dto.getId(),
            dto.getFirst_name(),
            dto.getLast_name(),
            "/content/user/pic100?userId=" + dto.getId(),
            "https://vk.com/id" + dto.getVk_id(),
            dto.getAbout()
        );
    }
}