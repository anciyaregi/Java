public class Main {
    public static void main(String[] args) {
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;
        System.out.println(sum3);

        int sub = 500 - 250;
        System.out.println(sub);  //arithmetic operator

        int x = 10;
        x += 5;
        System.out.println(x);  //assignment operator

        int a = 5;
        int b = 5;
        System.out.println(a != b);

        int c = 5;
        int d = 3;  //comparison operator
        System.out.println(c > d); // returns true, because 5 is higher than 3

        int e = 5;  //logical operator
        System.out.println(e > 3 && e < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
        System.out.println(e > 6 || e < 5 );
    }
}
