class bikke{
    String brand;
    String model;
    int price;
   void  displayDetails(){
        System.out.println("my first bike: " + brand );
        System.out.println("my bike model: " + model );
        System.out.println("my bike price: " + price);
        System.out.println("my second bike: " + brand );
        System.out.println("my bike model: " + model );
        System.out.println("my bike price: " + price);
    }
}
public class bike{
    public static void main(String [] args){
        bikke b1 = new bikke();
        bikke  b2 = new bikke();
        b1.brand ="Bullet";
        b1.model = "new";
        b1.price = 99000;

        b2.brand = "hero";
        b2.model = "old"; 
        b2.price = 79000;

        b1.displayDetails();
        b2.displayDetails();

    }
}