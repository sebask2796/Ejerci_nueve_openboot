package ejercicio_9;

/**
 *
 * @author sebas
 */
public class Ejercicio_9 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Angel";
        cliente.edad = 37;
        cliente.telefono = 350775129;
        cliente.credito = 999.000;
        System.out.println(" Hola Soy " + cliente.nombre + ", mi edad es " + cliente.edad + " años y mi telefono es " + cliente.telefono
                + " y el credito disponible que tengo es " + cliente.credito + "COP");
        
        
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Sebastian";
        trabajador.edad = 56;
        trabajador.telefono =31583213;
        trabajador.salario = 750.000;
        System.out.println("Hola Soy " + trabajador.nombre + ",mi edad es " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
                + " y mi salario es de " + trabajador.salario + "COP");

    }
}

class Persona{
    int edad;
    int telefono;
    String nombre;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona {
    double salario;
}
    
    

