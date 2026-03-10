public class OOPSBannerApp {

    // Pattern for letter O
    public static String[] getOPattern() {
        String[] o = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
        return o;
    }

    // Pattern for letter P
    public static String[] getPPattern() {
        String[] p = {
            "***** ",
            "*    *",
            "***** ",
            "*     ",
            "*     "
        };
        return p;
    }

    // Pattern for letter S
    public static String[] getSPattern() {
        String[] s = {
            " *****",
            "*     ",
            " *****",
            "     *",
            "***** "
        };
        return s;
    }

    // Main method
    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print OOPS banner
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "   "
                    + oPattern[i] + "   "
                    + pPattern[i] + "   "
                    + sPattern[i]);
        }
    }
}