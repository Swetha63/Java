class Parent_a{
Parent_a(int age){
System.out.println("parent age is "+age);
}
}

class Child_a extends Parent_a{
Child_a(int age){
super(65);
System.out.println("child age is "+age);
}
}

class Super1{
public static void main(String args[]){
Child_a x=new Child_a(26);
}
}