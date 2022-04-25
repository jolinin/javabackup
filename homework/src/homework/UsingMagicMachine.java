package homework;

public class UsingMagicMachine
{
    public void Using ( SuperVip name,int changeHeight)
    {
        System.out.println("魔法机器：尊贵的超级VIP，感谢您体验魔法机器");
        System.out.println("魔法机器：超级VIP可以享受定制的增高或变矮服务");
        System.out.println("魔法机器：本次服务将收取费用："+changeHeight*10+"元");
    }
    public void Check( SuperVip name,int changeHeight)
    {

        if(name.balance>=10*changeHeight)
        {
            System.out.println("魔法机器：机器识别出您是：男生");
            System.out.println("魔法机器：机器将使您降低："+changeHeight+"cm");
            name.balance-=10*changeHeight;
            name.height-=changeHeight;
        }
        else{
            System.out.println("魔法机器：错误，余额不足，机器将停止工作");
        }
    }





}
