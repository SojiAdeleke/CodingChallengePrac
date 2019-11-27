/* Given an array of integers, return a new array such that each element at index i of the 
new array is the product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
If our input was [3, 2, 1], the expected output would be [2, 3, 6].
Follow-up: what if you can't use division? */
import java.util.*;
class Main {

    public static int[] mult(int[] arr){
        int[] ret = new int[arr.length];
        for(int i=0; i < ret.length; i++){ret[i] = 1;} //initialize everthing to 1

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(j != i){
                    ret[j] *= arr[i];
                }
            }
        }
        // Arrays.fill(ret,1);
        return ret;
    }


    public static void main(String[] args){
        int[] test = {1,2,3,4,5};
        int[] test2 = {3,2,1};
        System.out.println(Arrays.toString(mult(test)));
        System.out.println(Arrays.toString(mult(test2)));
    }
}