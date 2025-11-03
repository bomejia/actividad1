public class Main {
    public static void main(String[] args) {
        System.out.println("EJEMPLO DE LISTAS ENLAZADAS GENÉRICAS\n");

        // Lista simplemente enlazada de enteros
        LinkedList<Integer> listaEnteros = new LinkedList<>();
        listaEnteros.insertar(10);
        listaEnteros.insertar(20);
        listaEnteros.insertar(30);
        System.out.println("Lista de enteros:");
        listaEnteros.mostrar();

        // Lista de cadenas
        LinkedList<String> listaCadenas = new LinkedList<>();
        listaCadenas.insertar("Hola");
        listaCadenas.insertar("Mundo");
        listaCadenas.insertar("Java");
        System.out.println("\nLista de cadenas:");
        listaCadenas.mostrar();

        // Lista de objetos tipo Contact
        LinkedList<Contact> listaContactos = new LinkedList<>();
        listaContactos.insertar(new Contact("Rodrigo", "Monterrey", "8112345678"));
        listaContactos.insertar(new Contact("Alana", "San Pedro", "8123456789"));
        listaContactos.insertar(new Contact("Carlos", "Guadalupe", "8134567890"));
        System.out.println("\nLista de contactos:");
        listaContactos.mostrar();

        // Eliminación de un elemento
        listaEnteros.eliminar(20);
        System.out.println("\nDespués de eliminar 20 de la lista de enteros:");
        listaEnteros.mostrar();

        // Búsqueda de un elemento
        System.out.println("\n¿Existe 'Java' en la lista de cadenas?");
        System.out.println(listaCadenas.buscar("Java") ? "Sí, se encontró." : "No se encontró.");

        System.out.println("\nFin de la demostración.");
    }
}
