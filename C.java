import java.util.Scanner;
interface AZ{
    int roll=123;
    void display();
}
interface BZ{
    String name="dev";
    void disp();
}
public class C implements AZ,BZ{
    public void display(){
    System.out.println(+roll);
}
public void disp(){
    System.out.println(name);
}
public static void main(String args[])
{
    C obj=new C();
     obj.display();
     obj.disp();
    }
}