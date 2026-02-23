/**
 * OOPSBannerApp
 * UC5: Render OOPS Banner using Inline Array Initialization
 *
 * @author Nagulavel
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline array initialization with String.join()
        String[] banner = {
            String.join(" ", "  *****  ", "  *****  ", " ******  ", " *****   "),
            String.join(" ", " *     * ", " *     * ", " *     * ", " *       "),
            String.join(" ", " *     * ", " *     * ", " *     * ", " *       "),
            String.join(" ", " *     * ", " *     * ", " ******  ", "  *****  "),
            String.join(" ", " *     * ", " *     * ", " *       ", "       * "),
            String.join(" ", " *     * ", " *     * ", " *       ", "       * "),
            String.join(" ", "  *****  ", "  *****  ", " *       ", " *****   ")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}