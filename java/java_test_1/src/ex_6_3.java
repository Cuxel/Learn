public class ex_6_3 {
    public static void main(String[] args)
    {
        System.out.println(getDistance(1, 1, 2, 2));
    }

    static double getDistance(int x, int y, int x1, int y1)
    {
        int diffX = x - x1;
        int diffY = y - y1;
        if (diffX < 0) {diffX *= -1;}
        if (diffY < 0) {diffY *= -1;}
        return Math.sqrt((diffX * diffX + diffY * diffY));
    }
}
