package timgo.model.dao;

import timgo.model.dao.dto.GoalDTO;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;

@Repository
public class GoalDAO {
    public GoalDTO read(Integer id) {
        String sql =
            "select * from goals where id = :id";

        try(Connection con = Sql2oHolder.SQL_2_O.open()) {
            return con.createQuery(sql)
                .executeAndFetchFirst(GoalDTO.class);
        }
    }
}
