package Abstraction;

abstract class Plane {
    void takeOff() {
        System.out.println("Plane Took Off");
    }

    abstract void fly();

    abstract void land();
}

class cargoPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Cargo Plane fly at low heights");
    }

    @Override
    void land() {
        System.out.println("Cargo Plane has Landed");
    }
}

class passengerPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Passenger Plane fly at low heights");
    }

    @Override
    void land() {
        System.out.println("Passenger Plane has Landed");
    }
}

class fighterPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Fighter Plane fly at high heights");
    }

    @Override
    void land() {
        System.out.println("Fighter Plane has Landed");
    }
}

class Airport {
    void permit(Plane ref) {
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}

public class AbtractionProgram {
    public static void main(String[] args) {
        cargoPlane cp = new cargoPlane();
        passengerPlane pp = new passengerPlane();
        fighterPlane fp = new fighterPlane();

        Airport a = new Airport();

        a.permit(fp);
        System.out.println("===============");
        a.permit(pp);
        System.out.println("===============");
        a.permit(cp);
    }
}
