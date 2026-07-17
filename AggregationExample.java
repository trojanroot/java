class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
    }
}

class Department{
    String departmentName;
    Employee employee;
    Department(String departmentName,Employee employee){
        this.departmentName=departmentName;
        this.employee=employee;
    }
    void displayDepartment(){
        System.out.println("Department: "+departmentName);
        employee.displayEmployee();
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Employee emp=new Employee("Aryan");
        Department dept=new Department("Information Technology", emp);
        dept.displayDepartment();
        System.out.println("\nEmp still exit");
        emp.displayEmployee();
    }

}
