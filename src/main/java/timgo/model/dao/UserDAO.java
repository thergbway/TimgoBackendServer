package timgo.model.dao;

import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import timgo.model.dao.dto.UserDTO;

@Repository
public class UserDAO {
    public UserDTO read(Integer id) {
        String sql =
            "select * from users where id = :id";

        try (Connection con = Sql2oHolder.SQL_2_O.open()) {
            return con.createQuery(sql)
                .addParameter("id", id)
                .executeAndFetchFirst(UserDTO.class);
        }
    }
}