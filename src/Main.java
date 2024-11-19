import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();
        directory.addEmployee(new Employee("001", "123-456-789", "Alice", 5));
        directory.addEmployee(new Employee("002", "987-654-321", "Bob", 3));
        directory.addEmployee(new Employee("003", "554-123-456", "Alice", 5));

        List<Employee> employeesWithExperience5 = directory.findEmployeesByExperience(5);
        System.out.println("Сотрудники со стажем 5 лет:");
        for (Employee emp : employeesWithExperience5) {
            System.out.println(emp.getName());
        }

        List<String> phoneNumbersOfAlice = directory.getPhoneNumberByName("Alice");
        System.out.println("Номера телефонов сотрудников по имени Alice:");
        for (String phone : phoneNumbersOfAlice) {
            System.out.println(phone);
        }

        Optional<Employee> employee = directory.findEmployeeById("002");
        employee.ifPresent(emp -> System.out.println("Найден сотрудник: " + emp.getName() + ", Телефон: " + emp.getPhoneNumber()));
    }

    }
