package exercise.exercise_0713;


/*
大整数排序
 */
/*
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            BigInteger[] nums = new BigInteger[n];
            for(int i=0; i<n; i++){
                nums[i] = in.nextBigInteger();
            }
            Arrays.sort(nums);
            for(int i=0; i<n; i++){
                System.out.println(nums[i]);
            }
        }
    }
}
*/

/*
字母统计
 */

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int[] count = new int[26];
            String str = in.nextLine();
            for(int i=0,len=str.length(); i<len; i++){
                int j = (int)str.charAt(i)-'A';
                if(0<=j && j<26){
                    count[j]++;
                }
            }
            for(int k=0; k<26; k++){
                System.out.println((char)(k+'A')+":"+count[k]);
            }
        }
    }
}*/

/*
进制转换
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            System.out.println(new BigInteger(in.next().substring(2),16).toString(10));
        }
    }
}