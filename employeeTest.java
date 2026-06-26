class Employee{
    private int empId;
    private String department;
    public Employee(int empId,String department){
        this.empId=empId;
        this.department=department;
    }
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null || getClass() != obj.getClass())
            return false;
        Employee emp=(Employee) obj;
        return empId==emp.empId &&
        department.equals(emp.department);
    }
    public int hashCode(){
        int result =Integer.hashCode(empId);
        result=31*result+department.hashCode();
        return result;
    }
}
public class employeeTest {
    public static void main(String[] args) {
        Employee e1 =new Employee(101,"IT");
        Employee e2 =new Employee(102,"IT");
        Employee e3 =new Employee(103,"HR");

        System.out.println("e1 equals e2: "+e1.equals(e2));
        System.out.println("e1 hashcode: "+e1.hashCode());
        System.out.println("e2 hashcode: "+e2.hashCode());
        System.out.println();
        System.out.println("e1 equals e3: "+e1.equals(e3));
        System.out.println("e3 hashcode : "+e3.hashCode());
    }
}
