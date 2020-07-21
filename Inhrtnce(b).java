//Hierarchical Inheritance

import java.util.Scanner;
class Car{
String a;
Scanner sc=new Scanner(System.in);
void start(){
System.out.println("Enter start var");
a=sc.next();
System.out.println("Car starts with "+a);
}
}

class Audi extends Car{
int b;
String c;
void audiFeature(){
System.out.println("Enter option var");
b=sc.nextInt();
System.out.println("Enter 2nd start var");
c=sc.next();
System.out.println("Audi starts in "+b+" ways ,by "+a+" and by "+c);
}
}

class Bmw extends Car{
String d;
void bmwFeature(){
System.out.println("Enter car type for bmw");
d=sc.next();
System.out.println("Bmw is a "+d+" which starts with a "+a);
}
}

class Inheritance_b{
public static void main(String args[]){
Audi au=new Audi();
Bmw bm=new Bmw();
au.start();
au.audiFeature();
bm.start();
bm.bmwFeature();
}
}