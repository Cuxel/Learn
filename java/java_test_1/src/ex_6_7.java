public class ex_6_7 {
    static boolean isNumber(String str)
    {
        char c;
        if(str.length() == 0 || str == null) return false;
        for(int i = 0; i < str.length(); i++)
        {
            c = str.charAt(i);
            if(c <= '0' || c >= '9') {return false;}
        }
        return true;
    }

    public static void main(String[] args)
    {
        String str = "123";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));

        str = "123o";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));
    }
}
