package org.example.palindrome;

/*    Schreibe ein Programm, das ein Wort aus Kleinbuchstaben auf dem Bildschirm umgedreht ausgibt. (hallo => ollah)
    Wenn das Wort ein Palindrom ist, sieht das ausgegebene Wort wieder genau so aus, wie die Eingabe. (otto => otto)
    Das Programm soll nun prüfen, ob das Wort ein Palindrom war oder nicht und eine entsprechende Meldung ausgeben.
    Überlege dir zuerst, wie in Vortrag 4 gelernt, wie du das Programm schreiben willst, z.B. welche Methoden du
    brauchst und was diese tun. Solltest du gar keine Ahnung haben, wie man das Problem angehen könnte, dann lass dir
    einfach von einen Tutor deines Vertrauens einen Tipp geben.
*/

public class Palindrome {

    public static void main(String[] args) {
        //char[] charArr = palindrom.toCharArray(); umwandelt ein Str in char[]
        String palindrom = "rentner";

        istPalindrom(palindrom);

    }

    public static void istPalindrom(String palindrom){
        String normalesierenStrToLowCase = palindrom.toLowerCase();
        char[] charArrUmgedreht = new char[palindrom.length()];
        String strUmgedreht;
        for (int i = 0; i < normalesierenStrToLowCase.length(); i++) {
            charArrUmgedreht[i] = normalesierenStrToLowCase.charAt((normalesierenStrToLowCase.length() - 1) - i);
        }
        strUmgedreht = new String(charArrUmgedreht);

        if (strUmgedreht.equals(normalesierenStrToLowCase)) {
            System.out.println("Es ist Palindrom");
        }else {
            System.out.println("Es ist kein Palindrom");
        }
        System.out.println(strUmgedreht);

    }
}
