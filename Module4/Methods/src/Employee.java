
public class Employee {
    private String name;
    private String email = "not set";
    private int phone;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Employee(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public Employee(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("E-mail: " + email);
        System.out.println("Phone: " + ((phone > 0) ? phone : " not set"));
        System.out.println();
    }

}
