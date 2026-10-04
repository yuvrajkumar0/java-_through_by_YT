import java.util.ArrayList;
import java.util.List;

public class TestingList{
    public static void main(String[] args){
        List strList = new ArrayList();
        strList.add("YUVRAJ ");
         strList.add("  KUMAR ");
          strList.add(" singh ");
        System.out.println(strList.get(0));
         System.out.println(strList.get(1));
          System.out.println(strList.get(2));
    }
}