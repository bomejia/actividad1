/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julio
 */
public class DataTypeExamples {

    public void showPrimitivesExample() {
        int edad = 20;
        double promedio = 8.5;
        boolean activo = true;
        System.out.println("Edad: " + edad + ", Promedio: " + promedio + ", Activo: " + activo);
    }

    class Contact {

        String nombre;
        String direccion;
        String telefono;

        Contact(String nombre, String direccion, String telefono) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefono = telefono;
        }

        @Override
        public String toString() {
            return nombre + " | " + direccion + " | " + telefono;
        }
    }

    /**
     *
     */
    public void showContactExample() {
        Contact c = new Contact("Alana", "Monterrey", "8123456789");
        System.out.println("Ejemplo de contacto: " + c);
    }

    public void showLinkedListExample() {
        LinkedList list = new LinkedList(false, false);
        list.insert("Rodrigo");
        list.insert("Alana");
        list.insert("Leonardo");
        list.display();
    }
}
