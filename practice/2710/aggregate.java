
class os {

    os() {
        System.out.println("Os is installed");
    }

    void checkos() {
        System.out.println("Os is still execute");
    }
}

class charger {

    public charger() {
        System.out.println("charger created");
    }

    void getCharger() {
        System.out.println("used for charging");
    }
}

class mobile {

    os o = new os();

    mobile() {
        System.out.println("Mbile created");
    }

    void hasaA(charger c) {
        System.out.println("charger acquire");
    }
}

public class aggregate {

    public static void main(String[] args) {
        mobile m = new mobile();
        charger c = new charger();
        m.hasaA(c);
        m.o.checkos();

        c.getCharger();
        m = null;
        c.getCharger();
        m.o.checkos();
    }
}
