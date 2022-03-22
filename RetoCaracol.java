import java.lang.Math;
import java.text.DecimalFormat;
public class RetoCaracol{
    public static void main(String[] args){
        
        int profundidadPozo, profundidadAgua, dia, contador;
        double profundidadCaracol,distanciaSubida,distanciaBajada,probabilidadCoche,probabilidadLluvia;

        profundidadPozo = 20;
        dia = 0;
        profundidadCaracol = (Math.random()*(20-10))+10;
        profundidadAgua = 0;
        
        System.out.println("La profundidad inicial del caracol es de: " + (int)profundidadCaracol);
        System.out.println("");

        while(dia<50 || profundidadCaracol<=0){
            
            contador =  1 + dia++;

            probabilidadLluvia = Math.random();

            if(probabilidadLluvia<=0.05){
                profundidadAgua = profundidadAgua + 5;
            }
            else if(probabilidadLluvia<=0.10){
                profundidadAgua = profundidadAgua + 2;
            }

            if(profundidadCaracol<profundidadAgua){
                probabilidadCoche = profundidadAgua + 1;
            }


            if(contador>9){
                distanciaSubida = Math.random()*((3-1)+1);
                distanciaBajada = Math.random()*((2-0)+0);
            }
            else if(contador>19){
                distanciaSubida = Math.random()*((2-1)+1);
                distanciaBajada = Math.random()*((2-0)+0);
            }
            else{
                distanciaSubida = Math.random()*((4-1)+1);
                distanciaBajada = Math.random()*((2-0)+0);
            }
            probabilidadCoche = Math.random();

            if(probabilidadCoche<0.35){
                profundidadCaracol = (int)profundidadCaracol - distanciaSubida + distanciaBajada + 2;
            }
            else{
                profundidadCaracol = (int)profundidadCaracol - distanciaSubida + distanciaBajada;
            }

            if((int)profundidadCaracol<profundidadAgua){
                profundidadCaracol = profundidadAgua + 1;
            }

            if((int)profundidadCaracol>profundidadPozo){
                profundidadCaracol = profundidadPozo - 1;
            }

            if(probabilidadCoche<0.35){
                System.out.println("       0-=-0        ");
            }
            for(int nivel=0;nivel<=profundidadPozo;nivel++){
        
                if(((int)profundidadCaracol)==nivel){
                    System.out.println("[] :.  _@)_/'  :. [] _ __" + nivel);
                }
                else if(nivel>profundidadPozo-profundidadAgua){
                    System.out.println("[] ~~~~~~~~~~~~~~ [] _ __" + nivel);
                }
                else{
                    System.out.println("[] :. :. :. :. :. [] _ __" + nivel);
                }
            }
            System.out.println("[] [] [] [] [] [] []");
            System.out.println("");

            DecimalFormat df = new DecimalFormat("0.00");

            System.out.print("Día: " + contador + "      ");
            System.out.print("El caracol subió " + df.format(distanciaSubida) + "m" + " y bajó " + df.format(distanciaBajada) +"m" + "     ");
            System.out.println("Este día el caracol está a: " + ((int)-profundidadCaracol) + " metros" );
            System.out.println("");
            
            if(probabilidadLluvia<=0.05){
                System.out.println("Este día hubo lluvia fuerte.");
                System.out.println("");
            }
            else if(probabilidadLluvia<=0.10){
                System.out.println("Este día hubo lluvia media.");
                System.out.println("");
            }
            if(probabilidadCoche<0.35){
                System.out.println("Este día pasó un coche cerca del pozo y el caracol bajó 2 metros.");
            }
            if((int)profundidadCaracol<=0){
                System.out.println("El caracol logró salir del pozo en el día: " + contador);
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.exit(1);
            }
        }
        System.out.println("El caracol no pudo salir del pozo y murió.");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("");
    }
}