import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones",123));
        employeeList.add(new Employee("John", "Doe",4567));
        employeeList.add(new Employee("Mary", "Smith",22));
        employeeList.add(new Employee("Mike", "Wilson",3245));


        Employee janeJones = new Employee("Jane", "Jones",123);
        Employee johnDoe =new Employee("John", "Doe",4567);
        Employee marySmith =new Employee("Mary", "Smith",22);
        Employee mikeWilson =new Employee("Mike", "Wilson",3245);
        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());

        Employee billEnd = new Employee("Bill","End",78);
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());


//        employeeList.forEach(employee -> System.out.println(employee));
//        System.out.println(employeeList.get(1));
//        System.out.println(employeeList.isEmpty());
        employeeList.set(1, new Employee("John","Adams",4568));
//        employeeList.forEach(employee -> System.out.println(employee));
//        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("John","Doe",4567));
//        employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee:employeeArray) {
//            System.out.println(employee);
        }

//        System.out.println(employeeList.contains(new Employee("Mary","Smith",22)));
//        System.out.println(employeeList.indexOf(new Employee("John","Doe",4567)));
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));
        }
    }

