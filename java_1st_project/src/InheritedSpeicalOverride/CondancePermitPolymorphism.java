package InheritedSpeicalOverride;

class AeroPlane {
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

class cargoPlane extends AeroPlane {
    void fly() {
        System.out.println("Cargo Plane fly at low heights");
    }

    void carryGoods() {
        System.out.println("Cargo Plane carry goods");
    }
}

class passengerPlane extends AeroPlane {
    @Override
    void fly() {
        System.out.println("Passenger Plane fly at low heights");
    }

    void carryHuman() {
        System.out.println("Passenger Plane carry Humans");
    }
}

class fighterPlane extends AeroPlane {
    @Override
    void fly() {
        System.out.println("Fighter Plane fly at high heights");
    }

    void carryWeapon() {
        System.out.println("Fighter Plane carry Weapons");
    }
}

class Airport {
    void permit(AeroPlane ref) {
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}

public class CondancePermitPolymorphism {
    public static void main(String[] args) {
        cargoPlane cp = new cargoPlane();
        passengerPlane pp = new passengerPlane();
        fighterPlane fp = new fighterPlane();

        Airport a = new Airport();

        System.out.println("Cargo Plane Details : ");
        a.permit(cp);
        cp.carryGoods();// We Cannot have parent type reference to the specilaized methods of the child
        // class
        System.out.println("===========");

        System.out.println("Passenger Plane Details : ");
        a.permit(pp);
        pp.carryHuman();
        System.out.println("===========");

        System.out.println("Fighter Plane Details : ");
        a.permit(fp);
        fp.carryWeapon();
        System.out.println("===========");
    }
}
