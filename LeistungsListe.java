// LeistungsListe.java
package aufgabe6;

import java.util.NoSuchElementException;

/**
 * LeistungsListe kapselt eine Liste von Leistungen.
 * @author Laurin Engelen
 * @version 16.01.2024
 */

public final class LeistungsListe implements Iterable<Leistung> {

    private Element head = null;

    /**
     * Liefert einen Iterator ueber die Fachnotenliste.
     * @param leistung
     * @return retung jnhabh
     */
    public LeistungsListe insert(Leistung leistung) {
        this.head = new Element(this.head, leistung);
        return this;
    }

    /**
     * Liefert einen Iterator ueber die Fachnotenliste.
     * @return fwf
     */
    private static final class Element {
        private final Element next;
        private final Leistung leistung;

        private Element(Element e, Leistung leistung) {
            this.next = e;
            this.leistung = leistung;
        }
    }

    /**
     * Liefert einen Iterator ueber die Fachnotenliste.
     * @return ddw
     */

    public final class Iterator {
        private Element current = LeistungsListe.this.head;
        /**
         * Liefert einen Iterator ueber die Fachnotenliste.
         * @return retung jnhabh
         */
        public boolean hasNext() {
            return this.current != null;
        }
        /**
         * Liefert einen Iterator ueber die Fachnotenliste.
         * @return fswefw
         */
        public Leistung next() {
            if (this.current == null) {
                throw new NoSuchElementException();
            }
            Element e = this.current;
            this.current = this.current.next;
            return e.leistung;
        }
    }


    @Override
    public java.util.Iterator<Leistung> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
        "Unimplemented method 'iterator'");
    }
}

