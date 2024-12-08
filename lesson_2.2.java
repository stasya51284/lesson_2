public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petr@mailbox.com", "892312313", 40000, 35);
        employees[2] = new Employee("Sidorov Sidr", "Director", "sidr@mailbox.com", "892312314", 50000, 40);
        employees[3] = new Employee("Smirnov Ivan", "Analyst", "ivan2@mailbox.com", "892312315", 45000, 28);
        employees[4] = new Employee("Kuznetsov Alex", "Developer", "alex@mailbox.com", "892312316", 60000, 32);
        
        for (Employee employee : employees) {
            employee.printEmployeeInfo();
            System.out.println();
        }
    }
}
