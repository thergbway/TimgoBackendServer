package timgo.model.entities;

import java.sql.Timestamp;

public class Publication {
    private Integer id;
    private String title;
    private String role;
    private String photo_100_url;
    private Boolean is_team;
    private String details_url;
    private Timestamp posted_timestamp;

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

    public String getDetails_url() {
        return details_url;
    }

    public void setDetails_url(String details_url) {
        this.details_url = details_url;
    }

    public Timestamp getPosted_timestamp() {
        return posted_timestamp;
    }

    public void setPosted_timestamp(Timestamp posted_timestamp) {
        this.posted_timestamp = posted_timestamp;
    }

    public Publication() {

    }

    public Publication(Integer id, String title, String role, String photo_100_url, Boolean is_team, String details_url, Timestamp posted_timestamp) {

        this.id = id;
        this.title = title;
        this.role = role;
        this.photo_100_url = photo_100_url;
        this.is_team = is_team;
        this.details_url = details_url;
        this.posted_timestamp = posted_timestamp;
    }
}
