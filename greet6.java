class ElectronicDevice {
    void start() {
        System.out.println("Device started");
    }
}

class Fan extends ElectronicDevice {
    void start() {
        System.out.println("Fan is rotating");
    }
}

class LED extends ElectronicDevice {
    void start() {
        System.out.println("LED is glowing");
    }
}

class Motor extends ElectronicDevice {
    void start() {
        System.out.println("Motor is running");
    }
}

public class Polymorphism33 {
    public static void main(String[] args) {
        ElectronicDevice device;

        device = new Fan();
        device.start();

        device = new LED();
        device.start();

        device = new Motor();
        device.start();
    }
}