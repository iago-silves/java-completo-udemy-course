package fundamentos.exercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SorteandoAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] alunos = new String[4];
        Random rand = new Random();

        for(int i = 0; i <= 3; i++){
            System.out.printf("Digite o nomes dos alunos para o sorteio: ");
            alunos[i] = sc.nextLine();
        }

        //algoritmo de embaralhamento Fisher–Yates
        for (int i = alunos.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            String temp = alunos[i];
            alunos[i] = alunos[j];
            alunos[j] = temp;
        }

        System.out.println("Array embaralhado: " + Arrays.toString(alunos));

        sc.close();
    }
}
