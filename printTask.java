public class printTask implements Runnable{
    public void run(){
         for(int i =1; i<=100; i++){
            System.out.printf("%d %c ",i,targetChar);
        }
        System.out.printf(" \n %s %c  task complate:",Thread.currentThread().getName(),targetChar);
    }

    private final char targetChar;
   public printTask(char targetChar){
    this.targetChar = targetChar; 
   }


}
