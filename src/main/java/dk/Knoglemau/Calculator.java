package dk.Knoglemau;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(String regnestyk) {
int sum = 0;
    for(String s : regnestyk.split(",")){
        sum += Integer.parseInt(s.trim());
    }
        return sum;
    }


    public int add(int[]addCal) {
        int result = 0;
        for (int i = 0; i < addCal.length; i++) {
            result += addCal[i];
        }
        return result;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        return a / b;
    }
}
