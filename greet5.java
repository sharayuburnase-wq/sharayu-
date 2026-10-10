
public class greet5 {

    int powercal(int volt, int current) {
        int power = volt * current;
        return power;
    }

    public static void main(String[] args) {
        greet5 obj = new greet5();

        int var = obj.powercal(12, 2);

        System.out.println("The value of power is " + var);
    }
}

    
