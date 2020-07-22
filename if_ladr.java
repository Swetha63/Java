import java.util.Scanner;
class Condtn2{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter age value:");
int age=sc.nextInt();

if(age>=21)
System.out.println("Eligible for drinking");

else if(age>=18)
System.out.println("Eligible for smoking");

else if(age>=16)
System.out.println("Eligible to drive");

else if(age==14)
System.out.println("Can drive with supervision");

else
System.out.println("No valid comment");
}
}