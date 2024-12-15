package HasARelation;

class OS {
    double vresion;
    String name;

    public OS(double vresion, String name) {
        super();
        this.vresion = vresion;
        this.name = name;
    }

    public double getVersion() {
        return vresion;
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
    OS os = new OS(7.8, "Rainbow");

    void hasCharger(Charger c) {
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
        System.out.println(c.getCompany());
        System.out.println(c.getVolts());
        System.out.println("==============");

        System.out.println("Details of OS");
        System.out.println(m.os.getName());
        System.out.println(m.os.getVersion());
        System.out.println("==============");
        m.hasCharger(c);
    }
}
