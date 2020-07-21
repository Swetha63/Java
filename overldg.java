class Restuarant{
void menu(){
System.out.println("Idly, Dosa, Wada");
}
void order(String order1){
System.out.println("Order placed is "+order1);
}
void order(String order1, String order2){
System.out.println("Order placed is "+order1+", "+order2);
}
void order(String order1, String order2, String order3){
System.out.println("Order placed is "+order1+", "+order2+" and "+order3);
}
String serveFood(){
return "Idly,Dosa, Wada";
}
String payBill(int amount){
System.out.println("Bill amount paid is "+amount);
return "Bill Paid";
}
}


class Customer{
public static void main(String args[]){
Restuarant ohris=new Restuarant();
ohris.menu();
ohris.order("Idly");
ohris.order("Idly","Dosa");
ohris.order("Idly","Dosa","Wada");
String plate=ohris.serveFood();
System.out.println("Food served is "+plate);
String finalBill=ohris.payBill(299);
System.out.println("Final status: "+finalBill);
}
}