package timgo.model.dao.dto;

import java.sql.Timestamp;

public class PublicationDTO {
    private Integer id;
    private Integer creator;
    private Integer team;
    private String role;
    private Integer goal;
    private Integer skill;
    private String description;
    private Timestamp posted_timestamp;
    private Boolean is_active;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getTeam() {
        return team;
    }

    public void setTeam(Integer team) {
        this.team = team;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getGoal() {
        return goal;
    }

    public void setGoal(Integer goal) {
        this.goal = goal;
    }

    public Integer getSkill() {
        return skill;
    }

    public void setSkill(Integer skill) {
        this.skill = skill;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getPosted_timestamp() {
        return posted_timestamp;
    }

    public void setPosted_timestamp(Timestamp posted_timestamp) {
        this.posted_timestamp = posted_timestamp;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }
}
