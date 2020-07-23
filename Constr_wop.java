//Constructor without parameters

class Student1{
int num;
float fee;
Student1(){
num=8;
fee=2055.65f;
}
void details(){
System.out.println("number of courses= "+num);
System.out.println("fee per course= "+fee);
}
}

class Constr2{
public static void main(String args[]){
Student1 john=new Student1();
john.details();
}
}