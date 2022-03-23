import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class solucion{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int profundidadLluvia = 0;
        int profundidadCaracol = -(ThreadLocalRandom.current().nextInt(10, 20 + 1)); //Se asigna una profundidad inicial del caracol en el pozo entre 10-20 metros
        int dia = 1;

        System.out.println("Profundidad inicial del caracol: " + profundidadCaracol);
        
        while(dia < 50){
            int avanceMaximo = 4;
            double probabilidadCoche = Math.random();
            double probabilidadClima = Math.random();
            boolean llueve = false;

            if (dia>=20){
                avanceMaximo = 2;
            }
            else if (dia>=10){
                avanceMaximo = 3;
            }

            int avanceDia = ThreadLocalRandom.current().nextInt(1, avanceMaximo + 1);
            int retrocesoNoche = ThreadLocalRandom.current().nextInt(0, 2 + 1);

            if(probabilidadCoche >= 0.65){
                retrocesoNoche += 2;
            }

            if(probabilidadClima >= 0.95){ //Si hay lluvia fuerte
                profundidadLluvia += 5;
                llueve = true;
            }
            else if(probabilidadClima >= 0.90){ //Si hay lluvia media
                profundidadLluvia += 2;
                llueve = true;
            }


            profundidadCaracol = profundidadCaracol + (avanceDia - retrocesoNoche);
            
            //Si la profundidad del caracol es menor o igual que la profundidad de la lluvia, el caracol pasa a estar un lugar más arriba que la lluvia
            if( profundidadCaracol < (profundidadLluvia -20) ){
                profundidadCaracol = (profundidadLluvia - 20);
            }
            // El caracol no puede bajar más allá de la profundidad del pozo
            if(profundidadCaracol < -20){
                profundidadCaracol = -20;
            }

            System.out.println("Día [" + dia + "] / Sube: [" + avanceDia + "] / Baja: ["+ retrocesoNoche + "] / Altura al final del día: ["+ profundidadCaracol+ "]");
            if(llueve){
                System.out.println("Llueve y el pozo se llena con un total de" + profundidadLluvia + " metros de agua");
            }

            if(profundidadCaracol > 0){
                System.out.println("¡¡El caracol ha logrado salir del pozo el día ["+dia+"] !!");
                System.out.println("[__]    _@)_/’    [__]");
            }
            else{
                if(probabilidadCoche >= 0.65){
                    if(llueve){
                        System.out.println("[__]|||| O-=-O |||[__]");
                    }
                    else{
                        System.out.println("[__]    O-=-O     [__]");
                    }
                }
                else{
                    if(llueve){
                        System.out.println("[__] |||| || |||| [__]");
                    }
                    else{
                        System.out.println("[__]              [__]");
                    }
                }
            }

            for(int i = 0; i >=-20; i--){
                if(profundidadCaracol == i){
                    System.out.println("[]    _@)_/’    [] _ __ " + i);
                }
                else{
                    if((profundidadLluvia -20) > i){
                        System.out.println("[]~~~~~~~~~~~~~~[] _ __ " + i);
                    }
                    else{
                        System.out.println("[]:. :. :. :. :.[] _ __ " + i);
                    }
                }
            }
            System.out.println("[][][][][][][][][] ");
            //Si el caracol ya ha salido del pozo, se termina el programa
            if(profundidadCaracol > 0){
                break;
            }
            dia++;
            scanner.nextLine();
        }
        
        if(dia==50){
            System.out.println("X.X El caracol se muere de inanición al pasar 50 días X.X");
        }
        scanner.close();
    }
}