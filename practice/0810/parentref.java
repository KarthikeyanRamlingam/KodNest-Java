
class parent {

    public void display() {
        System.out.println("parent class display");
    }
    void disp2()
    {
        
    }
}

class child1 extends parent {
    @Override
    public void display() {
        System.out.println("child class display");
    }
    void disp1() {
        System.out.println("child class special");
    }
}

public class parentref {

    public static void main(String[] args) {
        parent ref = new child1();
        ref.display();
        ((child1) ref).disp1();
    }
}
