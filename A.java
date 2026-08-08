public class A{
    int a; 
    String name;
    A()
    {
        a=7156; name = "yuvraj";
    }
    void show()
    {
        System.out.print(a + " " + name);
    }
   
    public static void main(String [] args){
           A ref = new A(); 
           ref.show();
        }
    }
