public class q4 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();

        Bike bike = new Bike();
        bike.start();
        bike.stop();

    }
}

interface Vehicle {
    abstract void start();

    default void stop() {
        System.out.println("vehicle Stopped");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("car started..");
    }

    public void stop() {
        System.out.println("car Stopped...");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("bike started..");
    }
}
