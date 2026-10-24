package src;

// Ques: Count the consonants in a string. 

// Remove all spaces from string. 
// Check if contains only digits. 
// Count words in sentence. 
public static void countConsonant(String str){int count=0;for(int i=0;i<str.length();i++){char ch=Character.toLowerCase(str.charAt(i));
// int n = str.charAt(i);
if(Character.isLetter(ch)){if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){count++;

}}

}System.out.println("Total consonants: "+count);}

public class strQuestion {

    // Covert string to uppercase without using method;

    // find the frequency of a character ;
    // 1.Trverse the string,
    // 2. get the char
    public static void countChar(String str) {

        str = str.toLowerCase();
        boolean[] visited = new boolean[str.length()];
        // System.out.println(visited);

        for (int i = 0; i < str.length(); i++) {

            if (visited[i]) {
                continue;
            }
            char ch = Character.toLowerCase(str.charAt(i));

            if (Character.isLetter(ch)) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (ch == str.charAt(j)) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(ch + " occured: " + count);
            }
        }
    }

    public static void main(String[] args) {

        String name = "BANANAN";
        // countConsonant(name);
        countChar(name);
    }
}
