import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String anagram1 = sc.next();
        System.out.println();
        System.out.println("Enter the seoncd string");
        String anagram2 = sc.next();
        if(anagram(anagram1,anagram2)){
            System.out.println("The words "+anagram1+" "+anagram2+ "are anagrams");
        }
        else{
            System.out.println("they arent anagrams" );
        }
    }
    public static  HashMap createHash(char[] ch) {
        HashMap<Character, Integer> anagramDetector = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if (anagramDetector.containsKey(ch[i])) {
                int a = anagramDetector.get(ch[i]);
                a += 1;
                anagramDetector.replace(ch[i], a);
            } else {
                anagramDetector.put(ch[i], 1);
            }
        }
        return anagramDetector;
    }

    public static Boolean anagram(String ana1, String ana2){

        char[] ch = ((String)ana1).toCharArray();
        HashMap<Character,Integer>anagramDetector = createHash(ch);
        char ch1[] = ((String)ana2).toCharArray();
        HashMap<Character,Integer>anagramDetector2 = createHash(ch1);
        return (anagramDetector.equals(anagramDetector2));

    }
}
