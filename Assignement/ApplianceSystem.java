package Assignement;
abstract class Appliance {
    abstract void turnOn();
    abstract void turnOff();
}

class Fan extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Fan is turned on");
    }

    @Override
    void turnOff() {
        System.out.println("Fan is turned off");
    }
}

class Light extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Light is turned on");
    }

    @Override
    void turnOff() {
        System.out.println("Light is turned off");
    }
}

public class ApplianceSystem {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        Appliance light = new Light();

        fan.turnOn();
        fan.turnOff();

        light.turnOn();
        light.turnOff();
    }
}

