import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainActivity {
    static void myStaticMethod() {
        System.out.println("Static");
    }

    public void myPublicMethod() {
        System.out.println("Public");
    }

    public static void main(String[] args) {
        //        For vs Foreach
        //        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        //
        //        for (int i = 0; i < cars.length; i++){
        //            System.out.println(cars[i]);
        //        }
        //
        //        for (String i : cars) {
        //            System.out.println(i);
        //        }

        //Static vs Public
        //        MainActivity main = new MainActivity();
        //        main.myPublicMethod();
        //        myStaticMethod();

        //        SecondClass secondClass = new SecondClass();
        //        System.out.println("Name: " + secondClass.fname);
        //        secondClass.study();

        //        Person person = new Person();
        //
        //        Scanner textController = new Scanner(System.in);
        //        System.out.println("Enter your name: ");
        //
        //        String name = person.setName(textController.nextLine());
        //
        //        System.out.println("Name: " + name);

        //        LocalDateTime dateTime = LocalDateTime.now();
        //        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        //
        //        String dateFormat = dateTime.format(myFormatObj);
        //        System.out.println(dateFormat);

        Vehicle[] vehicle = {
                new Vehicle("Fort", "CS-11", "Black", 4),
                new Vehicle("Fort", "CS-11", "Black", 4),
                new Vehicle("Fort", "CS-11", "Black", 4),
                new Vehicle("Fort", "CS-11", "Black", 4),
        };

        for (int i = 0; i < vehicle.length; i++) {
            System.out.println(vehicle[i].getBrand() + "-" + vehicle[i].getNameId() + "-" + vehicle[i].getColor() + "-" + vehicle[i].getSeats());
        }
    }
}
