package classes;

/**
 *
 * @author maykon
 */
public class Produto 
{
    protected Double serial;
    protected Integer volume;
    protected String status = "não testado";
    
    public Produto(Double serial)
    {
        this.serial = serial;
    }
    
    public boolean testar() throws Exception
    {
        if(!"não testado".equals(this.status)){
            throw new Exception("Teste já realizado");
        }
        if(0.0 == this.serial) {
            this.status = "Reprovado";
            return false;
        }
        this.status = "Aprovado";
        return true;
    }
    
    public Double getSerial()
    {
        return this.serial;
    }
    
    public void setVolume(Integer volume)
    {
        this.volume = volume;
    }
    
    public Integer getVolume()
    {
        return this.volume;
    }
    
    public String toString()
    {
        return "serial = "+this.serial+"; volume = "+this.volume+"; teste = "+this.status;
    }
    
}
