/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.semana.pkg12;

/**
 *
 * @author miguelaguas
 */
public class TAREASEMANA12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Defino las ciudades y los días y semanas
        String[] ciudades = {"Quito", "Guayaquil"};
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int semanas = 2;

        // Matriz 3D
        double[][][] temperaturas = {
            {   // Ciudad de Quito
                {18, 20}, // Lunes
                {19, 21}, // Martes
                {22, 23}, // Miércoles
                {21, 22}, // Jueves
                {20, 24}, // Viernes
                {19, 23}, // Sábado
                {18, 22}  // Domingo
            },
            {   // Ciudad de Guayaquil
                {28, 29}, // Lunes
                {30, 31}, // Martes
                {29, 30}, // Miércoles
                {31, 32}, // Jueves
                {30, 33}, // Viernes
                {28, 31}, // Sábado
                {29, 32}  // Domingo
            }
        };

        // Bucle para los promedios
        for (int c = 0; c < ciudades.length; c++) {
            System.out.println("Ciudad: " + ciudades[c]);
            for (int s = 0; s < semanas; s++) {
                double suma = 0;
                for (int d = 0; d < dias.length; d++) {
                    suma += temperaturas[c][d][s];
                }
                double promedio = suma / dias.length;
                System.out.println("  Semana " + (s + 1) + " El Promedio es: " + promedio);
            }
        }
    }
}
