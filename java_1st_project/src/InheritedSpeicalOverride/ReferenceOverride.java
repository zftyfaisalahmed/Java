package InheritedSpeicalOverride;

class Plane {
    void takeOff() {
        System.out.println("Plane took Off");
    }

    void fly() {
        System.out.println("Plane is flying");
    }

    void land() {
        System.out.println("Plane has landed");
    }
}

class CargoPlane extends Plane {
    void fly() {
        System.out.println("Cargo Plane fly at low heights");
    }

    void carryGoods() {
        System.out.println("Cargo Plane carry goods");
    }
}

class PassengerPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Passenger Plane fly at low heights");
    }

    void carryHuman() {
        System.out.println("Passenger Plane carry Humans");
    }
}

class FighterPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Fighter Plane fly at high heights");
    }

    void carryWeapon() {
        System.out.println("Fighter Plane carry Weapons");
    }
}

public class ReferenceOverride {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        // Reference Override
        Plane ref;

        System.out.println("Cargo Plane Data : ");
        ref = cp;
        ref.takeOff();
        ref.fly();
        ref.land();
        cp.carryGoods();// We Cannot have parent type reference to the specilaized methods of the child
                        // class
        System.out.println("================");

        System.out.println("Passenger Plane Data : ");
        ref = pp;
        ref.takeOff();
        ref.fly();
        ref.land();
        pp.carryHuman();
        System.out.println("================");

        System.out.println("Fighter Plane Data : ");
        ref = fp;
        ref.takeOff();
        ref.fly();
        ref.land();
        fp.carryWeapon();
        System.out.println("================");

    }
}
