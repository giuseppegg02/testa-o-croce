import java.io.*;
import java.util.Random;
public class Moneta
{
    public Moneta(){
    
    }
    
    public void lancioSingolo(String gioca1,String gioca2){
            int r;
            Random rand = new Random();
            r=rand.nextInt(100);
            if(r<=49)
                System.out.println("TESTA    Il giocatore "+gioca1+" ha vinto.\n");
            else
                System.out.println("CROCE    Il giocatore "+gioca2+" ha vinto.\n");

        }
    public void lancioMultiplo(int nl){
        byte  tes=0,cro=0;
        double ptes,pcro;
            for(byte i=0;i<nl;i++){
                int r;
                Random rand = new Random();
                r=rand.nextInt(100);
                if(r<=49){
                    System.out.println("Il "+(i+1)+"° lancio risulta TESTA");
                    tes++;
                }else{                
                    System.out.println("Il "+(i+1)+"° lancio risulta CROCE");
                    cro++;
                }
            }
          System.out.println(tes);
          System.out.println(cro);
        ptes=((double)tes/nl)*100;
        pcro=((double)cro/nl)*100;
        System.out.println("\n-Percentuale TESTA "+ptes+"%\n"+"-Percentuale CROCE "+pcro+"%\n");
    }
}
