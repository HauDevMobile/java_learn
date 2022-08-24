package model;

public abstract class SecondActivity {
    public String fname = "John";
    public int age = 24;

    public abstract void study();
}

class SecondClass extends SecondActivity {
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
