package aufgabe6;

import java.io.PrintWriter;
/**
 * HtmlFormat.
 * @author Laurin Engelen
 * @version 23.01.2024
 */
public final class HtmlFormat {
    private HtmlFormat() { }
    /**
     * HTML Ausgabe des Programms.
     * @param ausgabe
     * @param name
     * @param leistungen
     */
    public static void ausgeben(PrintWriter ausgabe, String[] name,
        LeistungsListe leistungen) {
        // Beginn des HTML-Dokuments
        ausgabe.println("<!DOCTYPE html>");
        ausgabe.println("<html lang=\"de\">");
        ausgabe.println("<head>");
        ausgabe.println("<meta charset=\"utf-8\">");
        ausgabe.println("<meta name=\"viewport\" content ="
            + "\"width=device-width, initial-scale=1.0\">");
        ausgabe.println("<style>");
        ausgabe.println("table { width:100%; }");
        ausgabe.println("th { text-align:left; }");
        ausgabe.println("</style>");
        ausgabe.println("<title>Notenspiegel</title>");
        ausgabe.println("</head>");
        ausgabe.println("<body>");
        ausgabe.print("<h1>Notenspiegel für ");
        for (String teilName : name) {
            ausgabe.print(teilName + " ");
        }
        ausgabe.println("</h1>");
        ausgabe.println("<hr>");
        ausgabe.println("<table>");
        ausgabe.println("<tr><th>Fach:</th><th>Art:</th><th>Note:</th></tr>");
        LeistungsListe.Iterator i = leistungen.new Iterator();
        while (i.hasNext()) {
            Leistung leistung = i.next();
            String art;

            if (leistung.istBenotet()) {
                art = "L";
            } else {
                art = "S";
            }

            if (leistung.istBestanden()) {

                ausgabe.printf("<tr><td>");
                ausgabe.printf(leistung.getFach());
                ausgabe.printf("</td><td>");
                ausgabe.printf(art);
                ausgabe.printf("</td><td>");

                if (leistung.istBenotet()) {
                    ausgabe.printf(leistung.getNoteInWorten()
                        + " (" + leistung.getNote() + ")");
                } else {
                    ausgabe.printf("bestanden");
                }
                ausgabe.printf("</td></tr>%n");

            } else {
                ausgabe.printf("<tr><td style=\"color:red\">");
                ausgabe.printf(leistung.getFach());
                ausgabe.printf("</td><td>");
                ausgabe.printf(art);
                ausgabe.printf("</td><td>");
                ausgabe.printf("nicht bestanden");
                ausgabe.printf("</td></tr>%n");
            }
        }
        ausgabe.println("</table>");
        ausgabe.println("<hr>");
        ausgabe.println("L = Leistungsnachweis, S = Schein");
        ausgabe.println("</body>");
        ausgabe.println("</html>");
    }
}