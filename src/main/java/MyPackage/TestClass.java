package MyPackage;

public class TestClass {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Manager manager1 = new Manager();
        Chief chief = new Chief();
        Secretary secretary = new Secretary();

        employee1.FirstName = "Vasya";
        employee1.LastName = "Pupkin";
        employee1.Age = 21;
        employee1.Department = "Development";
        System.out.println("My name is " + employee1.FirstName + employee1.LastName + ". I'm " + employee1.Age + "years old. I'm working in " + employee1.Department + " department");
        employee1.responsibilities("Coding");
        System.out.println();


        employee2.FirstName = "Zhenya";
        employee2.LastName = "Koshkin";
        employee2.Age = 23;
        employee2.Department = "Testing";

        System.out.println("My name is " + employee2.FirstName + employee2.LastName + ". I'm " + employee2.Age + "years old. I'm working in " + employee2.Department + " department");
        employee2.responsibilities("Test-automation");
        System.out.println();

        manager1.FirstName="Kolya";
        manager1.LastName="Pushkin";
        manager1.Age=28;
        manager1.Department="Development";

        System.out.println("My name is " + manager1.FirstName + manager1.LastName + ". I'm " + manager1.Age + "years old. I'm working in " + manager1.Department + " department");
        employee2.responsibilities("Move hands");
        System.out.println();

        chief.FirstName="Oleg";
        chief.LastName="Iuzhniy";
        chief.Age=58;

        System.out.println("My name is " + manager1.FirstName + manager1.LastName + ". I'm " + manager1.Age + "years old");
        employee2.responsibilities("To sleep");
        System.out.println();

        secretary.FirstName="Kuzya";
        secretary.LastName="Travkin";
        secretary.Age=40;

        System.out.println("My name is " + secretary.FirstName + secretary.LastName + ". I'm " + secretary.Age + "years old. ");
        employee2.responsibilities("To drink tea");
        System.out.println();
    }
}
