import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestingCollections{
    public static void main(String[] args){
        List<Integer> numberList = new ArrayList();
        numberList.add(5);
        numberList.add(7);
        numberList.add(11);
        numberList.add(3);
        
        Collections.sort(numberList);
        System.out.println("Atfer sort list: "+ numberList);

        Collections.reverse(numberList);
        System.out.println("Atfer  reverse List: "+ numberList);
      /*  List<Integer> unmodifiable = Collections.unmodifiableList(numberList);
        unmodifiable.add(85);
        */

        
    }
}