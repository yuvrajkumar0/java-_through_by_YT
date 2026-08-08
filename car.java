public class car{
int noOfWheels;
String color;
float maxSpeed;
float  currentFuel;
 
int noOfSeats;
public void start(){
     if(currentFuel==0){
        System.out.println("Car is out of fuel");
    }else if(currentFuel<5){
        System.out.println("This car is reserved mode, please refuel");
          
    }else{
        System.out.println("Car is start ... bruhhh: ");
    }
}
public void drive(){
     currentFuel--;
     System.out.print("car is driving: ");
    
}
public void addFuel(float fuel){
    currentFuel += fuel;
}
public float currentFuel(){
    return currentFuel;
}
}