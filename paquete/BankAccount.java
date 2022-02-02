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
    
    
    //constructor 
    public BankAccount(){
        this.accountNumer = 1234567890;
    }
    
    //metodos
    
    /**
     * Activa la cuenta ya que se inicializo como false;
     */
    public boolean getActived(){
        this.activated = true;
        System.out.println("la cuenta " + accountNumer + " esta activada");
        return activated;
    }
    /**
     * En caso de instanciar este metodo antes del getActived, la cuenta nos arroja que esta desactiva.
     * Pero si se instancia primero este metodo la cuenta siempre nos indicara que esta activada.
     */
    public void setActived(){
        if(this.activated == false){
            System.out.println("la cuenta "+ accountNumer +" esta desactivada");
        } else {
            System.out.println("la cuenta " +  accountNumer +" esta activada");
        }
    }
}

