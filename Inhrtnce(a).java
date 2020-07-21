//Multiple inheritance

import java.util.Scanner;
class Electronics{
String a,b;
Scanner sc=new Scanner(System.in);
void circuit(){
System.out.println("Different circuit types are as below:");
a=sc.next();
b=sc.next();
}
}

class Mobile extends Electronics{
String c,d;
void charger(){
System.out.println("Charger types:");
c=sc.next();
d=sc.next();
}
void add(){
System.out.println(c+"Charger "+" works for "+a+" circuit.");
System.out.println(d+"Charger "+" works for "+b+" circuit.");
}
}

class Oppo extends Mobile{
int num;
void prop(){
num=sc.nextInt();
System.out.println("As Oppo mobile is a "+c+", it works on "+a+" circuit and it has around "+num+" other features.");
}
}

class Inheritance_a{
public static void main(String args[]){
Oppo ih=new Oppo();
ih.circuit();
ih.charger();
ih.add();
ih.prop();
}
}