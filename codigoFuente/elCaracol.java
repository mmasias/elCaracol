class elCaracol{
    public static void main(String[] args){
        
        int profundidadPozo = 20;
        int profundidadAgua = 0;
        int profundidadCaracol = (int)(Math.random()*20+1);
        
        final String bordePozo  = "[===]               [===]"; 
        final String pozo       = "  [=]:. :. :. :. :. [=]";
        final String elCaracol  = "  [=]   _(@;_/'     [=]";
        final String pozoAgua   = "  [=]~~~~~~~~~~~~~~~[=]";
        final String fondoPozo  = "  [=][=][=][=][=][=][=]";

        System.out.println(bordePozo);
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
}