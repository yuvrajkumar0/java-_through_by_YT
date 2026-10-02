public class calculater{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
    public static void main(String [] args){
        calculater calc = new calculater();
        System.out.println("your sum is: "+ calc.add(5,6));
        System.out.println("your sum is: "+ calc.add(4,5,6));
        System.out.println("your sum is: "+ calc.add(5.25,6.36));
    }
}