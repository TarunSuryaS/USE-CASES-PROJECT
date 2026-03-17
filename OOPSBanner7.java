public class OOPSBanner7 {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static String[] getCharacterPattern(CharacterPatternMap[] characterPatterns, char ch) {
        for (CharacterPatternMap cp : characterPatterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return new String[7];
    }

    public static void buildBanner(String word, CharacterPatternMap[] characterPatterns) {
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = getCharacterPattern(characterPatterns, ch);
                line.append(pattern[row]).append(" ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] characterPatterns = {

            new CharacterPatternMap('O', new String[]{
                    " ***** ",
                    "**   **",
                    "**   **",
                    "**   **",
                    "**   **",
                    "**   **",
                    " ***** "
            }),

            new CharacterPatternMap('P', new String[]{
                    " ***** ",
                    "**   **",
                    "**   **",
                    "*****  ",
                    "**     ",
                    "**     ",
                    "**     "
            }),

            new CharacterPatternMap('S', new String[]{
                    " ***** ",
                    "**     ",
                    "**     ",
                    " ****  ",
                    "    ** ",
                    "    ** ",
                    " ***** "
            })
        };

        buildBanner("OOPS", characterPatterns);
    }
}