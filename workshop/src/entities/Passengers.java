package entities;

public class Passengers {
    private long id;
    private String name;
    private String lastName;
    private int age;
    private String email;
    private long contactNumber;
    private long passNumber;
    private String nacionality;


    public Passengers(long id, String name, String lastName, int age, String email, long contactNumber, long passNumber, String nacionality) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.contactNumber = contactNumber;
        this.passNumber = passNumber;
        this.nacionality = nacionality;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public long getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(long passNumber) {
        this.passNumber = passNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Passengers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", contactNumber=" + contactNumber +
                ", passNumber=" + passNumber +
                ", nacionality='" + nacionality + '\'' +
                '}';
    }
}
