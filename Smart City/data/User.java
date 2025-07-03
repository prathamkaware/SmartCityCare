package data;

public class User {
    private int id;
    private String name, email, mobile, city, password;

    public User() {}

     User(String name, String email, String mobile, String city, String password) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.city = city;
        this.password = password;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public static void main( String args[]){
        new User();

    }
}

