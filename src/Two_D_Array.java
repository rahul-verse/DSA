package src;

/**
 * Two_D_Array
 */
public class Two_D_Array {

    public static void main(String[] args) {
        int[][] arr; // declaration

        // allocation
        arr = new int[3][4];

        // init
        int[][] brr = {
                { 1, 2 }, 
                { 2, 3 }, 
                { 3, 4 }, 
                { 4, 5 }
        };

        // System.out.println(brr[0][1]);
        int rowLength = brr.length ; 
        int colLength = brr[0].length ; 

        for(int rowIndex = 0; rowIndex<=rowLength-1; rowIndex++){
            System.out.print("[");
            for(int colIndex = 0 ; colIndex<=colLength-1; colIndex++){
                System.out.print( brr[rowIndex][colIndex] + " " );
                // System.out.print("--");
            }
            System.out.print("]");
            System.out.println();
        }


    }
}