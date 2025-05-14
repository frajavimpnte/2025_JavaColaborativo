
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A {
    public String S;      // Cadena patrón del corazón sano
    public int N;         // Número de electrocardiogramas
    public String[] P;    // Arreglo con los electrocardiogramas a evaluar

    public static void main(String[] args) throws IOException {
        A m = new A();
        m.leerDatos();
        m.resolver();
    }

    public void leerDatos() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        S = in.readLine();                 // Leer cadena S
        N = Integer.parseInt(in.readLine()); // Leer cantidad de electrocardiogramas
        P = new String[N]; // Inicializar arreglo de electrocardiogramas

        for (int i = 0; i < N; i++) { // Leer cada electrocardiograma
            // y almacenarlo en el arreglo P
            P[i] = in.readLine();
        }
    }

    public void resolver() {
        for (int i = 0; i < N; i++) { // Iterar sobre cada electrocardiograma
            String actual = P[i]; // Electrocardiograma actual

            if (actual.length() % S.length() == 0) { // Verificar si la longitud es múltiplo de S
                int repeticiones = actual.length() / S.length();// Calcular cuántas veces se repite S
                StringBuilder sb = new StringBuilder(); // Usar StringBuilder para construir la cadena
                for (int j = 0; j < repeticiones; j++) { // Repetir S
                    sb.append(S); // Agregar S al StringBuilder
                }
                if (sb.toString().equals(actual)) { // Comparar con el electrocardiograma actual
                    System.out.println("Yes"); // Si son iguales, imprimir "Yes"
                } else {
                    System.out.println("No");// Si no son iguales, imprimir "No"
                }
            } else {
                System.out.println("No"); // Si la longitud no es múltiplo, imprimir "No"
            }
        }
    }
}
