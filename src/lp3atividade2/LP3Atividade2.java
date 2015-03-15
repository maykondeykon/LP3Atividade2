package lp3atividade2;

import classes.Controle;
import classes.Jogo;
import classes.Papel;
import classes.Pedra;
import classes.Produto;
import classes.Radio;
import classes.TV;
import classes.Tesoura;

/**
 *
 * @author maykon
 */
public class LP3Atividade2 {

    
    public static void main(String[] args) {
        questao2();
        
    }
    
    static void questao1()
    {
        Double serial = java.lang.Math.random();
        
        Produto produto = new Produto(serial);
        produto.setVolume(32);
        
        System.out.println("produto = "+produto.toString());
        
        //Testando o produto
        Boolean testado;
        try {
            testado = produto.testar();
            System.out.println("testado = "+testado);
        } catch (Exception ex) {
            System.out.println("Excessão: "+ ex.getMessage());
        }
        
        System.out.println("produto = "+produto.toString());
        
        //Tentando testar o produto novamente
        try {
            testado = produto.testar();
            System.out.println("testado = "+testado);
        } catch (Exception ex) {
            System.out.println("Excessão: "+ ex.getMessage());
        }
    }
    
    static void questao1a()
    {
        Double serial = java.lang.Math.random();
        Radio radio = new Radio(serial);
        
        radio.trocaBanda("FM");
        radio.trocaEstacao(94.9);
        
        System.out.println(radio.escutar());
        
        System.out.println(radio.toString());
    }
    
    static void questao1b()
    {
        Double serial = java.lang.Math.random();
        TV tv = new TV(serial);
        
        tv.trocaCanal("rede globo");
        System.out.println("assistindo "+tv.assistir());
        
        System.out.println(tv.toString());
    }
    
    static void questao1c()
    {
        Double serial;
        serial = java.lang.Math.random();
        Radio radio = new Radio(serial);
        radio.trocaBanda("FM");
        radio.trocaEstacao(94.9);
        
        Controle controle = new Controle(radio);
        
        System.out.println("Testando: "+controle.testar());
        System.out.println("Testando: "+controle.testar());
        
        serial = java.lang.Math.random();
        TV tv = new TV(serial);
        tv.trocaCanal("rede globo");
        
        Controle controle2 = new Controle(tv);
        
        System.out.println("Testando: "+controle2.testar());
        System.out.println("Testando: "+controle2.testar());
        
    }
    
    static void questao2()
    {
        Jogo jogo = new Jogo();
        
        for (int i = 0; i < 6; i++) {
            jogo.jogar();
        }
        

    }
    
}
