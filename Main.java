import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = null;
        DataTypeExamples examples = new DataTypeExamples();

        while (true) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Crear lista simplemente enlazada");
            System.out.println("2. Crear lista doblemente enlazada");
            System.out.println("3. Crear lista circular");
            System.out.println("4. Insertar elemento");
            System.out.println("5. Eliminar elemento");
            System.out.println("6. Buscar elemento");
            System.out.println("7. Mostrar lista");
            System.out.println("8. Ver ejemplos de tipos de datos");
            System.out.println("9. Salir");
            System.out.print("Elige una opcion: ");

            int opcion;
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, escribe un numero valido.");
                continue;
            }

            switch (opcion) {
                case 1 -> {
                    list = new LinkedList(false, false);
                    System.out.println("Lista simplemente enlazada creada.");
                }
                case 2 -> {
                    list = new LinkedList(true, false);
                    System.out.println("Lista doblemente enlazada creada.");
                }
                case 3 -> {
                    list = new LinkedList(false, true);
                    System.out.println("Lista circular creada.");
                }
                case 4 -> {
                    if (list == null) {
                        System.out.println("Primero crea una lista.");
                        break;
                    }
                    System.out.print("Ingresa el elemento a insertar: ");
                    String data = sc.nextLine();
                    list.insert(data);
                }
                case 5 -> {
                    if (list == null) {
                        System.out.println("Primero crea una lista.");
                        break;
                    }
                    System.out.print("Ingresa el elemento a eliminar: ");
                    String data = sc.nextLine();
                    list.delete(data);
                }
                case 6 -> {
                    if (list == null) {
                        System.out.println("Primero crea una lista.");
                        break;
                    }
                    System.out.print("Elemento a buscar: ");
                    String data = sc.nextLine();
                    boolean found = list.search(data);
                    System.out.println(found ? "Encontrado :) " : "No encontrado :( ");
                }
                case 7 -> {
                    if (list == null) {
                        System.out.println("Primero crea una lista.");
                        break;
                    }
                    list.display();
                }
                case 8 -> {
                    System.out.println("\n=== Ejemplos de tipos de datos ===");
                    examples.showPrimitivesExample();
                    examples.showContactExample();
                    examples.showLinkedListExample();
                }
                case 9 -> {
                    System.out.println("Saliendo del programa... ");
                    return;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }
}

