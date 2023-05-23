public class Main {
    int x;
    /**
     * This method calculates the equation of two integers.
     *  input1 This is the first int
     *  input2 This is the second int
     *  return int This returns the equation of input1 and input2
     */
    public Main(int y) {
        x = y;
    }

    public static void main(String[] args) {
        Main myObj = new Main(5);
        System.out.println(myObj.x);
    }
}