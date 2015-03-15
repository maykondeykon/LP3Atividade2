package classes;

/**
 *
 * @author maykon
 */
public class Pedra extends Coisa
{
    public Pedra()
    {
        super.tipo = "Pedra";
        super.perde = "Papel";
        super.ganha = "Tesoura";
    }
}
