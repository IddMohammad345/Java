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
        System.out.println("=============================================");
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        for (int a:arr){
            if (a%2==0){
                int fact=1;
                for (int i=a;i>1;i--){
                    fact=fact*i;
                }
                System.out.println("Even number: " + a + ", Factorial: " + fact);
            }
        }
    }
}
