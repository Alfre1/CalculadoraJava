
package calculadorajava;

/**
 *
 * @author Alfredo
 */
public class Division extends Operaciones {
    
    double division = 0;
    
    public Division(double num1, double num2) {
        super(num1, num2, '/');
        if(num2==0 & num1==0){
            System.out.println("No se puede dividir entre cero");
        }else{
            this.division = num1 / num2;
        }
        this.setResultado(this.division);
    }
    
    
}
