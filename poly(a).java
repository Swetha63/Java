import java.util.Scanner;
class Dec{
void sum(int x,float y){
System.out.println("Decimal sum1 = "+(x+y));
}
void sum(float x,int y){
System.out.println("Decimal sum2 = "+(x+y));
} 
}

class Poly_a{
public static void main(String args[]){
Dec add=new Dec();
Scanner sc=new Scanner(System.in);
System.out.println("Enter int a: ");
int a=sc.nextInt();
System.out.println("Enter float b: ");
float b=sc.nextFloat();
add.sum(a,b);

System.out.println("Enter float c: ");
float c=sc.nextFloat();
System.out.println("Enter int d: ");
int d=sc.nextInt();
add.sum(c,d);
}
}