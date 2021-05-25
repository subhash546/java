import java.util.*;
class Qroots546
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a,b,and c values");
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double d=b*b-4.0*a*c;
double r1,r2;
if(d<0)
{
System.out.println("roots are imaginary");
}
else if(d>0)
{
r1=(-b+Math.sqrt(d))/(2.0*a);
r2=(-b-Math.sqrt(d))/(2.0*a);
System.out.println("Roots are real and distinct");
System.out.println("Root1="+r1+" Root2="+r2);
}
else if (d==0)
{
r1=(-b)/(2.0*a);
r2=r1;
System.out.println("Roots are real and equal");
System.out.println("Root1="+r1+" Root2="+r2);
}
}
}