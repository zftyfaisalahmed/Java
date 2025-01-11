package InheritedSpeicalOverride;

class Plane {
    void takeOff() {
        System.out.println("Plane took Off");
    }

    // Method Overloading
    void takeOff(int speed) {
        System.out.println("Plane took off at speed: " + speed);
    }

    void fly() {
        System.out.println("Plane is flying");
    }

    void land() {
        System.out.println("Plane has landed");
    }
}

// Method overriding occurs when a subclass provides a specific implementation
// for a method that is already defined in its parent class.
class cargoPlane extends Plane {
    // Method Overloading
    // @Override
    // void takeOff(int speed) {
    // System.out.println("Cargo Plane took off at speed: " + speed);
    // }

    @Override
    // Method Override
    void fly() {
        System.out.println("Cargo Plane zfly at low heights");
    }

    void carryGoods() {
        System.out.println("Cargo Plane carry goods");
    }
}

class passengerPlane extends Plane {
    @Override
    // Method Override
    void fly() {
        System.out.println("Passenger Plane fly at low heights");
    }

    void carryHuman() {
        System.out.println("Passenger Plane carry Humans");
    }
}

class fighterPlane extends Plane {

    // Method Overloading
    // void takeOff(int speed) {
    // System.out.println("Plane took off at speed: " + speed);
    // }

    // Method Override
    void fly() {
        System.out.println("Fighter Plane fly at high heights");
    }

    void carryWeapon() {
        System.out.println("Fighter Plane carry Weapons");
    }
}

public class p1 {
    public static void main(String[] args) {
        cargoPlane cp = new cargoPlane();
        passengerPlane pp = new passengerPlane();
        fighterPlane fp = new fighterPlane();

        System.out.println("Cargo Plane Data : ");
        cp.takeOff(); // Default takeOff Method
        // cp.takeOff(3000);// Overloaded Version
        cp.fly();
        cp.land();
        cp.carryGoods();
        System.out.println("==============");

        System.out.println("Passenger Plane Data : ");
        pp.takeOff();
        pp.fly();
        pp.land();
        pp.carryHuman();
        System.out.println("==============");

        System.out.println("Fighter Plane Data : ");
        fp.takeOff(); // Default takeOff Method
        // fp.takeOff(10000);// Overloaded Version
        fp.fly();
        fp.land();
        fp.carryWeapon();
        System.out.println("==============");
    }
}
