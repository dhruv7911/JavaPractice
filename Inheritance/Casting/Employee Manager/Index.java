class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

class Manager extends Employee {
    private String department; // Fixed 'string' to 'String'
    private double bonus;

    public Manager(String name, int id, double salary, String department, double bonus) {
        super(name, id, salary);
        this.department = department;
        this.bonus = bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);
    }

    public double getBonus() {
        return bonus;
    }
}

public class Index {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 101, 50000);
        Manager m1 = new Manager("Bob", 102, 80000, "IT", 10000);
        Employee e2 = new Manager("Charlie", 103, 70000, "HR", 15000);

        Employee[] employees = { e1, m1, e2 };

        for (Employee emp : employees) {
            emp.displayDetails(); // Call displayDetails for each employee

            if (emp instanceof Manager) {
                Manager mgr = (Manager) emp; // Downcasting to Manager
                System.out.println("This is a manager. Additional details:");
                System.out.println("Bonus: " + mgr.getBonus());
            }
            System.out.println();
        }
    }
}

