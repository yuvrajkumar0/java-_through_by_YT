public class testingEnum{
    public static void main(String [] args){
        TrafficLight color = TrafficLight.RED;
        color = TrafficLight.GREEN;
        color = TrafficLight.RED;

        Grade grade = Grade.valueOf("D");
        for(Grade value : Grade.values()){
            System.out.println(value);
        }
    }
}