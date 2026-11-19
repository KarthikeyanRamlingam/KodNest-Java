
class heart {

    private String name;

    heart(String name) {
        this.name = name;
    }

    void display(String myname) {
        System.out.println(myname + " LOVE " + name);
    }
}

class me {

    private String name;

    me(String name) {
        this.name = name;
    }

    void love(heart like) {
        like.display(name);
    }
}

public class hasa2 {

    public static void main(String[] args) {
        me ME = new me("karthik");
        heart Heart = new heart("sheela");
        ME.love(Heart);
    }
}
