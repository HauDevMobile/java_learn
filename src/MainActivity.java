import model.Vehicle;

import java.util.*;

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

        //        Static vs Public
        //        MainActivity main = new MainActivity();
        //        main.myPublicMethod();
        //        myStaticMethod();

        //        model.SecondClass secondClass = new model.SecondClass();
        //        System.out.println("Name: " + secondClass.fname);
        //        secondClass.study();

        //        model.Person person = new model.Person();
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

        //        Vehicle[] vehicle = {
        //                new Vehicle("Fort", "CS-11", "Black", 4),
        //                new Vehicle("Fort", "CS-11", "Black", 4),
        //                new Vehicle("Fort", "CS-11", "Black", 4),
        //                new Vehicle("Fort", "CS-11", "Black", 4),
        //        };
        //
        //        for (int i = 0; i < vehicle.length; i++) {
        //            System.out.println(vehicle[i].getBrand() + "-" + vehicle[i].getNameId() + "-" + vehicle[i].getColor() + "-" + vehicle[i].getSeats());
        //        }

        // ArrayList
        //        ArrayList<String> cars = new ArrayList<String>();
        //        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        //
        //        cars.add("Ford");
        //        cars.add("Mazda");
        //        cars.add("Honda");
        //        cars.add("BMW");
        //
        //        myNumbers.add(33);
        //        myNumbers.add(15);
        //        myNumbers.add(20);
        //        myNumbers.add(34);
        //        myNumbers.add(8);
        //        myNumbers.add(12);
        //
        //        // Sort in Array String use Collection
        //        Collections.sort(cars);
        //
        //        // Sort in Array Integer use Collection
        //        Collections.sort(myNumbers);
        //
        //        for (String i : cars){
        //            System.out.println(i);
        //        }
        //
        //        for (Integer i : myNumbers){
        //            System.out.println(i);
        //        }

        // HashMap
        //        HashMap<String, Integer> persons = new HashMap<String, Integer>();
        //        persons.put("Henry", 18);
        //        persons.put("Tom", 20);
        //        persons.put("Nick", 10);
        //        persons.put("Johny", 25);
        //        persons.put("Mia", 15);
        //
        //        System.out.println(persons.get("Mia"));

        // HashSet
        HashSet<String> cars = new HashSet<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }
}
