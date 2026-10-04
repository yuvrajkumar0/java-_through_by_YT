import java.util.ArrayList;
import java.util.List;
public class removeTestList{
    public static void main(String [] args){
        ArrayList strList = new ArrayList();
        strList.add("Marwadi ");
        strList.add("University ");
        strList.add("rajkot");

        strList.remove(1);
         if(strList.contains("Marwadi ")){
            System.out.println("Yes it is avalibale: ");
            System.out.println(strList.indexOf("Marwadi "));
         }
        for(int i =0; i<strList.size(); i++){
            System.out.println(strList.get(i));
        }
    }
}