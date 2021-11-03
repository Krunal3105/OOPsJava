package OOPs;

public class RunTest {
    public static void main(String[] args){
        System.out.println("Employee:-");

        EmployeeIn Employee = new EmployeeIn();
        Employee.name();

        System.out.println("Driver:-");
        DriverIn Driver = new DriverIn();
        Driver.name();
        Driver.age();
        Driver.address();

        System.out.println("Engineer:-");
        EngineerIn Engineer = new EngineerIn();
        Engineer.name();
        Engineer.age();
        Engineer.address();
    }
}
