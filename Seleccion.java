import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Scanner;

public class Seleccion {
    // Variable -> estado
    // Metodos -> comportamiento

    // tipos de datos primitivos
    // int, float, double, char, boolean

    Scanner NuevaSeleccion = new Scanner(System.in);
    

    String nombreEquipo;
    char grupo;
    boolean esLocal;
    final String nombreDeEstePlaneta = "Tierra";
    Scanner myScanner;

    void mostrarInfo() { // metodo
        System.out.println("Nombre: " + nombreEquipo);
        System.out.println("Grupo: " + grupo);
        System.out.println("Es local: " + esLocal);
    }

    public void myFunction(int a, int b) {
        System.out.println("La suma de a y b es: " + (a + b));
    }

    public static void main(String[] args) {

        String myString = "Hola";
        myString = "Hola Mundo";
        System.out.println(myString);

        Seleccion colombia = new Seleccion();
        colombia.nombreEquipo = "Colombia";
        colombia.grupo = 'A';
        colombia.esLocal = true;

        colombia.mostrarInfo();

        // if statement (condicion)

        if(colombia.esLocal == true) {
            System.out.println("Colombia es local");
        } else if(colombia.esLocal == false) {
            System.out.println("Colombia no es local");
        }

        // Bucle (ciclo)

        //for loop

        for(int i = 1; i < 11; i++){
            System.out.println("Asiento: " + i);
        }

        //while loop

        int j = 1;

        while(j<11){

            System.out.println("Asiento: " + j);
            j++;

        }

        //Excepciones

        int x = 0;
        int z = 5;

        // try catch

        try {
            System.out.println(z/x);
        } catch (Exception exception) {
            System.out.println("No se puede dividir por cero");
        }

        // API

        ArrayList<String> Selecciones = new ArrayList<>();
        Selecciones.add("Francia");
        Selecciones.add("Alemania");
        Selecciones.add("Brasil");
        Selecciones.add("Argentina");

        System.out.println(Selecciones);

        
        List<String> myArrayList = new ArrayList<>();
        myArrayList.add("Hola");
        System.out.println(myArrayList + "Hola hola XD");

        // HashMap

        Map<String, String> nombreDelHasMap = new HashMap<>();
        nombreDelHasMap.put("Nombre", "Juan");
        nombreDelHasMap.put("Apellido", "Perez");
        System.out.println(nombreDelHasMap.get("Nombre") + " " + nombreDelHasMap.get("Apellido"));

        // Scanner

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = myScanner.nextLine();
        System.out.println("Hola " + nombre);
        myScanner.close();

    }
}