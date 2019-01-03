package priv.wangge.pojo;

import javax.validation.constraints.NotEmpty;

public class Users {
    //    @NotBlank(message = "用户名不能为空")
    @NotEmpty
    private String name;
    //    @NotBlank(message = "用户密码不能为空")
    @NotEmpty
    private String password;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
