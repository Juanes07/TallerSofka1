package paquete;
/**
 *
 * @author JUANES
 */
public class BankAccount {
    /**
     * variables nativas de clase
     */
    private int accountNumer;
    boolean activated = false;
    
    
    /**
     * constructor
     */
    public BankAccount(){
        this.accountNumer = 1234567890;
    }
    
    //metodos
    
    /**
     * Se activa la cuenta en modo true ya que fue inicializada en false
     * @return cuenta activada
     */
    public boolean getActived(){
        this.activated = true;
        System.out.println("la cuenta " + accountNumer + " esta activada");
        return activated;
    }
    /**
     * Desactivamos la cuenta, dandole un valor false a activated
     */
    public void setActived(){
        this.activated = false;
        System.out.println("la cuenta "+ accountNumer +" esta desactivada");
    }
}

