package Ejer2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", "123 Main St", "Computer Science", 2, 15000.00);
        System.out.println(student);

        Staff staff = new Staff("Bob", "456 Oak St", "Engineering School", 50000.00);
        System.out.println(staff);
    }
}
