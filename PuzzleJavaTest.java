import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();

        int[] input = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        System.out.println(puzzle.getSum(input));

        String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        System.out.println(puzzle.shuffleNames(names));

        puzzle.shuffleLetters();

        System.out.println(puzzle.generateRandomNumbers());

        puzzle.sortArray();

        System.out.println(puzzle.generateRandomString());

        System.out.println(puzzle.generateArrString());
    }
}