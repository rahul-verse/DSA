package src;
public class LargestArray {
    // Find the largest number in a give array. 
    public static void checkLargest(int num[]){
        int largest = num[0] ; 
        for(int i = 0 ; i<=num.length -1; i++){
            if( largest < num[i] ){
                largest = num[i]; 
            }
            
        }
        System.out.print("largest number = " + largest);
        }
    
    public static void main(String[] args) {
        int arr[] = {20,403,56,76}; 
        checkLargest(arr);
        
    }
}
