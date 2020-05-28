package HW_5_1;

public class Main {

    public static void main(String[] args) {
            Employee[] employee = new Employee[5];
            employee[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "890000000", 30000, 30);
            employee[1] = new Employee("Petr Petrov", "Java_Developer", "petr@mailbox.com", "891111111", 150000, 100);
            employee[2] = new Employee("Andry Andreev", "HR", "andry@mailbox.com", "89222222222", 80000, 24);
            employee[3] = new Employee("Stepan Stepanov", "PR", "stepan@mailbox.com", "893333333", 750000, 41);
            employee[4] = new Employee("Vasy Vasyn", "Sales", "vasy@mailbox.com", "894444444", 68000, 45);
            for (int i = 0; i < employee.length; i++) {
                if (employee[i].getAge() > 40) {
                    employee[i].printInfo();
                }
            }
        }

    }
class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + name + " / Должность: " + position + " / email: " + email + " / Телефон: " + phoneNumber + " / З/П " + salary + " / Возраст: " + age);
    }
}
