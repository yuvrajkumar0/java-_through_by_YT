public class neededOfMulthreading{
    public static void main(String [] args){
        long startTime = System.currentTimeMillis();
        for(int i =1; i<=100; i++){
            System.out.printf("%d@ ",i );
        }
        System.out.println(" \n with @ Number:");
        for(int i =1; i<=100; i++){
            System.out.printf("%d# ",i );
        }
        
        System.out.println(" \n with # Number:");
        for(int i =1; i<=100; i++){
            System.out.printf("%d$ ",i );
        }
        System.out.println(" \n with $ Number:");
        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken : %d",(endTime-startTime));
    }
}