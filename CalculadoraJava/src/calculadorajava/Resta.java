
package calculadorajava;

/**
 *
 * @author Alfredo
 */
public class Resta extends Operaciones {
    double resta;

    public Resta(double num1, double num2) {
        super(num1,num2,'-');
        this.resta = num1 - num2;
        this.setResultado(this.resta);
        
    }

}

