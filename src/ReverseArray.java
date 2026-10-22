package src;

public class ReverseArray {

    public static void swap(int number[]){

        int first = 0 , last = number.length -1 ; 
        while (first < last) {
            int temp = number[last]; 
            number[last] = number[first] ; 
            number[first] = temp; 

            first++ ; 
            last-- ; 
        }

        // System.out.println(number);
        }
    
    public static void main(String[] args) {
        int num[] = {10,20,30};
        swap(num);

        for(int i = 0 ; i<num.length ; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();

    }
}
