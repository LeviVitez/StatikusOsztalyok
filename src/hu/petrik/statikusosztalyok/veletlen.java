package hu.petrik.statikusosztalyok;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public final class veletlen {
    private veletlen() {}

    private static final Random rnd=new Random();
    private static List<String > vezNevek=feltolt(("files/veznev.txt"));
    private static List<String > ferfiKerNevek=feltolt(("files/ferfikernev.txt"));
    private static List<String > noiKerNevek= feltolt(("files/noikernev.txt"));


    private static List<String > feltolt(String fajlnev) {
        List<String>lista=new ArrayList<>();
        try {
        Scanner file=new Scanner(new File(fajlnev));
        while (file.hasNext()){
            String sor = file.nextLine();
            lista.add(sor);
        }
        file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static int velEgesz(int min, int max){
        return rnd.nextInt(max -min+1)+min;
    }

    public static char velKarakter(char min,char max){
        return (char) velEgesz(min,max);
    }

    public static String velVezetekNev(){
        return vezNevek.get(rnd.nextInt(vezNevek.size()));
    }

    /**
     * Véletlen Magyar keresztnév generálása
     * @param nem A generált név neme. Férfi esetén true, nő esetén false.
     * @return A generált keresztnév
     */
    public  static  String velKeresztNev(boolean nem){
        String keresztnev;
        if (nem){
            keresztnev=velFerfiKeresztNev();
        }else {
            keresztnev=velNoiKeresztNev();
        }
        return keresztnev;
    }

    private static String velFerfiKeresztNev(){
        return ferfiKerNevek.get(rnd.nextInt(ferfiKerNevek.size()));
    }
    private static String velNoiKeresztNev(){
        return noiKerNevek.get(rnd.nextInt(noiKerNevek.size()));
    }

    /**
     * Véletlen Magyar név generálása
     * @param nem A generált név neme. Férfi esetén true, nő esetén false.
     * @return A generált név
     */
    public static String velTeljesNev(boolean nem){
        return velVezetekNev()+" "+velKeresztNev(nem);
    }
}

