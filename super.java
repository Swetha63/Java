class Parent{
Parent(){
System.out.println("Parent age is 52");
}
}

class Child extends Parent{
Child(){
System.out.println("Child age is 24");
}
}

class Super{
public static void main(String args[]){
Child x=new Child();
}
}