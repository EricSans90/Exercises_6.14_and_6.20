import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int elegir=0;
        //Máximo 10 contactos
        String contactos []=new String[10];
        int cantidadContactos =0;
        while (elegir !=4) {
            System.out.println("¿Qué quieres hacer? \n 1- Añadir un nuevo contacto \n 2- Buscar el teléfono de " +
                    "un contacto a partir de su nombre \n 3- Mostrar la info de todos los contactos ordenados" +
                    "alfabéticamente por el nombre \n 4-Terminar");
            Scanner inputValue;
            inputValue = new Scanner(System.in);
            elegir = inputValue.nextInt();
            switch (elegir){
                case 1:
                {
                    String auxNombre = "", auxNumero = "", auxContacto ="";
                    System.out.println("Escribe el nombre del contacto:");
                    Scanner inputValue1;
                    inputValue1 = new Scanner(System.in);
                    auxNombre = inputValue1.next();
                    System.out.println("Escribe el número del contacto:");
                    Scanner inputValue2;
                    inputValue2 = new Scanner(System.in);
                    auxNumero = inputValue2.next();
                    auxContacto=auxNombre+":"+auxNumero;
                    contactos[cantidadContactos]=auxContacto;
                    cantidadContactos+=1;
                }
                break;
                case 2:
                {
                    String nombreABuscar;
                    String [] contactosNombre = new String[contactos.length];
                    String [] contactosNumero = new String[contactos.length];
                    for (int i=0; i<cantidadContactos; i++){
                        String[] contactoSeparado = contactos[i].split(":");
                        contactosNombre[i]=contactoSeparado[0];
                        contactosNumero[i]=contactoSeparado[1];
                }
                    System.out.println("Escribe el nombre del contacto del que quieras su teléfono:");
                    Scanner inputValue1;
                    inputValue1 = new Scanner(System.in);
                    nombreABuscar = inputValue1.next();
                    for (int i=0; i< cantidadContactos; i++){
                        if (contactosNombre[i].equals(nombreABuscar)){
                            System.out.println("El número de "+contactosNombre[i]+" es "+contactosNumero[i]);
                        }
                    }

                }
                break;
                case 3:
                {

                }
                break;
                case 4:
                break;
                default:
                    System.out.println("Error");
                    elegir=4;
            }
        }
    }
}
