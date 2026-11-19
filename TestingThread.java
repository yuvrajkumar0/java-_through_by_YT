public class TestingThread{
    public static void main(String [] args){
        firstThread t1 = new firstThread();
        t1.start();

        secondThread t2 = new secondThread();
        t2.start();
    }
}