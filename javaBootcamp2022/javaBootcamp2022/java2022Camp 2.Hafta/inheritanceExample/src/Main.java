public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        EmployeeManeger employeeManeger = new EmployeeManeger();
        CustomerManeger customerManeger = new CustomerManeger();

        employeeManeger.bestEmployee();
        customerManeger.list();
    }
}