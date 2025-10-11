package Interview;

public class All_Even_Numbers_With_Factorial {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                int fact = 1;
                int j = i; 

                while (j > 1) {
                    fact *= j;
                    j--;
                }

                System.out.println("Even number: " + i + ", Factorial: " + fact);
            }
        }
    }
}
