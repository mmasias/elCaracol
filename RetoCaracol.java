import java.lang.Math;
import java.text.DecimalFormat;
public class RetoCaracol{
    public static void main(String[] args){
        
        int profundidad, profundidadA, dia, contador;
        double profundidadC,distanciaS,distanciaB,probabilidadC,probabilidadL;

        profundidad = 20;
        dia = 0;
        profundidadC = (Math.random()*(20-10))+10;
        profundidadA = 0;
        
        System.out.println("La profundidad inicial del caracol es de: " + (int)profundidadC);
        System.out.println("");

        while(dia<50 || profundidadC<=0){
            
            contador =  1 + dia++;

            if(contador>9){
                distanciaS = Math.random()*((3-1)+1);
                distanciaB = Math.random()*((2-0)+0);
            }
            else if(contador>19){
                distanciaS = Math.random()*((2-1)+1);
                distanciaB = Math.random()*((2-0)+0);
            }
            else{
                distanciaS = Math.random()*((4-1)+1);
                distanciaB = Math.random()*((2-0)+0);
            }

            probabilidadC = Math.random();

            if(probabilidadC<0.35){
                profundidadC = (int)profundidadC - distanciaS + distanciaB + 2;
            }
            else{
                profundidadC = (int)profundidadC - distanciaS + distanciaB;
            }
            
            probabilidadL = Math.random();

            if(probabilidadL<=0.05){
                profundidadA = profundidadA + 5;
            }
            else if(probabilidadL<=0.10){
                profundidadA = profundidadA + 2;
            }

            if((int)profundidadC>profundidad){
                profundidadC = 20;
            }

            for(int nivel=0;nivel<=profundidad;nivel++){
        
                if(((int)profundidadC)==nivel){
                    System.out.println("[] :.  _@)_/'  :. [] _ __" + nivel);
                }
                else if(nivel>profundidad-profundidadA){
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
            System.out.print("El caracol subió " + df.format(distanciaS) + "m" + " y bajó " + df.format(distanciaB) +"m" + "     ");
            System.out.println("Este día el caracol está a: " + ((int)-profundidadC) + " metros" );
            System.out.println("");
            
            if(probabilidadL<=0.05){
                System.out.println("Este día hubo lluvia fuerte.");
                System.out.println("");
            }
            else if(probabilidadL<=0.10){
                System.out.println("Este día hubo lluvia media.");
                System.out.println("");
            }
            if(probabilidadC<0.35){
                System.out.println("Este día pasó un coche cerca del pozo y el caracol bajó 2 metros.");
            }
            if((int)profundidadC<=0){
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