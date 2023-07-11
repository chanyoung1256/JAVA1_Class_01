package Class_01;

class Car
{
    private  String color;
    private int speed;

    public Car() {

    }

    void UpSpeed(int value)
    {
        speed = speed + value;
    }

    void downSpeed(int value)
    {
        speed = speed - value;
    }

    String getColor()
    {
        return color;
    }
    int getSpeed()
    {
        return speed;
    }

    void setColor(String color)
    {
        this.color = color;
    }

    void setSpeed(int speed)
    {
        this.speed = speed;
    }

    Car(String color, int speed)
    {
        this.color = color;
        this.speed = speed;
    }
}

public class CarTest {
    public static void main(String[] args)
    {
        Car myCar1 = new Car();
        Car myCar2 = new Car("파랑", 30);
        myCar1.setColor("빨강");
        myCar1.setSpeed(0);


        System.out.println(myCar1.getColor());
        System.out.println(myCar1.getSpeed());
    }
}
