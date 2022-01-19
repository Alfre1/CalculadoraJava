
package calculadorajava;

/**
 *
 * @author Alfredo
 */
public class Suma extends Operaciones{
    double suma;
    public Suma(double num1, double num2) {
        super(num1, num2,'+');
        this.suma = num1 + num2;
        this.setResultado(this.suma);
    }

   
    
    
}
