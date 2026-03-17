import java.util.HashMap;
import java.util.Map;

public class OOPSBanner8 {

    static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " ***** ",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                " ***** "
        });

        patterns.put('P', new String[]{
                " ***** ",
                "**   **",
                "**   **",
                "*****  ",
                "**     ",
                "**     ",
                "**     "
        });

        patterns.put('S', new String[]{
                " ***** ",
                "**     ",
                "**     ",
                " ****  ",
                "    ** ",
                "    ** ",
                " ***** "
        });

        return patterns;
    }

    static void printBanner(String word, Map<Character, String[]> patterns) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patterns.get(ch);
                line.append(pattern[row]).append(" ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = buildCharacterPatterns();
        printBanner("OOPS", patterns);
    }
}