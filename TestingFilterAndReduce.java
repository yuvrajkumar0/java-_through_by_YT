import java.util.List;
public class TestingFilterAndReduce{
    public static void main(String args[]){
        List<String> fruits = List.of("Apple","papaya","mango","cherry");
        System.out.println(fruits.size());
        System.out.println("Printing Fruits Normally:");
        for(String fruit: fruits){
           System.out.println(fruit); 
        }
        System.out.println("Printing Fruits using Streams");
        fruits.stream()
        .filter(fruit -> fruit.endsWith("e"))
        .forEach(fruit-> System.out.println(fruit));

    }
}