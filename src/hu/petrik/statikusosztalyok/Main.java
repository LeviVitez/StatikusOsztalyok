package hu.petrik.statikusosztalyok;

public class Main {
     /*int nemStatikusAdattag;
    static int StatikusAdattag;
      */
    public static void main(String[] args) {
        /*
        Main objektum = new Main();
        System.out.println(objektum.nemStatikusAdattag);
        System.out.println(Main.StatikusAdattag);
         */
        for (int i = 0; i <100 ; i++) {
            System.out.println(veletlen.velEgesz(5,10));
        }
        System.out.println();
        for (int i = 0; i < 50; i++) {
            System.out.println(veletlen.velKarakter('A','Z'));
        }
        System.out.println();
        for (int i = 0; i <5 ; i++) {
            System.out.println(veletlen.velTeljesNev(true));
        }
        System.out.println();
        for (int i = 0; i <5 ; i++) {
            System.out.println(veletlen.velTeljesNev(false));
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(veletlen.velEmail(veletlen.velTeljesNev(false)));
            System.out.println(veletlen.velEmail(veletlen.velTeljesNev(true)));
        }

    }
}
