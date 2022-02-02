package paquete;
import java.util.ArrayList;
import java.util.Date;	
import java.util.HashSet;
import paquete.Person;
import paquete.Fruits;
import paquete.BankAccount;
import paquete.Phone;


/**
 *
 * @author JUANES
 */
public class Main {

    public static void main(String[] args) {
        Person p;
        p = new Person();
        p.SetName("Jonathan", "Velasquez", "Posada");
        p.getHeight();
        p.getName();
        
        Fruits f;
        f = new Fruits();
        f.getColor();
        f.setColor("verde","amarillo","rojo");
        
        BankAccount bk;
        bk = new BankAccount();
        bk.setActived();
        //como la variable activated se inicializo en false, al instanciar el metodo setActived nos arroja que la cuenta esta desactiva.
        //pero si instanciamos primero el metodo getActived y luego el metodo setActived este ultimo nos arroja que la cuenta esta activa
        bk.getActived();
        
        
        
        
 
    }
    
}
