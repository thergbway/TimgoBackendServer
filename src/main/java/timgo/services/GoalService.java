package timgo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import timgo.model.dao.GoalDAO;

@Service
public class GoalService {
    @Autowired
    private GoalDAO goalDAO;

    public String getGoalName(Integer id) {
        return goalDAO.read(id).getValue();
    }
}
