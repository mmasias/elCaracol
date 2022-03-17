public class caracol{
    public static void main(String[] args){

        int dia;
        double clima;
        int profundidad;
        int profundidadAgua;
        double profundidadCaracol;
        double caracolSube;
        double caracolBaja;

        dia = 50;
        for(int j=0; j<=dia; j++){
            clima = Math.random();
            profundidad = 20;
            profundidadAgua = 1;
            profundidadCaracol = Math.random()*(20-10)+10;
            caracolSube = Math.random()*(4-1)+1;
            caracolBaja = Math.random()*(2-0)+0;
                if(j<=dia){
                    if(clima<=0.4){
                        profundidadAgua = profundidadAgua + 5;
                        System.out.println("llueve!");
                    } else if (clima<=0.8){
                        profundidadAgua = profundidadAgua + 2;
                        System.out.println("llueve!");
                    }
                    System.out.print("Dia ["+j+"] / ");
                    System.out.print("Sube: [" + ((double)Math.round(profundidadCaracol + caracolSube * 100d) / 100d) + "] / ");
                    System.out.println("Baja: [" + ((double)Math.round(profundidadCaracol + caracolBaja * 100d) / 100d) + "] / ");
                    System.out.println("Altura al final del día: [" + ((double)Math.round((profundidadCaracol + caracolSube) - caracolBaja * 100d) /100d) + "]");
                } else {
                    System.out.println("El caracol se murió de hambre");
                }
                    for (int i=0; i<=profundidad; i++){
                        if(((int)profundidadCaracol)==i){
                            System.out.println("[]    _@)_/’    [] _ __ "+i);
                        } else if(i>(profundidad-profundidadAgua)){
                            System.out.println("[]~~~~~~~~~~~~~~[] _ __ "+i);
                        } else {
                            System.out.println("[]:. :. :. :. :.[] _ __ "+i);
                        }
                    }
                System.out.println("[][][][][][][][][]");
        }
    }
}