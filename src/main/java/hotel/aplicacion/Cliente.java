/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.aplicacion;

/**
 * Clase que representa un cliente en el sistema de gestión de reservas de un hotel.
 * La clase contiene información sobre el cliente, como su nombre, DNI y teléfono.
 * Además, incluye métodos para acceder a esa información y mostrarla.
 * @author Sergio
 */
public class Cliente {
    
     private static int contadorClientes = 0;
    private int codigo;
    
    //*Nombre del cliente*/
    private String nombre;
    
    //*DNI del cliente*/
    private String dni;
    
    //*Teléfono del cliente*/
    private String telefono;
    
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
   /**
    * Constructor de la clase Cliente.
    * 
    * Este constructor inicializa un nuevo objeto Cliente utilizando los valores proporcionados
    * para el nombre, DNI y teléfono del cliente. Además, valida el DNI mediante el método
    * Si el DNI no es válido, se lanzará una excepción.
    *
    * @param nombre el nombre del cliente. No puede ser {@code null} ni vacío.
    * @param dni el DNI del cliente. Debe tener un formato válido según las reglas definidas.
    * @param telefono el número de teléfono del cliente.
    * @throws Exception si el DNI no es válido o si ocurre cualquier error de validación.
    */
    public Cliente(String nombre, String dni, String telefono) throws Exception {
        // Validación del DNI, si no es correcto no creará el objeto
        Utilidades.validarDNI(dni); 
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.codigo = obtenerNumeroCliente();
    }

        private static int obtenerNumeroCliente() {
        contadorClientes++;
        return contadorClientes;
    }

    /**
    * Devuelve una representación en formato de texto de la información del cliente.
    * 
    *
    * @return una cadena de texto que contiene el código, nombre, DNI y teléfono del cliente.
    */
    public String mostrarInformacion() {
        return "Código: " + codigo + ", Nombre: " + getNombre() + ", DNI: " + getDni() + ", Teléfono: " + getTelefono();
    }
}
