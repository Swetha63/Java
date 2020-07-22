import java.util.Scanner;
class Condtn1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter x value:");
int x=sc.nextInt();
System.out.println("Enter y value:");
int y=sc.nextInt();
if(x==y){
System.out.println("x is equal to y");
}
else{
System.out.println("x is not equal to y");
}
}
}