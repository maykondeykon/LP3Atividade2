package classes;

/**
 *
 * @author maykon
 */
public class Coisa 
{
    
    protected String tipo;
    protected String ganha;
    protected String perde;
    
    public String getTipo()
    {
        return this.tipo;
    }
    
    public Boolean ganha(Coisa coisa) throws Exception
    {
        Boolean empate = this.empate(coisa);
        if(!empate){
            return coisa.tipo.equals(this.ganha);
        }else{
            throw new Exception("Empate");
        }
    }
    
    private Boolean empate(Coisa coisa)
    {
        return coisa.getClass().equals(this.getClass());
        
    }
    
}
