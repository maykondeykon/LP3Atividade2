package classes;

/**
 *
 * @author maykon
 */
public class TV extends Produto
{
    private String canal;

    public TV(Double serial) {
        super(serial);
    }
    
    public String assistir()
    {
        return this.canal;
    }
    
    public void trocaCanal(String canal)
    {
        this.canal = canal;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+"; produto = TV;  assistindo "+this.canal;
    }
    
}
