class University{
void course(){
System.out.println("Web design, Database, Data science");
}
void selectCourse(int number){
System.out.println("Number of courses selected = "+number); 
}
String courseList(){
return "Web design, Database";
}
String payment(float fee){
System.out.println("Total fee paid is "+fee);
return "Total fee paid";
}
}


class Student{
public static void main(String args[]){
University jntu=new University();
jntu.course();
jntu.selectCourse(2);
System.out.println("Corses selected: "+jntu.courseList());
System.out.println("Final status: "+jntu.payment(4055.56f));
}
}