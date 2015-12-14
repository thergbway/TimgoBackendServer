package timgo.services.entities;

public class UserDetails {
    private Integer id;
    private String first_name;
    private String last_name;
    private String photo_100_url;
    private String vk_url;
    private String about;

    public UserDetails() {
    }

    public UserDetails(Integer id, String first_name, String last_name, String photo_100_url, String vk_url, String about) {

        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.photo_100_url = photo_100_url;
        this.vk_url = vk_url;
        this.about = about;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhoto_100_url() {
        return photo_100_url;
    }

    public void setPhoto_100_url(String photo_100_url) {
        this.photo_100_url = photo_100_url;
    }

    public String getVk_url() {
        return vk_url;
    }

    public void setVk_url(String vk_url) {
        this.vk_url = vk_url;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
