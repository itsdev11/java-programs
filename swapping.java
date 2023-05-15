import java.util.Scanner;
class swapping{
public static void main(String args[])
{
int a,b,c=0;
intch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number a");
a=sc.nextInt();

System.out.println("Enter the second number b");
b=sc.nextInt();


System.out.println("Enter your choice");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Number after swapping without using third variable");
a=a+b;
b=a-b;
a=a-b;
System.out.println( "a="+a );
System.out.println("b=" +b);
break;
case 2:
System.out.println("Number after swapping using third variable");
c=a;
a=b;
b=c;

System.out.println( "a="+a );
System.out.println("b=" +b);
break;

default:
{
System.out.println("Wrong choice");
}}}
}