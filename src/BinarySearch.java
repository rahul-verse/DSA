package src;
public class BinarySearch {

    public static int binarySearch(int number[],int target){
        int low = 0 , high = number.length-1; 

        while(low<=high){
            int mid = (low +high)/2; 

            // comparison
            if(number[mid] == target){
                return mid;
            }

            if(number[mid] <target){
                low = mid+1 ; 
            }else{
                high = mid -1 ; 
            }
        }
        return  -1 ;  
    }
    public static void main(String[] args) {
        int number[] = {2,3,4,5,6,39,24}; 
        int target  = 204; 
        binarySearch(number , target); 

        System.out.println("index for target is : "+ binarySearch(number, target));
    }
}
