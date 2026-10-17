public class stateTest{
    public static void main(String[] args) throws InterruptedException{
        threadState t1 = new threadState();
        System.out.printf("\n Create the thread %s", t1.getState());
        t1.start();
        t1.join();
        System.out.printf("\n thread finished %s",t1.getState());

    }
}