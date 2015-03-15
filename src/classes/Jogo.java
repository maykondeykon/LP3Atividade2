package classes;

import java.util.Random;

/**
 *
 * @author maykon
 */
public class Jogo 
{
    private Coisa[] coisas;
    
    public Jogo()
    {
        this.coisas = new Coisa[4];
        this.coisas[1] = new Pedra();
        this.coisas[2] = new Papel();
        this.coisas[3] = new Tesoura();
    }

    public void jogar()
    {
        Coisa coisa1 = this.getCoisa();
        
        Coisa coisa2 = this.getCoisa();
        
        System.out.println("--"+coisa1.getTipo()+" Vs "+coisa2.getTipo()+"--");
        
        try {
            Boolean ganha = coisa1.ganha(coisa2);
            if(ganha){
                System.out.println(coisa1.getTipo()+" ganha de "+coisa2.getTipo());
            }else{
                System.out.println(coisa2.getTipo()+" ganha de "+coisa1.getTipo());
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private Coisa getCoisa()
    {
        Random r = new Random();
        int min = 1;
        int max = 4;
        
        int R = r.nextInt(max-min) + min;
        
        return this.coisas[R];
    }
}
