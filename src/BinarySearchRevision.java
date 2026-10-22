package src;

public class BinarySearchRevision {

    public static int findNumber(int num[] , int target){

        for(int i = 0 ; i<num.length ; i++){
            int start = 0 ; 
            int end = num.length ; 
            int mid = (start+end)/2 ; 

            while(mid<end){
                start = mid + 1 ;
            }

            while(mid>start){
                end = end -1 ; 
            }
        }

        return -1; 
    } 
    public static void main(String[] args) {
        int num[]= {10,20,30,40,50,60,70} ; 
        int target = 50; 
        
        findNumber(num, target);

    }
}
