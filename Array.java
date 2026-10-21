import java.util.*;

public class Array {
    public static void updatearr(int marks[]){
        for(int i = 0; i < marks.length ; i++){
            marks[i] = marks[i] +1 ; 
        }
    }
    public static void main(String[] args) {
        int marks[] = {20,30,40} ; 

        // Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt(); 
        // marks[1] = sc.nextInt(); 
        // marks[2] = sc.nextInt(); 


        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        updatearr(marks); 
          for(int i = 0; i < marks.length ; i++){
            System.out.println(marks[i]);
        }

    }
}
