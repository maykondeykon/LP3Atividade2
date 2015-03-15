package classes;

/**
 *
 * @author maykon
 */
public class Radio extends Produto
{
    
    private Double estacao;
    private String banda;

    public Radio(Double serial) 
    {
        super(serial);
    }
    
    public void trocaEstacao(Double estacao)
    {
        this.estacao = estacao;
    }
    
    public void trocaBanda(String banda)
    {
        this.banda = banda;
    }
    
    public String escutar()
    {
        return "estação = "+this.estacao+" "+this.banda;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+"; produto = Rádio; "+this.escutar();
    }
    
}
