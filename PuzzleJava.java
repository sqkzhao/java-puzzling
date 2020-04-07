import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

    public ArrayList<Integer> getSum(int[] arr) {
        int sum = 0;
        ArrayList<Integer> output = new ArrayList<Integer>();
        for(int val: arr) {
            sum += val;
            if(val > 10) {
                output.add(val);
            }
        }
        System.out.println(sum);
        return output;
    }

    public ArrayList<String> shuffleNames(String[] arr) {
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> output = new ArrayList<String>();

        for(String name: arr) {
            names.add(name);
            if(name.length() > 5) {
                output.add(name);
            }
        }
        Collections.shuffle(names);
        System.out.println(names);
        return output;
    }

    public void shuffleLetters() {
        ArrayList<String> letters = new ArrayList<String>();
        Collections.addAll(letters, "A", "B", "C", "D", "E", "F", "G", "H", 
            "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
            "S", "T", "U", "V", "W", "X", "Y", "Z");
        ArrayList<String> vowels = new ArrayList<String>();
        Collections.addAll(vowels, "A", "E", "I", "O", "U");
        Collections.shuffle(letters);
        System.out.println(letters);
        System.out.println(letters.get(letters.size()-1));
        System.out.println(letters.get(0));
        if(vowels.contains(letters.get(0))) {
            System.out.println(String.format("%s is a vowel.", letters.get(0)));
        }
    }

    public ArrayList<Integer> generateRandomNumbers() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random r = new Random();
        for(int i = 0; i < 10; i++) {
            numbers.add(r.nextInt(46) + 55);
        }
        return numbers;
    }

    public void sortArray() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = generateRandomNumbers();
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }

    public String generateRandomString() {
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 
            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
            'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String str = "";
        Random r = new Random();
        for(int i = 0; i < 5; i++) {
            int index = r.nextInt(26);
            str = str.concat(String.valueOf(letters[index]));
        }
        return str;
    }

    public ArrayList<String> generateArrString() {
        ArrayList<String> strArr = new ArrayList<String>();
        for(int i = 0; i < 10; i++) {
            strArr.add(generateRandomString());
        }
        return strArr;
    }
}