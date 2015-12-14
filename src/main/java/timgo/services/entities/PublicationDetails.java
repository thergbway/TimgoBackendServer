package timgo.services.entities;

import java.sql.Timestamp;

public class PublicationDetails {
    private Integer id;
    private String title;
    private String role;
    private String photo_100_url;
    private Boolean is_team;
    private Timestamp posted_timestamp;
    private Integer skill;
    private String goal;
    private String description;
    private Boolean is_active;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhoto_100_url() {
        return photo_100_url;
    }

    public void setPhoto_100_url(String photo_100_url) {
        this.photo_100_url = photo_100_url;
    }

    public Boolean getIs_team() {
        return is_team;
    }

    public void setIs_team(Boolean is_team) {
        this.is_team = is_team;
    }

    public Timestamp getPosted_timestamp() {
        return posted_timestamp;
    }

    public void setPosted_timestamp(Timestamp posted_timestamp) {
        this.posted_timestamp = posted_timestamp;
    }

    public Integer getSkill() {
        return skill;
    }

    public void setSkill(Integer skill) {
        this.skill = skill;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public PublicationDetails(Integer id, String title, String role, String photo_100_url, Boolean is_team, Timestamp posted_timestamp, Integer skill, String goal, String description, Boolean is_active) {

        this.id = id;
        this.title = title;
        this.role = role;
        this.photo_100_url = photo_100_url;
        this.is_team = is_team;
        this.posted_timestamp = posted_timestamp;
        this.skill = skill;
        this.goal = goal;
        this.description = description;
        this.is_active = is_active;
    }

    public PublicationDetails() {

    }
}
