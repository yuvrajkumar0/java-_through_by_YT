public class varArg{
    public static void main(String[] args){
        System.out.println(sum(4,5));
        System.out.println(sum(4,5,5,9,98));
        System.out.println(sum(4,544));
        System.out.println(sum(4,-1));
    }
    public static int sum(int first,int second, int ...a){
        int sum = first + second;
        for(int i : a){
            sum += i;
            
        }
         return sum;
    }
}