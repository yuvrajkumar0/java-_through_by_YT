public class VarArgs{


    public  static void main(String args[]){
        System.out.println(concatenate("Yuvraj"));
        System.out.println(concatenate("Kumar"));
        System.out.println(concatenate("i", "am","Study","in","Marwadi University"));
        

    }

    public static String concatenate(String... strs){
    StringBuilder sb = new StringBuilder();
    for(String str: strs){
        sb.append(str).append(" ");
    }
    return sb.toString();
  }
}