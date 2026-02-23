/**
 * OOPSBannerApp
 * UC6: Refactor Banner Logic into Functions
 *
 * @author Nagulavel
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ", O[i], O[i], P[i], S[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Method for O pattern
    public static String[] getOPattern() {
        return new String[] {
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        };
    }

    // Method for P pattern
    public static String[] getPPattern() {
        return new String[] {
            " ******  ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *       ",
            " *       ",
            " *       "
        };
    }

    // Method for S pattern
    public static String[] getSPattern() {
        return new String[] {
            " *****   ",
            " *       ",
            " *       ",
            "  *****  ",
            "       * ",
            "       * ",
            " *****   "
        };
    }
}
