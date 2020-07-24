/*
class DoWhile{
public static void main(String args[]){
int age=24;
do{
System.out.println("Age = "+age+"; "+"Eligible to vote");
age--;
}
while(age>=18);
}
}
*/

import java.util.Scanner;
class DoWhile{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
do{
System.out.println("Age = "+age+"; "+"Eligible to vote");
age--;
}
while(age<18);
}
}