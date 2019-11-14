import java.util.Scanner;
/**
 *  @author Oskar Contreras 
 *  
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 *  
 */
public class AppDemoBucles
{

    /**
     *  Punto de entrada a la aplicación. Dentro del main:
     *  - define y crea el teclado  
     *  - define e instancia un objeto DemoBucles
     *  - pide la cantidad tope  máxima de aleatorios a generar
     *  - valida que ese tope esté entre 10 y 15
     *  - muestra los números generados como suma de potencias de 2
     *  
     *  - haz una pausa y borra la pantalla 
     *  
     *  - muestra la figura para 6 escalones de alto = 4 y ancho = 12
     *  
     *  
     */
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        DemoBucles prueba = new DemoBucles();
        int maximo = 0;
        int mal = 0;
        while(maximo <= 10 || maximo >= 15){
            prueba.escribirSumaPotencias(maximo);
            Utilidades.hacerPausa();
            Utilidades.borrarPantalla();
            prueba.mostrarEscalera(6, 4, 12);
        }
        //for(String stringMal = ""; mal > 0; mal++){
        //// System.out.println(stringMal + "Teclee tope de a
        // leatorios a generar [10, 15]: ");
        // tope = teclado.nextInt();
    }

}

