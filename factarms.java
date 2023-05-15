import java.util.Scanner;
interface Factorial{
void fact();
}
interface Armstrong{
    void arms();
}
public class factarm implements Factorial, Armstrong{
   
    
    int res=0,r,n,i=1;
    double f=1;
  
    Scanner sc=new Scanner(System.in);
    
  int   num=sc.nextInt();
     public void fact()
     
     {
        while(i<=num)
        {
            f*=i;
            i++;
        }
        System.out.println("factorial is " +f);
     }
    public void arms()
    {
        n=num;
	while(n>0){
	
		r=n%10;
		res=res+(r*r*r);
		n=n/10;
			}
            if(num==res){
            System.out.println("Number is armstrong");
    }
    else{
        System.out.println("number is not armstrong");
    }
    }
public static void main(String args[]){
      System.out.println("Enter the number ");
    CD no=new CD();
    no.fact();
    no.arms();
    } 
}