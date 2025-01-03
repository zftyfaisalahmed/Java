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

public class p1 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        System.out.println("Cargo Plane Data : ");
        cp.takeOff();
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
        fp.takeOff();
        fp.fly();
        fp.land();
        fp.carryWeapon();
        System.out.println("==============");
    }
}
