
public class greet3 {

    int powercal() {
        int volt = 12;
        int current = 2;
        int power = volt * current;

        return power;
    }

    public static void main(String[] args) {
        greet3 obj = new greet3();

        int var = obj.powercal();

        System.out.println("The value of power is " + var);
    }
}
