package src;

public class MaxSubarray {

    public static void printPairs(int arr[]){
        for(int i = 0 ; i<arr.length;i++){
            int curr = arr[i]; 
            for(int j = i ; j<arr.length; j++){
                System.out.print("("+curr+","+arr[j]+") ");
            }
        }
    }
    public static void main(String[] args) {
         int arr[] = {2,4,6,8,10} ; 

        // printPairs(arr);

        for (int value : arr) {
            System.out.println(value);
        }
    }
}
