import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 * UC8: Use HashMap for Character Patterns and Render via Function
 *
 * Demonstrates use of Java Collections Framework
 *
 * @author Nagulavel
 * @version 8.0
 */
public class OOPSBannerApp {

    /**
     * Builds and returns a Map of character patterns
     */
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        patternMap.put('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });

        patternMap.put('S', new String[]{
                " *****   ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                " *****   "
        });

        return patternMap;
    }

    /**
     * Renders banner for given message
     */
    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }
            }

            System.out.println(line);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        String message = "OOPS";

        renderBanner(message, patternMap);
    }
}