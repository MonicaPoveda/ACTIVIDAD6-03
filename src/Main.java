import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int DADO, PUNTOS;
        int DADOTIRADO;
        int vidainicial = 5;
        boolean estado = true;
        int puntos =0;

        Random Ale = new Random();
        DADO = Ale.nextInt((6 - 1 + 1)) + 1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("HA INICIADO CON " + vidainicial + " vidas ");
        System.out.println("TIENE " + puntos + " puntos");

        do {
                System.out.println("NUMERO DADO TIRADO:" + DADO);
                DADO = Ale.nextInt((6 - 1 + 1)) + 1;

            if (DADO == 1) {
                System.out.println("*-*-HA PERDIDO 1 VIDA*-*-*");
                vidainicial--;
                System.out.println("TIENE " + vidainicial + "vidas");
                System.out.println("TIENE "+ puntos + "puntos");


            } else if (DADO == 2) {
                System.out.println("*-*-GANO 1 PUNTO*-**");
                puntos++;
                System.out.println("TOTAL DE PUNTOS: " + puntos);
                System.out.println("TIENE " + vidainicial + "vidas");


            } else if (DADO == 3) {
                System.out.println("*-*-NO HA GANADO NADA*-*-");
                System.out.println("TOTAL DE PUNTOS: " + puntos+"puntos");
                System.out.println("TIENE " + vidainicial + "vidas");


            } else if (DADO == 4) {
                System.out.println("*-*-GANO 1 PUNTO*-*-");
                puntos ++;
                System.out.println("TOTAL DE PUNTOS: " + puntos);


            } else if (DADO == 5) {
                System.out.println("-**-NO HA GANADO NADA*-*-");

            } else if (DADO == 6) {
                System.out.println("*-*-GANO 3 PUNTOS*-*-");
                puntos+=3;
                System.out.println("TOTAL DE PUNTOS: " + puntos);
                System.out.println("TIENE " + vidainicial + "vidas");

            }
            if (puntos > 10) {
                System.out.println("HA GANADO EL JUEGO");
                estado=false;
            }
            if (vidainicial==0){
                estado=false;

            }
        } while (estado);
    }
}

