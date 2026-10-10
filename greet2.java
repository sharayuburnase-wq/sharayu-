
public class greet2 {

    void powercal() {
        int volt = 12;
        int current = 2;
        int power = volt * current;

        System.out.println("The value of power is " + power);
    }

    public static void main(String[] args) {
        greet2 obj = new greet2();
        obj.powercal();
    }
}
