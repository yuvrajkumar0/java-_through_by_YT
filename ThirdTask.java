public class ThirdTask extends Thread{
    public void run(){
        for(int i =1; i<=100; i++){
            System.out.printf("%d $ ",i );
        }
        System.out.printf(" \n %s $ task complate:",Thread.currentThread().getName());
    }
}