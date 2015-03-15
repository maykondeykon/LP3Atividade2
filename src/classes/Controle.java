package classes;

/**
 *
 * @author maykon
 */
public class Controle 
{
 
    private Produto produto;
    
    public Controle(Produto produto)
    {
        this.produto = produto;
    }
    
    public String testar()
    {
        try {
            boolean teste = this.produto.testar();
            return this.produto.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
        
    }
}
