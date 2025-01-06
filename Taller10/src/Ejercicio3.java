import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random random = new Random();
        int numEstudiantes = 28;
        String[] nombres = new String[numEstudiantes];
        double[] acd = new double[numEstudiantes];
        double[] ape = new double[numEstudiantes];
        double[] aa = new double[numEstudiantes];
        double[] promedio = new double[numEstudiantes];
        
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = tcl.nextLine();
        }
        double sumaPromedios = 0;
        for (int i = 0; i < numEstudiantes; i++) {
            acd[i] = random.nextDouble() * 10; 
            ape[i] = random.nextDouble() * 10;
            aa[i] = random.nextDouble() * 10;
            promedio[i] = acd[i] * 0.35 + ape[i] * 0.35 + aa[i] * 0.30;
            sumaPromedios += promedio[i];
        }
        double promedioCurso = sumaPromedios / numEstudiantes;
        System.out.printf("\nPromedio del curso: %.2f\n", promedioCurso);
        System.out.println("\nEstudiantes con promedio por encima del promedio del curso:");
        for (int i = 0; i < numEstudiantes; i++) {
            if (promedio[i] > promedioCurso) {
                System.out.printf("%s: %.2f\n", nombres[i], promedio[i]);
            }
        }
        System.out.println("\nEstudiantes con promedio por debajo del promedio del curso:");
        for (int i = 0; i < numEstudiantes; i++) {
            if (promedio[i] < promedioCurso) {
                System.out.printf("%s: %.2f\n", nombres[i], promedio[i]);
            }
        }
        double maxPromedio = promedio[0];
        double minPromedio = promedio[0];
        String estudianteMax = nombres[0];
        String estudianteMin = nombres[0];

        for (int i = 1; i < numEstudiantes; i++) {
            if (promedio[i] > maxPromedio) {
                maxPromedio = promedio[i];
                estudianteMax = nombres[i];
            }
            if (promedio[i] < minPromedio) {
                minPromedio = promedio[i];
                estudianteMin = nombres[i];
            }
        }
        System.out.printf("\nEstudiante con el mayor promedio: %s (%.2f)\n", estudianteMax, maxPromedio);
        System.out.printf("Estudiante con el menor promedio: %s (%.2f)\n", estudianteMin, minPromedio);
    }
}
