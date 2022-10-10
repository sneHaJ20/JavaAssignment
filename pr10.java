class square {
    protected double s1;

    public double getside1() {
        return s1;
    }

    public void setside1(double s1) {
        this.s1 = s1;
    }
    public void area1() {
        System.out.println("The area of square is : " + this.s1 * this.s1);
    }
}

class ComparableSquare extends square {
    protected double s2;

    public double getside2() {
        return s2;
    }

    public void setside2(double s2) {
        this.s2 = s2;
    }

    public void area2() {
        System.out.println();
        System.out.println("The ColorableSquare Area : ");
        System.out.println("The area of square is : " + this.s2 * this.s2);
    }
}

class test extends ComparableSquare {

    public void comp() {

        if (s1 == s2) {
            System.out.println();
            System.out.println("The Square and ColorableSquare is Same!!!!");
        } else {
            System.out.println("The Square and ColorableSquare is NOT Same!!!!");
        }
    }
}

public class pr10 {
    public static void main(String[] args) {
        test sh = new test();
        sh.setside1(12);
        sh.getside1();
        sh.area1();
        sh.setside2(12);
        sh.getside2();
        sh.area2();
        sh.comp();
    }
}
