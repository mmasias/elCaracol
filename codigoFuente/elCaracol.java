class elCaracol{
    public static void main(String[] args){
        
        int dia = 0;
        int profundidadPozo = 20;
        int profundidadAgua = 0;
        int profundidadCaracol = (int)(Math.random()*15+5);
        int caracolFuerza = 4;
        int caracolSube, caracolCae;
        boolean hayCoche;
        double elClima;
        boolean estaVivo = true;
        boolean estaDentro=true;

        final String bordePozo = "[===]               [===]";
        final String bordePozoConCoche = "[===]    Oo-oO      [===]"; 
        final String pozo = "  [=]:. :. :. :. :. [=]";
        final String elCaracol = "  [=]   _(@;_/'     [=]";
        final String pozoAgua = "  [=]~~~~~~~~~~~~~~~[=]";
        final String fondoPozo = "  [=][=][=][=][=][=][=]";

        do {
            dia = dia + 1;

            if (dia >= 50) {
                estaVivo = false;
            } else if (dia>=20) {
                caracolFuerza = 3;
            } else if (dia>=10) {
                caracolFuerza = 2;
            }

            caracolSube = (int)(Math.random()*caracolFuerza+1);
            caracolCae = (int)(Math.random()*2);

            hayCoche = Math.random()>0.35;
            if (hayCoche) {
                caracolCae = caracolCae + 2;
            }

            elClima = Math.random();
            if (elClima <= 0.05) {
                profundidadAgua = profundidadAgua + 5;
            } else if (elClima <= 0.15) {
                profundidadAgua = profundidadAgua + 2;
            }

            profundidadCaracol = profundidadCaracol - caracolSube + caracolCae;
            if (profundidadCaracol>(profundidadPozo-profundidadAgua)) {
                profundidadCaracol = (profundidadPozo-profundidadAgua)-1;
            }
            if (profundidadCaracol<=0) {
                estaDentro = false;
            }

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
            System.out.println();
        } while (estaDentro && estaVivo);

        System.out.print("El dia ["+dia+"] ");
        if (!estaVivo) {
            System.out.println("murio...");
        } else {
            System.out.println("salio...");
        }

    }
}