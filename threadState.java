public class threadState extends Thread{
    public void run(){
        try{
            Thread.sleep(4000);
            System.out.printf("From inside run %s",getState());
        }catch(InterruptedException e){
            throw new RuntimeException (e);
        }
    }
}