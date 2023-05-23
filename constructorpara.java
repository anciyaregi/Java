
public class Main {
    int Number;
    String Name;

    public Main(int number, String name) {
        Number = number;
        Name = name;
    }

    public static void main(String[] args) {
        Main myCar = new Main(6382, "Swift Dzire");
        System.out.println(myCar.Number + " " + myCar.Name);
    }
}
