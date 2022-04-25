package homework;

public class SuperVip {
    public int height;
    public String name;
    public String gender;
    public int  balance;

    public SuperVip(int height,String name , String gender,int balance){
        this.height=height;
        this.name=name;
        this.gender=gender;
        this.balance=balance;
    }
    public void getHeight(){
        System.out.println(name+"身高是："+height+"厘米");
    }

    public String getGender() {
        return gender;
    }
}
