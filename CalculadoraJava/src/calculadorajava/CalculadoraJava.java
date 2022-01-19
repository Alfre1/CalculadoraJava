
package calculadorajava;

/**
 *
 * @author Alfredo
 */
public class CalculadoraJava {
    public static void main(String[] args) {
      double num1= 5;
      double num2=10;
      
      //suma
      Suma suma = new Suma(num1,num2);
      suma.MostrarResultado();
     
      //Resta
      Resta resta = new Resta(num1, num2);
      resta.MostrarResultado();
      
      //Multiplicacion
      Multiplicacion multi = new Multiplicacion(num1,num2);
      multi.MostrarResultado();
      
      //Division
      Division division = new Division(num1, num2);
      division.MostrarResultado();
      
    }
    
}
