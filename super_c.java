class Manager{
String name;
Manager(String name){
System.out.println("Manager name is "+name);
}
}

class Employee extends Manager{
String name;
Employee(String name){
super("John");
this.name=name;
System.out.println("Employee name is "+name);
}
}

class Super3{
public static void main(String args[]){
Employee x=new Employee("kim");
}
}