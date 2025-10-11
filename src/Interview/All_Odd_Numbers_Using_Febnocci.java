package Interview;

public class All_Odd_Numbers_Using_Febnocci {
    public static void main(String[] args) {
        int n=10;
        int first=0;
        int second=1;
        for (int i=0;i<=n;i++){
            int next=first+second;
            if (next%2!=0){
                System.out.println(next);
            }
            first=second;
            second=next;
        }
    }
}
