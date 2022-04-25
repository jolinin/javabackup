package homework;

public class Person {
    int height;
    String name;

    Person(String Name, int Height) {
        name = Name;
        height = Height;
    }

    public void taller(int length)
    {
        height += length;
    }



    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }
}