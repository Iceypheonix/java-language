abstract class Vehicle {
    int no_of_tyres; //////// variable

    abstract void start(); ////// method
}

class car extends Vehicle {
    int no_of_tyres = 4;

    void start() {
        System.out.println("starts with key" + no_of_tyres);
    }
}

class scooter extends Vehicle {
    int no_of_tyres = 2;

    void start() {
        System.out.println("starts with kick" + no_of_tyres);
    }
}

public class Vehicle1 {
    public static void main(String args[]) {
        car c = new car();
        scooter s = new scooter();
        c.start();
        s.start();
  }
}