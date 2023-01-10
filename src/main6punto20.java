import java.util.Scanner;

public class main6punto20 {
    public static void main(String[] args) {
        String frase = "";
        System.out.println("Introduce la frase que quieras separar: ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        frase = inputValue.nextLine();
        String[] palabrasSeparadas = frase.split(" ");

        for (int i = 0; i < palabrasSeparadas.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < palabrasSeparadas.length; j++) {
                if (palabrasSeparadas[j].toLowerCase().compareTo(palabrasSeparadas[index].toLowerCase()) < 0) {
                    index = j;
                }
            }
            String aux = palabrasSeparadas[index];
            palabrasSeparadas[index] = palabrasSeparadas[i];
            palabrasSeparadas[i] = aux;
        }
        for (int i=0; i<palabrasSeparadas.length;i++){
            System.out.println(palabrasSeparadas[i]);
        }
    }
}
