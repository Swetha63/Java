//Constructor with parameters

class Buyer{
int num;
float bill;
Buyer(int num,float bill){
this.num=num;
this.bill=bill;
this.receipt();
}
void receipt(){
System.out.println("Numbers of itesma ordered = "+num);
System.out.println("Bill amount = "+bill);
}
}

class Constr_a{
public static void main(String args[]){
Buyer jeff=new Buyer(2,250.65f);
Buyer kim=new Buyer(4,564.68f);
}
}