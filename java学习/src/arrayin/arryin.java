package arrayin;

class Person{
    public int age;
    public  double height;
    public void info(){
        System.out.println("我的年龄是"+age+", 我的身高是"+height);
    }
}


public class arryin {
    public static void main(String[] args) {


        Person[] students;
        students = new Person[2];

        Person zhang = new Person();
        zhang.age = 12;
        zhang.height = 161;
        Person song = new Person();
        song.age=13;
        song.age=163;
        students[0]=zhang;
        students[1]=song;
        zhang.info();
        students[0].info();


    }
}
