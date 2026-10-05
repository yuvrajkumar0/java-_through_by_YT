import java.util.Queue;
import java.util.LinkedList;
public class TestingQueue{
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);
        queue.add(5);
        //System.out.println(queue.peek());
       // System.out.println(queue.element());
       // System.out.println(queue.remove());
        //System.out.println(queue);
         //System.out.println(queue.poll());
           
          /* System.out.println(queue.remove());
           System.out.println(queue.remove());
           System.out.println(queue.remove());
           */
          // System.out.println(queue);
           for ( int element : queue) {
            System.out.println(element);
           }
           
    }
}