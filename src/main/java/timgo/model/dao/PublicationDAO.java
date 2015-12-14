package timgo.model.dao;

import timgo.model.dao.dto.PublicationDTO;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;

import java.util.List;

@Repository
public class PublicationDAO {
    public List<PublicationDTO> readAll() {
        String sql =
            "select * from publications";

        try(Connection con = Sql2oHolder.SQL_2_O.open()) {
            return con.createQuery(sql)
                .executeAndFetch(PublicationDTO.class);
        }
    }

    public PublicationDTO read(Integer id) {
        String sql =
            "select * from publications where id = :id";

        try(Connection con = Sql2oHolder.SQL_2_O.open()) {
            return con.createQuery(sql)
                .addParameter("id", id)
                .executeAndFetchFirst(PublicationDTO.class);
        }
    }
}
