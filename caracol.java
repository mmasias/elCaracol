public class caracol{
    public static void main(String[] args){
        int day = 1;
        int altura= (math.random * 10) + 10;
        int dia;
        int noche;
        int coche = math.random();
        int clima = math.random;
        int profundidad = 20;
        while (day <50 && altura <20){
            if (day >=10 && day <20 ){
                dia = math.random * 3;
            } else if ( day >=20){
                dia = math.random * 2;
            } else {
                dia = math.random * 4;
            }
            noche = math.random * 2;
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
             System.out.print()
        }
    }

    }