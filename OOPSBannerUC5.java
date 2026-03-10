/**
 * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Define String array to hold banner lines
        String[] lines = {
            String.join(" ***     ***     *****     ***** ");
            string.join("** **   ** **    **  **    **    ");
            string.join("** **   ** **    **  **    **    ");
            string.join("** **   ** **    *****     ***** ");
            string.join("** **   ** **    **           ** ");
            string.join("** **   ** **    **           ** ");
            string.join(" ***     ***     **        ***** ");
        };

        // Print banner using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}