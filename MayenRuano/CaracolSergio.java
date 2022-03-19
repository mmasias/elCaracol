package MayenRuano;
import java.util.Scanner;

public class CaracolSergio{
    public static void main(String[] args){

        Scanner siguente = new Scanner(System.in); 

        int profundidad = 20, dias = 0, agua = 0;
        double caracolsube = (int)(Math.random()*(11)), sube = 0.0, cae = 0.0, carro = 0.0, clima = 0.0;

        do{
            dias = dias +1;
            if(dias <= 1 && dias >=19){
                sube = (int)(Math.random()*(4)+1);
            }else if(dias >20 ){
                sube = (int)(Math.random()*(3)+1);
            }

            carro = Math.random();
            if(carro <=0.35){
                caracolsube = caracolsube -2;
            }

            clima = Math.random();
            if(clima <=0.05){
                agua = agua - 5;
            }else if(clima > 0.05 && clima <=0.15){
                agua = agua - 2;
            }

            cae = (int)(Math.random()*(3));
            caracolsube = caracolsube + cae - sube;
            
            if(caracolsube < agua){
                caracolsube = agua +1;
            }

            String c = "";
			if(carro<0.35){c = "Si";}else{c = "No";}
			String cl = "";
			if(clima<=0.05){cl = "Lluvia fuerte";}else if(clima > 0.05 && clima <= 0.15){cl = "Lluvia";}else{cl="Soleado";}
			System.out.println("Día: ["+dias+"] / Sube: ["+sube+"] / Baja: ["+cae+"] / Altura: ["+caracolsube+"] / Coche: [" + c + "] / Clima: ["+cl+"]");
			System.out.println(" ");
            siguente.nextLine();


        }while(caracolsube < 20 && dias < 50);
		if(dias >= 50 && caracolsube < 20){
			System.out.println("El caracol se murio y no pudo salir sel pozo");
        }if(caracolsube <= 20){
            System.out.println("El caracol logró salir al mundo exteriror");
        }

    }

}