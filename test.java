import java.util.ArrayList;
import java.util.List;

public class test{
    public static void main(String[] args){
        List strList = new ArrayList();
        strList.add("YUVRAJ ");
        strList.add("KUMAR ");
          strList.add("singh ");
          strList.add(1,"marwadi " );
       for(int i=0; i<strList.size(); i++){
        System.out.println(strList.get(i));
       }
    }
}