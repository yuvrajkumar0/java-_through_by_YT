public class UpdaterThread extends Thread{
    private final Counter counter;
    public UpdaterThread(Counter counter){
        this.counter = counter;
        
    }
    public void run(){
        for(int i = 0; i<1000; i++){
            counter.increment();
        }
    }
}