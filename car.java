public class car extends vehicle{
    public void service(){
        super.service();
        System.out.println("here is also provide god service:");
    }
    public static void main(String [] args){
        car c = new car();
        c.service();
    }
}