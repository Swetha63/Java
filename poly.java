
import java.util.Scanner;
class Cal{
void sum(int x,int y){
System.out.println("Integer sum = "+(x+y));
}
void sum(float x,float y){
System.out.println("Decimal sum = "+(x+y));
} 
}

class Poly{
public static void main(String args[]){
Cal add=new Cal();
Scanner sc=new Scanner(System.in);
System.out.println("Enter a: ");
int a=sc.nextInt();
System.out.println("Enter b: ");
int b=sc.nextInt();
add.sum(a,b);

System.out.println("Enter c: ");
float c=sc.nextFloat();
System.out.println("Enter d: ");
float d=sc.nextFloat();
add.sum(c,d);
}
}