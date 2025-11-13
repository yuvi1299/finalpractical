abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void displayDetails();
}

class Student extends Person {
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("-------------------------");
    }
}

class Teacher extends Person {
    String subjectCode;

    Teacher(String name, int age, String subjectCode) {
        super(name, age);
        this.subjectCode = subjectCode;
    }

    @Override
    void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject Code: " + subjectCode);
        System.out.println("-------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Person personRef;

        personRef = new Student("Ayush Lal", 20, 11460);
        personRef.displayDetails();

        personRef = new Teacher("Abhi Chauhan", 30, "CS101");
        personRef.displayDetails();
    }
}
