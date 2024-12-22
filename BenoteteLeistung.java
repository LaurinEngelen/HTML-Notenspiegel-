package aufgabe6;

/**
 * @author Laurin Engelen
 * BenoteteLeistung.
 * Klasse für benotete Leistungen.
 * Erbt von Leistung.
 * @version 23.01.2021
 */
public class BenoteteLeistung extends Leistung {
    private final String note;

    /**
     * Konstruktor für benotete Leistungen.
     * @param fach
     * @param note
     */
    public BenoteteLeistung(String fach, String note) {
        super(fach);
        this.note = note;
    }
    // ist Benotet
    @Override public boolean istBenotet() {
        return true;
    }

    // ist bestanden
    @Override public boolean istBestanden() {
        int noteInt = Integer.parseInt(this.note.replace(",", ""));
        if (noteInt == 10 || noteInt == 13 || noteInt == 17 || noteInt == 20
            || noteInt == 23 || noteInt == 27 || noteInt == 30 || noteInt == 33
            || noteInt == 37 || noteInt == 40) {
            return true;
        }
        return false;
    }

    // get note
    @Override public String getNote() {
        return this.note;
    }
    // get note in worten
    @Override public String getNoteInWorten() {
        if (this.note.equals("1,0") || this.note.equals("1,3")) {
            return "sehr gut";
        } else if (this.note.equals("1,7") || this.note.equals("2,0")
            || this.note.equals("2,3")) {
            return "gut";
        } else if (this.note.equals("2,7") || this.note.equals("3,0")
            || this.note.equals("3,3")) {
            return "befriedigend";
        } else if (this.note.equals("3,7") || this.note.equals("4,0")) {
            return "ausreichend";
        } else if (this.note.equals("5,0")) {
            return "nicht bestanden";
        } else {
            return "unzulässige note";
        }
    }
}
