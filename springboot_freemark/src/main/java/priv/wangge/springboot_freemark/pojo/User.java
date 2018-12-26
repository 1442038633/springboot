package priv.wangge.springboot_freemark.pojo;

public class User {
    private Integer id;
    private  String username;
    private  String userage;

    public User() {
    }

    public User(Integer id, String username, String userage) {
        this.id = id;
        this.username = username;
        this.userage = userage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserage() {
        return userage;
    }

    public void setUserage(String userage) {
        this.userage = userage;
    }
}
