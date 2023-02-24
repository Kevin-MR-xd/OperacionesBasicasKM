
package operacionesbasicas;

/**
 *
 @author ElChistes(Kevin Moreno)
 * 
 * Programa para realizar operaciones básicas :
 * suma, resta, multiplicación y division.
 * 
 */

public class OperacionesBasicas {
    
    int valor1 = 10, valor2 = 8;
    float suma, resta, multiplicación, division;

    public void OperacionesSuma(){
        
        //Realiza el cálculo de la suma
        suma= valor1 + valor2;
        System.out.println("La suma es: " + suma);
      }
    public void OperacionesResta(){
          //Realiza el cálculo de la resta
        resta= valor1 - valor2;
        System.out.println("La resta es: " + resta);
    }
       
    public void OperacionesMulti(){    
         //Realiza el cálculo de la multiplicación
        multiplicación = valor1 * valor2;
        System.out.println("La multiplicación es: " + multiplicación);
    }
       
    public void OperacionesDiv(){    
        //Realiza el cálculo de la división
        division = valor1 / valor2;
        System.out.println("La division es: " + division);
    }

    public static void main(String[] args) {        
        OperacionesBasicas operacionessuma = new OperacionesBasicas();
        operacionessuma.OperacionesSuma();
        OperacionesBasicas operacionesresta = new OperacionesBasicas();
        operacionesresta.OperacionesResta();
        OperacionesBasicas operacionesmulti = new OperacionesBasicas();
        operacionesmulti.OperacionesMulti();
        OperacionesBasicas operacionesdiv = new OperacionesBasicas();
        operacionesdiv.OperacionesDiv();
    }
    
}
