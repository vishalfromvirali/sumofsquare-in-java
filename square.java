import java.util.*;
class square{
    public static void main(String[]args){
        int[] num={1,2,4,3,5};
        int sum1=0;
        for(int i=0;i<num.length;i++){
            int square=num[i]*10;
            sum1 +=square;
            
        }
        System.out.println(sum1);
    }

}