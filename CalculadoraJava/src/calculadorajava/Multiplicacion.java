
package calculadorajava;

/**
 *
 * @author Alfredo
 */
public class Multiplicacion extends Operaciones{
    
    double multiplicacion;
    
    public Multiplicacion(double num1, double num2) {
        super(num1, num2, '*');
        this.multiplicacion = num1 * num2;
        this.setResultado(this.multiplicacion);
    }
    
    
}
