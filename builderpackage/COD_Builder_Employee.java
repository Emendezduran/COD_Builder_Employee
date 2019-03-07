package builderpackage;
// @author emendezduran

public class COD_Builder_Employee {
    public static void main(String[] args) {
        
        Employee emp1;
        Employee emp2;
        
        emp1 = new EmployeeBuilder("Gabriel", 111222333).setBirthDate(18).setBirthMonth(9).setBirthYear(1995).createEmployee();

        emp2 = new EmployeeBuilder("karla", 222333444).setBirthDate(17).setBirthMonth(8).setBirthYear(1995).createEmployee();
        
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
    }

}
