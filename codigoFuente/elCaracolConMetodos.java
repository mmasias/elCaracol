import java.util.Scanner;
class elCaracolConMetodos{

    static int dia = 0;
    static int profundidadPozo = 20;
    static int profundidadAgua = 0;
    static int profundidadCaracol = (int)(Math.random()*15+5);
    static int caracolFuerza = 4;
    static int caracolSube, caracolCae;
    static boolean hayCoche;
    static double elClima;
    static boolean estaVivo = true;
    static boolean estaDentro=true;

    static final String cielo = ".  . .  . .  . .  . .  . ";
    static final String cieloLluvioso = "!  ! !  ! !  ! !  ! !  ! ";
    static final String bordePozo = "[===]               [===]";
    static final String bordePozoConCoche = "[===]    Oo-oO      [===]"; 
    static final String pozo = "  [=]:. :. :. :. :. [=]";
    static final String elCaracol = "  [=]   _(@;_/'     [=]";
    static final String pozoAgua = "  [=]~~~~~~~~~~~~~~~[=]";
    static final String fondoPozo = "  [=][=][=][=][=][=][=]";

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        do {
            avanzaDia();
            calculaFuerza();
            calculaCoche();
            calculaClima();
            calculaPosicionCaracol();
            imprimeMapa(); 
            entrada.nextLine();
        } while (estaDentro && estaVivo);
        imprimeFinal();
    }

    static void avanzaDia() {
        dia = dia + 1;        
    }

    static void calculaPosicionCaracol(){
        caracolSube = (int)(Math.random()*caracolFuerza+1);
        caracolCae = (int)(Math.random()*2);
        profundidadCaracol = profundidadCaracol - caracolSube + caracolCae;
        if (profundidadCaracol>(profundidadPozo-profundidadAgua)) {
            profundidadCaracol = (profundidadPozo-profundidadAgua)-1;
        }
        if (profundidadCaracol<=0) {
            profundidadCaracol=0;
            estaDentro = false;
        }        
    }

    static void calculaCoche(){
        hayCoche = Math.random()>0.35;
        if (hayCoche) {
            caracolCae = caracolCae + 2;
        }
    }

    static void calculaClima(){
        elClima = Math.random();
        if (elClima <= 0.05) {
            profundidadAgua = profundidadAgua + 5;
        } else if (elClima <= 0.15) {
            profundidadAgua = profundidadAgua + 2;
        }        
    }

    static void calculaFuerza(){
        if (dia >= 50) {
            estaVivo = false;
        } else if (dia>=20) {
            caracolFuerza = 3;
        } else if (dia>=10) {
            caracolFuerza = 2;
        }        
    }

    static void imprimeMapa(){
        System.out.println("Dia ["+dia+"] / Caracol en ["+profundidadCaracol+"]");
        System.out.println((elClima>0.15)?cielo:cieloLluvioso);
        System.out.println(hayCoche?bordePozoConCoche:bordePozo);
        for (int i=0;i<=profundidadPozo;i++){
            if (i==profundidadCaracol) {
                System.out.print(elCaracol);
            } else if (i>(profundidadPozo-profundidadAgua)) {
                System.out.print(pozoAgua);
            } else {
                System.out.print(pozo);
            }
            System.out.println(" _ ___ " + i);
        }
        System.out.println(fondoPozo);
    }

    static void imprimeFinal(){
        System.out.print("El dia ["+dia+"] ");
        if (!estaVivo) {
            System.out.println("murio...");
        } else {
            System.out.println("salio...");
        }        
    }
}