class University{
void course(){
System.out.println("Web design, Database, Data science");
}
void selectCourse(int number){
System.out.println("Number of courses selected = "+number); 
}
void courseName(String course1){
System.out.println("selected courses are: "+course1);
}
void courseName(String course1, String course2){
System.out.println("selected courses are: "+course1+" and "+course2);
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
jntu.courseName("Web design");
jntu.courseName("Web design","Database");
System.out.println("Total List of corses selected: "+jntu.courseList());
System.out.println("Final status: "+jntu.payment(4055.56f));
}
}