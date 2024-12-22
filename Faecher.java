package aufgabe6;
/**
 * Faecher.
 */
public final class Faecher {
    private Faecher() { }
    private static final String[] FAECHER = {"Digitaltechnik",
        "Programmiertechnik 1", "Softwaremodellierung", "Mathematik 1"};

    /**
     * ist Zulässig.
     * @param fach
     * @return boolean
     */
    public static boolean istZulaessig(String fach) {
        for (String f : FAECHER) {
            if (f.equals(fach)) {
                return true;
            }
        }
        return false;
    }
}
