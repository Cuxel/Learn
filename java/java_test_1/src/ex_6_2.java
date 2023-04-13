public class ex_6_2 {
    public static void main(String[] args)
    {
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름 : " + s.name);
        System.out.println("총점 : " + s.getTotal());
        System.out.println("평균 : " + s.getAverage());

        Student ss = new Student("김철수", 1, 2, 100, 80, 54);
        System.out.println(ss.info());
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student() {}
    Student(String name, int ban, int no, int kor, int eng, int math)
    {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {return (kor + eng + math);}
    float getAverage()
    {
        int total = kor + eng + math;
        float avr = (float)total / 3.0f;
        avr += 0.05f;
        total = (int)(avr * 10);
        return ((float)total / 10);
    }
    String info()
    {
        String str = "";
        str += (this.name + ',' + this.ban + ',' + this.no + ',' + this.kor + ',' + this.eng + ',' + this.math + ',');
        str += getTotal();
        str += ("," + getAverage());
        return str;
    }
}