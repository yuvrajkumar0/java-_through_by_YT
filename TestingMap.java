import java.util.Map;
import java.util.HashMap;

public class TestingMap{
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<> ();
         map.put("Yuvraj",95);
          map.put("Satyam",94);
           map.put("Vishal",93);
            map.put("Abhishek",92);
            
           // System.out.println(map.get());
            System.out.println(map);
            System.out.println(map.values());
            System.out.println(map.remove("Vishal"));
            System.out.println(map.size());
            for(String key : map.keySet()){
            System.out.printf("%s: %s \n ",key,map.get(key));
            }

    }
}