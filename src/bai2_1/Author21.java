package bai2_1;

public class Author21 {
    private String name;
    private String email;
    private String gender ;


    public Author21(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;

    }
    public String getName() {
        return name;
    }
    public String getemail() {
        return email;
    }
    public String setemail(){
        return email;
    }
    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

}

