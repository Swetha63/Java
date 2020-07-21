import java.util.Scanner;
class Adtn{
void sum(int x,int y){
System.out.println("Integer sum1 = "+(x+y));
}
void sum(int x,int y,int z){
System.out.println("Integer sum2 = "+(x+y+z));
} 
}

class Poly_b{
public static void main(String args[]){
Adtn add=new Adtn();
Scanner sc=new Scanner(System.in);
System.out.println("Enter a: ");
int a=sc.nextInt();
System.out.println("Enter b: ");
int b=sc.nextInt();
add.sum(a,b);

System.out.println("Enter float c: ");
int c=sc.nextInt();
add.sum(a,b,c);
}
}