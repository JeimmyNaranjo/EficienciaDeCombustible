
import java.util.Scanner;
/**
 * Convierte la eficiencia de combustible  en MPG (millas por galon americano)
 * a LPK (litros por kilometro)
 * 
 * @author Jeimmy Naranjo
 * @version 1
 */
public class PrincipalEficiencia  //Declaracion de la clase Principal
{
    public static void main(String[] args) 
    {
        // Datos de entrada: Eficiencia de combustible em MPG
        // 1. Definicion de variables
        // Datos de entrada
        double MPG;
        // Datos de salida
        double LPK;
        // Variables adicionales
        double galon, litro, milla, kilometro;
        // Necesito acceso al teclado
        Scanner teclado = new Scanner(System.in);
        // Preguntar datos de entrada
        System.out.print("Ingrese eficiencia de combustible americano:");
        MPG = teclado.nextDouble();
        // 2. Realizar calculos
        galon = 3.78541; // 1galon = 3.78541litros
        milla = 1.60934; // 1milla = 1.60934kilometros
        kilometro = MPG * milla; // (milla/galon)*(km/milla)= km/galon
        LPK = galon / kilometro; // litro/km
                
        // 3. Mostrar datos de salida
        System.out.println("El equivalente de" + MPG +"MPG es de:" + LPK +"LPK");
       
                                 
      
         
  } //Fin de la clase principal
}