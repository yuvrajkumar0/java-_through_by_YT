public class ExtendingThread{
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
       
        firstTask t1 = new firstTask();
         
        secondTask t2 = new secondTask();
            
        ThirdTask t3 = new ThirdTask();
          
         System.out.println("\n Starting First Thread");
        t1.start();
         System.out.println("\n Starting Second Thread");
        t2.start();
        System.out.println("\n Starting Third Thread");
        t3.start();
 

    long endTime = System.currentTimeMillis();
    System.out.printf("%s Total time taken %d", Thread.currentThread().getName(), (endTime-startTime));
    }
}