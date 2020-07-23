class Manager{
String name="John";
Manager(){
System.out.println("Manager name is "+name);
}
}

class Employee extends Manager{
String name="Kim";
Employee(){
System.out.println("Employee name is "+name);
}
void dd(){
System.out.println(super.name+" is manager for "+this.name);
}
}

class Superex{
public static void main(String args[]){
Employee x=new Employee();
x.dd();
}
}