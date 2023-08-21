
class Employee {
    public String name;
    public int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void introduce() {
        System.out.println("hi, I am " + name + " my employee id is " + employeeId);
    }
}

    class Manager extends Employee{
            String department;
            public Manager(String name, int employeeId, String department){
                super(name,employeeId);
                this.department=department;
        }
        public void introduce(){
            System.out.println("hi, I am "+name +" my department is " +department);
        }
    }

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int employeeId, String programmingLanguage) {
        super(name, employeeId);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a developer specializing in " + programmingLanguage);
    }
}
public class EmployeeHierarchyExample {
    public static void main(String[] args) {
        Employee emp=new Employee("Saif", 22);
        Manager mg=new Manager("Alam",33, "HR");
        Developer dev = new Developer("Khan", 3001, "Java");

        emp.introduce();
        mg.introduce();
        dev.introduce();
    }
}
