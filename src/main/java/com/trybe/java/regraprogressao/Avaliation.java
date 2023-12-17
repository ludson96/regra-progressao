package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * Classe que faz calculo e exibe mensagem de avaliação para o aluno.
 */
public class Avaliation {

  /**
   *
   */
  public void inputData() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int numberActivities = Integer.parseInt(scanner.nextLine());

    int[] weightActivity = new int[numberActivities];
    int[] gradeObtained = new int[numberActivities];
    int sum = 0;

    for (int i = 1; i <= numberActivities; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String nameProject = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + i + ":");
      weightActivity[i - 1] = Integer.parseInt(scanner.nextLine());
      System.out.println("Digite a nota obtida para " + nameProject + ":");
      gradeObtained[i - 1] = Integer.parseInt(scanner.nextLine());
    }
    scanner.close();

    for (int w: weightActivity) {
      sum += w;
    }

    if (sum != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }
  }
}