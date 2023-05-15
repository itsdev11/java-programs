import java.util.Scanner;
interface a{
    int roll=123;
    void display();
}
interface b{
    String name="dev";
    void disp();
}
public class c implements a,b{
    public void display(){
    System.out.println(+roll);
}
public void disp(){
    System.out.println(+name);
}
public static void main(String args[])
{
    c obj=new c();
     obj.display();
     obj.disp();
    }
}