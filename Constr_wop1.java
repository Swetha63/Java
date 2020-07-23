//Constructor without parameters

class Common{
String txt;
int num;
Common(){
txt="Jntu university";
num=12;
}
void details(){
System.out.println("College name= "+txt);
System.out.println("Number of branches="+num);
}
}

class Constr_b{
public static void main(String args[]){
Common dt=new Common();
dt.details();
}
}