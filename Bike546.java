import java.util.*;
class Bike546
{
public static void main(String args[])
{
System.out.println("how many Bike Racers are there?");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
double a[]=new double [n];
double sum=0.0, avg;
System.out.println("Enter speed of "+n+" Bike racer");
for (int i=0; i<n;i++)
{
a[i]=sc.nextDouble();
sum=sum+a[i];
}
avg=sum/n;
System.out.println("Average speed is "+avg);
for(int i=0; i<n;i++)
{
if (a[i]>avg)
{
System.out.println("Bike Racer"+ (i+1)+" is Qualified");
System.out.println("Speed is "+ a[i]);
}
}
}
}