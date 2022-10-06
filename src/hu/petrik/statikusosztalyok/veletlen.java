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
    private static List<String > ferfiKerNevek=feltolt(("file/ferfikernev.txt"));
    private static List<String > noiKerNevek= feltolt(("file/noikernev.txt"));


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
}

