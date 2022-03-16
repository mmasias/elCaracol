public class caracol{
    public static void main(String[] args){
        int day = 1;
        double altura= (Math.random() * 10) + 10;
        double dia;
        double noche;
        double coche = Math.random();
        double clima = Math.random();
        double profundidad = 20;
        while (day <50 && altura <20){
            if (day >=10 && day <20 ){
                dia = Math.random() * 3;
            } else if ( day >=20){
                dia = Math.random() * 2;
            } else {
                dia = Math.random() * 4;
            }
            noche = Math.random() * 2;
            if ( clima <= 0.05){
                profundidad = profundidad - 5;            }
             else if ( clima > 0.05 && clima <= 0.15){
                    profundidad = profundidad - 2;
                }
             if ( coche >=0.35){
                 altura = altura - 2;
             }
             altura = (altura + dia) - noche ;
             if (altura <= profundidad){
                 altura = profundidad + 1;
             }
             System.out.print(" Dia = ");
             System.out.print(day);
             
        }
    }

    }