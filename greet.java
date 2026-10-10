
public class greet {

    static int powercal(int volt, int current) {
        int power = volt * current;
        System.out.println("Power is low");
        return power;
    }

    public static void main(String[] args) {
        int var;
        var = powercal(12, 2);

        System.out.println("The value of power is " + var);
    }
}
