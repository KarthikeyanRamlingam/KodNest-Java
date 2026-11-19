interface shape{
    abstract void disp();
    abstract void input();
}
class square implements shape
{
    @Override
    public void  disp()
    {
        System.out.println("sqaure has 4 side");
    }
    @Override
    public void input()
    {
        System.out.println("square has equal side");
    }
}
public class Interface
{
    public static void main(String[] args) {
        shape s=new square();
        s.disp();
        s.input();
    }
}