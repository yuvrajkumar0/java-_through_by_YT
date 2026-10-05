import java.util.Set;
import java.util.HashSet;
public class testingSet{
    public static void main(String[] args){
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Yuvraj"));
        System.out.println(names.add("Kumar"));
        System.out.println(names.add("Marwadi"));
        System.out.println(names.add("Yuvraj"));
        System.out.println(names.size());
        System.out.println(names.remove("Yuvraj"));
        System.out.println(names.remove("Kumar"));
         System.out.println(names.remove("Marwadi"));
    }
}