public class  exSetPriority{
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
       
        firstTask t1 = new firstTask();
          t1.setPriority(Thread.MIN_PRIORITY);
        secondTask t2 = new secondTask();
           t2.setPriority(Thread.NORM_PRIORITY);
        ThirdTask t3 = new ThirdTask();
         t3.setPriority(Thread.MAX_PRIORITY);
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