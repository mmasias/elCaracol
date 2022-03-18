class elCaracol{
    public static void main(String[] args){
        
        int profundidadPozo = 20;
        int profundidadAgua = 0;
        int profundidadCaracol = (int)(Math.random()*20+1);


        System.out.println("[===]               [===]");
        for (int i=0;i<=profundidadPozo;i++){
            if (i==profundidadCaracol) {
                System.out.println("  [=]   _(@;_/'     [=] _ ___ "+i);
            } else if (i>(profundidadPozo-profundidadAgua)) {
                System.out.println("  [=]~~~~~~~~~~~~~~~[=] _ ___ "+i);
            } else {
                System.out.println("  [=]:. :. :. :. :. [=] _ ___ "+i);
            }
        }
        System.out.println("  [=][=][=][=][=][=][=]");
    }
}