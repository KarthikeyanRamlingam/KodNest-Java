class Stud { 
    String name;
    int age;
    double height;

    void set(String name,int age,double height){
        this.name=name;
        this.age=age;
        this.height=height;

    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("age: "+age);
        System.out.println("Height: "+height);
    }
}
    public class thiskeyword{
        public static void main(String[] args) {
         Stud s1=new Stud();
         s1.set("raja",18,5.9);
         s1.display();   
        }
    }
