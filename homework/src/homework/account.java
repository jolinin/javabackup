package homework;

public class account {
    int balance=0;
    public void  Recharge(SuperVip name,int money)
    {
        name.balance=name.balance+money;
    }

    public  void checkMoney(SuperVip name)
    {
        System.out.println("小明"+"查看账户");
        System.out.println("小明"+"查看账户余额："+name.balance+"元");
    }


}
