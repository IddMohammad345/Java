package Interview;

public class Reverse_String_Without_Inbuilt_Functions {
    public static void main(String[] args) {
        String str="IddMohammad";
        char[] arr = str.toCharArray();
        int left=0;
        int right=str.length()-1;
        while (left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println(arr);
    }
}
