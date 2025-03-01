package March1;

public class Employee {
int id;
String name;
String email;
String company;

    public Employee(int id, String name, String email, String company) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.company = company;
    }

    public void employeeDes(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(company);
    }
}
