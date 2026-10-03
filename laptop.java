public class laptop{
    String brand;
    int ram;
    String processor;
    laptop(){
        brand = "Dell";
        ram = 16;
        processor = "Intel i5";
    }
    void showLaptopDetails(){
        System.out.println("Your laptop Informataion:");
        System.out.println("your laptop brand is " +brand);
         System.out.println("your ram of laptop " +ram+ " GB");
          System.out.println("your processor is " +processor);
    }
    public static void main(String args[]){
        laptop s = new laptop();
        s.showLaptopDetails();
    }
}