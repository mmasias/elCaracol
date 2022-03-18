public class DavidCaracol{
    public static void main(String[] args){
        int day = 1;
        double altura= (Math.random() * 10);
        double dia;
        double noche;
        double coche = Math.random();
        double clima = Math.random();
        double profundidad = 0;
        int fondo = 20;
        System.out.print("El caracol ha caido en ");
        System.out.println(altura);
        while (day <=50 && altura <=20){
            System.out.print(" Dia = ");
             System.out.println(day);
            if (day >=10 && day <20 ){
                dia = Math.random() * 3;
            } else if ( day >=20){
                dia = Math.random() * 2;
            } else {
                dia = Math.random() * 4;
            }
            noche = Math.random() * 2;
            if ( clima <= 0.05){
                profundidad = profundidad + 5;    
                System.out.println("Llovio fuertemente, la profundidad ha disminuido a ");
                System.out.print(profundidad);        }
             else if ( clima > 0.05 && clima <= 0.20){
                    profundidad = profundidad + 2;
                    System.out.print("Llovio levemente, la profundidad ha disminuido a ");
                    System.out.println(profundidad);
                } else System.out.println("No llovio hoy...");
             if ( coche <=0.35){
                 altura = altura - 2;
             }
             altura = altura + dia - noche ;
             if (altura < profundidad){
                 altura = profundidad + 1;
                 System.out.print("El caracol ha flotado hasta");
                 System.out.println(altura);
            
             } 
             System.out.print("Subio de dia = ");
             System.out.println(dia);
             System.out.print("Cayo de noche = ");
             System.out.println(noche);
             if (coche<=0.35){
                System.out.println("Paso coche, el caracol cayo -2");
             } else {
                 System.out.println("No paso el coche..");
             }
             System.out.print("La altura total = ");
             System.out.println(altura);
             day = day + 1;
             //Imagen
             if (clima <= 0.05){
                System.out.println("//////////////////");
                System.out.println("//////////////////");
             } else if (clima > 0.05 && clima <= 0.20){
                System.out.println("::::::::::::::::::");
                System.out.println("::::::::::::::::::");
             }
             if (coche <= 0.35){
                    System.out.println("//.....O-=-O.....//");
             }
             for (int x = 0; x<=fondo; x++){
                 if (20 - ((int)altura) == x){
                    System.out.println("[].:.:_@)_/’.:.:[] _ ___ " +x);
                 } else if (x >(fondo -(((int)profundidad)))){
                    System.out.println("[]≈≈≈≈≈≈≈≈≈≈≈≈≈≈[] _ ___ " +x);
                 } else {
                    System.out.println("[].:.:.:.:.:.:.:[] _ ___ " +x);
                 }
             }
                System.out.println("[][-][-]-[-][-][]");
        } if (day > 50){
            System.out.println("El caracol ha muerto...");
        }
    }

    }