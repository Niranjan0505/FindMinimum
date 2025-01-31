import java.util.ArrayList;
import java.util.List;
public class CharacterClassifier {
    public static void main(String[] args) {
        char[] input = {'a', 'Z', '4', 'i', 'm', '7'};
        List<Character> vowels = new ArrayList<>();
        List<Character> consonants = new ArrayList<>();
        List<Character> numbers = new ArrayList<>();
        for (char ch : input) {
            if (Character.isDigit(ch)) {
                numbers.add(ch);
            } else if (Character.isLowerCase(ch)) {
                vowels.add(ch);
            } else if (Character.isLetter(ch)) {
                consonants.add(ch);
            }
        }


        System.out.println("vowels:" + vowels);
        System.out.println("consonants:" + consonants);
        System.out.println("numbers:" + numbers);
    }

        private static boolean isVowel ( char ch){
            ch = Character.toLowerCase(ch);
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }
    }





