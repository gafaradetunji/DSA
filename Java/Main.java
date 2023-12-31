import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String name;
    String email;
    double salary;
    int age;
    String favColor;

    System.out.println("This is a test");
    System.out.println("We would be needing some of your details ");
    System.out.println();

    System.out.println("Enter your name:           ");
    name = scanner.nextLine();
    System.out.println("Enter your email:          ");
    email = scanner.nextLine();
    System.out.println("Enter your salary:         ");
    salary = scanner.nextDouble();
    System.out.println("Enter your age:            ");
    age = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter your favorite color: ");
    favColor = scanner.nextLine();

    System.out.println("Name: " + name);
    System.out.println("Email: " + email);
    System.out.println("Salary: " + salary);
    System.out.println("Age: " + age);
    System.out.println("Favorite Color: " + favColor);

    scanner.close();

    System.out.println("Your profile has been saved to profile.txt");
  }
}
