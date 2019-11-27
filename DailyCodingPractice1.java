import java.util.*;
class Main {



//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

//For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

//Bonus: Can you do this in one pass?


  public static boolean kchecker (int[] arr, int k){
    //Arrays.sort(arr);
    int end = arr.length - 1; 
    int start = 0;

    // HashSet<Integer> hs = new HashSet<>();
    // for (int n: arr){
    //   if(hs.contains(k-n)) return true;
    //   hs.add(n);
    // }
    // return false;
    // n + ??? = k
    // => ??? = k-n



    // for (int i = 0; i < arr.length; i++){
    //   if(arr[i] + arr[end] > k){
    //     System.out.println("Sum at "+ i +" is: "+(arr[i] + arr[end]));
    //     end--;
    //   } else if(arr[i] + arr[end] < k){
    //     System.out.println("Sum at "+ i +" is: "+(arr[i] + arr[end]));
    //     continue;
    //   }else if(arr[i] + arr[end] == k){
    //     return true;
    //   }
    //   if(i == end){
    //     return false;
    //   }
    // }
    System.out.println("Array is: "+ Arrays.toString(arr)+"\nLength is: "+ arr.length);
    while(start < end){
      if(arr[start] + arr[end] > k){
        System.out.println(arr[start]+" + "+ arr[end]+" is "+ (arr[start] + arr[end]));
        end--;
      } else if(arr[start] + arr[end] < k){
        System.out.println(arr[start]+" + "+ arr[end]+" is :"+(arr[start] + arr[end]));
        start++;
      }else if(arr[start] + arr[end] == k){
        System.out.println(arr[start]+" + "+ arr[end]+" is :"+(arr[start] + arr[end]));
        return true;
      }
    }
    return false; 
  }
  public static void main(String[] args) {
    int[] test = {10,-9,8,-7,6,-5,4,-3,2,-1,1};
    boolean ret = kchecker(test, 0);
    System.out.println(ret);
  }
}