class emp{
    String name;
    int salary;
    emp(){
        name = "yuvraj";
        salary = 50000;
    }
}
public class employee{
    public static void main(String args[]){
        emp sal = new emp();
        System.out.println(sal.name);
        System.out.print(sal.salary);
    }
}