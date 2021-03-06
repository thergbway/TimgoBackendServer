package timgo.services.entities;

import java.sql.Timestamp;

public class PublicationBrief {
    private Integer id;
    private String title;
    private String role;
    private String photo_100_url;
    private Boolean is_team;
    private Timestamp posted_timestamp;

    public PublicationBrief(Integer id, String title, String role, String photo_100_url, Boolean is_team, Timestamp posted_timestamp) {
        this.id = id;
        this.title = title;
        this.role = role;
        this.photo_100_url = photo_100_url;
        this.is_team = is_team;
        this.posted_timestamp = posted_timestamp;
    }

    public PublicationBrief() {

    }

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
}
