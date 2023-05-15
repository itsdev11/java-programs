import java.util.*;
class ATM
{
int acNo=1250005,Bal=20000,Dep, withdraw,pin=2589;
//char name[]={'D','e','v'};
public static void main(String[]args)
{
int no,p,nawa;
ATM A1=new ATM();
Scanner s=new Scanner(System.in);
System.out.println("welcome to the ATM");
System.out.println("enter the pin");
p=s.nextInt();

if(p!=A1.pin)
{
System.out.println("pin no is incorrect");
System.exit(0);
}
else
{

System.out.println("pin no is correct");
System.out.println("login successfully");


System.out.println("Welcome to the ATM" + "your A/C NO is " + A1.acNo);
}


System.out.println("Press 1: to check your balance");
System.out.println("Press 2: to deposite the amount");
System.out.println("Press 3: to withdraw the amount");
System.out.println("Press 4: to rest the pin no");
System.out.println("enter the no");
 no=s.nextInt();

switch(no)
{
case 1:
System.out.println("balance="+A1.Bal);
break;
case 2:
System.out.println("Enter the amount youb want to deposit");
A1.Dep=s.nextInt();
A1.Bal=A1.Bal+A1.Dep;
System.out.println("your current balance is"+A1.Bal);
break;
case 3:
System.out.println("Enter the amount youb want to withdraw");
A1.withdraw=s.nextInt();
if(A1.Bal>=A1.withdraw)
{
A1.Bal=A1.Bal-A1.withdraw;

System.out.println("your current balance is"+A1.Bal);
}
else
{
System.out.println("low balance!");
}

break;
case 4:
System.out.println("enter the old pin you wanna reset");
no=s.nextInt();
if(A1.pin==no)
{
System.out.println("enter new pin");

nawa=s.nextInt();
A1.pin=nawa;
System.out.println("pin successfully changed");
}
else
{
System.out.println("please enter the correct pin");}

break;

}

}}