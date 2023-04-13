public class ex_6_4 {
    public static void main(String[] args)
    {
        MyPoint p = new MyPoint(1, 1);
        System.out.println(p.getDistance(2, 2));
    }
}

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x, int y)
    {
        int diffX = x - this.x;
        int diffY = y - this.y;
        if (diffX < 0) {diffX *= -1;}
        if (diffY < 0) {diffY *= -1;}
        return Math.sqrt((diffX * diffX + diffY * diffY));
    }
}