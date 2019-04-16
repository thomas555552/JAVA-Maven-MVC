package beadando.modell;

public class User {

    private String name;
    private String address;
    private int age;

    //TODO AGE-re ellenorzes nagyobb mint nulla es kisebb mint 120 exceptionnel

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
}
