package HasARelation;

class OS {
    double version;
    String name;

    public OS(double version, String name) {
        super();
        this.version = version;
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }
}

class Charger {
    String company;
    int volts;

    public Charger(String company, int volts) {
        super();
        this.company = company;
        this.volts = volts;
    }

    public String getCompany() {
        return company;
    }

    public int getVolts() {
        return volts;
    }
}

class Mobile {
    // Composition Relationship
    OS os = new OS(7.8, "Rainbow");

    void hasCharger(Charger c) {
        // Aggregation Relationship
        System.out.println(c.getCompany());
        System.out.println(c.getVolts());
    }
}

public class EnClosing {
    public static void main(String[] args) {
        Charger c = new Charger("Samsung", 100);
        Mobile m = new Mobile();

        System.out.println("Details of OS");
        System.out.println(m.os.getName());
        System.out.println(m.os.getVersion());
        System.out.println("==============");
        m.hasCharger(c);
        System.out.println("==============");

        // killing the object
        m = null;

        System.out.println("Details of Charger");
        System.out.println(c.getCompany());// Works fine
        System.out.println(c.getVolts());// Works fine
        System.out.println("==============");

        System.out.println("Details of OS");
        System.out.println(m.os.getName());// Throws NullPointerException
        System.out.println(m.os.getVersion());// Throws NullPointerException
        System.out.println("==============");
        m.hasCharger(c);
    }
}
