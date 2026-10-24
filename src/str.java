package src;

public class str {

    public static void coutVowels(String str) {
        int count = 0;
        char[] newStr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (newStr[i] == 'a' || newStr[i] == 'e' ||newStr[i] ==  'i' ||newStr[i] ==  'o' ||newStr[i] ==  'u') {
                count++;
            }

        }
        System.out.println(count);

    

    }
    static void main(String[] args) {

        String name = "Rahul Kumar, And I am, Looking for a , JOB. ";
        StringBuilder name2 = new StringBuilder("Neelam");
        coutVowels(name); 

        // name2.setCharAt(0, 'E');
        System.out.println(name2);
        // System.out.println(name.substring(2,10));
        // for(int i = 0 ; i<name.length(); i++){
        // System.out.println(name.charAt(i));
        // }

        // String newWord[] = name.split(",");

        // System.out.println(newWord);

        // for (String nWord : newWord) {
        //     System.out.println(nWord);
        // }
    }
}
