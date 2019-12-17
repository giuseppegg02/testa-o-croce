import java.util.Random;
import java.io.*;
public class Gioco
{
    public static void main(String args[]) throws Exception{
        String gioca1,gioca2;
        Moneta m=new Moneta();
        Input cin=new Input();
        int scelta,nl;
        do{
            System.out.println("0.Uscita;");
            System.out.println("1.Lancio singolo con gioco tra due giocatori;");
            System.out.println("2.Lancio multiplo con probabilità.");
            scelta=cin.readInt();
            switch (scelta){
                case 0: System.out.println("Uscita;");
                    break;
                case 1: System.out.println("Inserire nome giocatore 1(Testa):");
                        gioca1=cin.readString();
                        System.out.println("Inserire nome giocatore 2(Croce):");
                        gioca2=cin.readString();
                        m.lancioSingolo(gioca1,gioca2);
                    break;
                case 2: System.out.println("Inserire il numero di volte da lanciare la moneta: ");
                        nl=cin.readInt();
                        m.lancioMultiplo(nl);
            }
    }while(scelta!=0); 
    }
}
