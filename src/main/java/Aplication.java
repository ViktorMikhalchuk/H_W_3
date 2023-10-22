import firstPacage.SameName;

public class Aplication {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Viktor Mikhalchuk","java","mihvi@mail.com","0672851021",32);
        Employee employee2 = new Employee("Serhiy Stepanko","C#","hslfl2gmail.com","0973455534",24);
        employee1.print();
        employee2.print();

        Car car = new Car();
        car.start();

        firstPacage.SameName sameName1 = new firstPacage.SameName();
        sameName1.Show();

        secondPacage.SameName sameName2 = new secondPacage.SameName();
                sameName2.Show();
    }
}
