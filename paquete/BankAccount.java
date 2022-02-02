
package paquete;

/**
 *
 * @author JUANES
 */
public class BankAccount {
    private int accountNumer;
    boolean activated = false;
    
    
    //constructor 
    public BankAccount(){
        this.accountNumer = 1234567890;
    }
    
    public void getActived(){
        this.activated = true;
        System.out.println("la cuenta " + accountNumer + " esta activada");
    }
    
    public void setActived(){
        if(activated == false){
            System.out.println("la cuenta "+ accountNumer +" esta desactivada");
        } else {
            System.out.println("la cuenta " +  accountNumer +" esta activada");
        }
    }










}

