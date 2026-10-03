public class customber{
    String name;
    int account;
    int balance;
    String type;
    customber(){
        name = "Yuvraj";
        account = 123456789;
        balance = 5000;
        type = "savings";

    }
    void bankAccount(){
        System.out.println("Account Holder name is: " + name);
        System.out.println("Account Number is: " + account);
        System.out.println("Your Account blance is:  : " + balance);
        System.out.println("Your account type is: " + type);
    }
    public static void main(String args[]){
        customber c = new customber();
        c.bankAccount();
    }
}