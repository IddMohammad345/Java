package Interview;

import java.util.HashMap;
import java.util.Map;

public class Sum_Of_Two_Element_EqualTo_Target {
    public static void main(String[] args) {
        int[] num={2,3,4,5,6,7,8,9,1,2,3,4,5};
        int target=9;
        Map<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<num.length;i++){
            int complement=target-num[i];
            if (map.containsKey(complement)){
                System.out.println(complement+", "+num[i]);
            }
            map.put(num[i],i);
        }
    }
}
