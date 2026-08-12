class math{
    int m(short a ,int b){
        return a+b;
    }
    int m(int a,int b){
        return a+b;
    }
}
public class Methodampig{
    public static void main(String[] args) {
        math m1=new math();
        int res =m1.m(10,20);
        System.out.println(res);
        //int res1=m1.m(10, 10);
        //System.out.println(res1);
    }
}