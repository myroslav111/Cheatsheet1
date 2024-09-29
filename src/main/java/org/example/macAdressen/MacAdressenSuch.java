package org.example.macAdressen;

public class MacAdressenSuch {

    public static boolean sucheMac(String[] macAdressen, String gesuchteMacAdresse){

        for(String mac: macAdressen){
             if (mac.equals(gesuchteMacAdresse)){

                 return true;
             }
        }
        return false;
    }

    public static void main(String[] args) {

        String gesuchteMacAdresse = "00:0a:95:9d:68:17";
        String[] macAdressen = {"00:0a:95:9d:68:16", "00:0a:95:9d:68:17", "00:0a:95:9d:68:18", "00:0a:95:9d:68:19"};

        System.out.println(sucheMac(macAdressen, gesuchteMacAdresse));

    }
}
