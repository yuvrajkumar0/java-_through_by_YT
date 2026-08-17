class studentt{
    String name;
    int age;
    String cource;
    
}
public class student{
    public static void main(String [] args){
        studentt s1 = new studentt();
         studentt s2 = new studentt();
        s1.name="yuvraj";
        s1.age = 21;
        s2.name="satyam";
        s2.age=24;
        System.out.println("Name: " + s1.name);
          System.out.println("Age: " + s1.age);
           System.out.println("Name: " + s2.name);
          System.out.println("Age: "+ s2.age);

    }
}