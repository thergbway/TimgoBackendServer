package timgo.model.dao.dto;

public class UserDTO {
    private Integer id;
    private Integer vk_id;
    private String first_name;
    private String last_name;
    private byte[] photo_100;
    private String about;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVk_id() {
        return vk_id;
    }

    public void setVk_id(Integer vk_id) {
        this.vk_id = vk_id;
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

    public byte[] getPhoto_100() {
        return photo_100;
    }

    public void setPhoto_100(byte[] photo_100) {
        this.photo_100 = photo_100;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
