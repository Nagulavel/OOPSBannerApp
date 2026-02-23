/**
 * OOPSBannerApp
 * UC7: Store Character Pattern in a Class
 *
 * Demonstrates Encapsulation, Modularity, and OOP Design
 *
 * @author Nagulavel
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * Inner Static Class to store Character and its Pattern
     */
    public static class CharacterPattern {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character letter
         * @param pattern 7-line banner pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility Method to Build Banner Line by Line
     * @param characters array of CharacterPattern objects
     * @return assembled banner lines
     */
    public static String[] buildBanner(CharacterPattern[] characters) {

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : characters) {
                line.append(cp.getPattern()[i]).append(" ");
            }

            banner[i] = line.toString();
        }

        return banner;
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        // Define patterns
        CharacterPattern O = new CharacterPattern('O', new String[] {
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        });

        CharacterPattern P = new CharacterPattern('P', new String[] {
            " ******  ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *       ",
            " *       ",
            " *       "
        });

        CharacterPattern S = new CharacterPattern('S', new String[] {
            " *****   ",
            " *       ",
            " *       ",
            "  *****  ",
            "       * ",
            "       * ",
            " *****   "
        });

        // Create array of objects
        CharacterPattern[] word = { O, O, P, S };

        // Build banner
        String[] banner = buildBanner(word);

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}