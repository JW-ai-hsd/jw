public class User {
    private String user;
    private String name;
    private String age;
    private String sex;

    public User() {
    }

    public User(String user, String name, String age, String sex) {
        this.user = user;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
