package aufgabe6;

/**
 * UnbenoteteLeistung.
 * Klasse für unbenotete Leistungen.
 * Erbt von Leistung.
 * @version 23.01.2021
 */
public class UnbenoteteLeistung extends Leistung {
    private final boolean bestanden;

    /**
     * Konstruktor für unbenotete Leistungen.
     * @param fach
     * @param bestanden
     */
    public UnbenoteteLeistung(String fach, boolean bestanden) {
        super(fach);
        this.bestanden = bestanden;
    }

    @Override public boolean istBenotet() {
        return false;
    }

    @Override public boolean istBestanden() {
        return bestanden;
    }
}
