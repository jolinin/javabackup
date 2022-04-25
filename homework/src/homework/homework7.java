package homework;

public class homework7 {
    public static void main(String[] args) {

        SuperVip ming=new SuperVip(192,"小明","male",0);
        System.out.println("######################");
        System.out.println("老板：欢迎光临魔法屋！");
        System.out.println("老板：好久不见，有什么能帮您的吗？");
        System.out.println("小明：我想要变矮一点点，请问你们提供变矮服务吗？");
        System.out.println("老板：您真幸运，我们刚推出了超级VIP会员！");
        System.out.println("老板：超级VIP会员，可变高，可变矮，任君选择。");
        System.out.println("老板：注册就送50元账户充值红包两个。");
        System.out.println("小明：变矮多少钱？");
        System.out.println("老板：高矮一个价：男生每厘米10元，女生每厘米5元。");
        System.out.println("小明：有点贵啊，试试吧，反正送了100元！，我就减10厘米！");
        System.out.println("==========");
        System.out.println("进入魔法屋前，小明的身高是："+ming.height);
        System.out.println("==========");
        System.out.println("小明使用魔法机器。。。");
        System.out.println("********************");

        UsingMagicMachine siu=new UsingMagicMachine();
        siu.Using(ming,10);
        siu.Check(ming,10);

        System.out.println("=========");
        System.out.println("紧急呼叫老板，魔法机里卡人了。。。");
        System.out.println("救命啊！！！！！！我被卡在机器里了！！！");
        System.out.println("=========");
        System.out.println("老板打开机器，把小明拽出来。");
        System.out.println("小明：吓死我了，什么破机器啊这是。");
        System.out.println("老板拿出尺子量了量");
        System.out.println("小明的身高是"+ming.height+"cm");
        System.out.println("老板：还好身高没变，实在是抱歉。。。");
        System.out.println("老板：麻烦您查看一下账户余额，谢谢。");
        System.out.println("小明：好。");

        account x= new account();
        x.checkMoney(ming);

        System.out.println("老板：啊，没钱你变个啥啊？");
        System.out.println("小明：哦，我忘记把红包充值进去了。。。");
        System.out.println("老板：原来是这样，不好意思，让你受惊了。");
        System.out.println("老板：为了表示歉意，我在送你5个50元红包吧。");
        System.out.println("老板：这次不要再忘了充值啊。");
        System.out.println("小明：谢谢了老板。。。");
        System.out.println("小明往SVIP账户上充值了350元。。。。。。");
        System.out.println("==========");

        x.Recharge(ming,350);
        x.checkMoney(ming);

        System.out.println("==========");

        System.out.println("小明使用魔法机器。。。");
        System.out.println("********************");

        siu.Using(ming,10);
        siu.Check(ming,10);

        System.out.println("********************");
        System.out.println("现在，小明的身高是："+ming.height+"cm");
        System.out.println("========");

        x.checkMoney(ming);

        System.out.println("小明：哈哈哈。。。今天真是太开心了，还赚了250元。");
        System.out.println("老板：欢迎下次光临，不要忘了多介绍几个同学来啊，我给打折。哈哈哈哈。。。。");

    }
}
