//Constructor with parameters

class Student{
int id;
float percentage;
Student(int id,float percentage){
this.id=id;
this.percentage=percentage;
}
void display(){
System.out.println("id = "+id);
System.out.println("Percentage = "+percentage);
}
}

class Constr{
public static void main(String args[]){
Student rahul=new Student(101,95.23f);
rahul.display();
Student shiva=new Student(102,94.32f);
shiva.display();
}
}