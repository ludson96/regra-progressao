package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * Classe que faz calculo e exibe mensagem de avaliação para o aluno.
 */
public class Avaliation {

  /**
   * Método para adicionar as informações de input.
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

    for (int w : weightActivity) {
      sum += w;
    }

    if (sum != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }

    double average;
    double sumWeightGrade = 0;
    double weightSumDouble = sum;

    for (int i = 0; i < weightActivity.length; i++) {
      sumWeightGrade += weightActivity[i] * gradeObtained[i];
    }

    average = sumWeightGrade / weightSumDouble;

    if (average >= 85.0) {
      System.out.println(
          "Parabéns! Você alcançou "
              + average
              +
              "%! E temos o prazer de informar que você obteve aprovação!"
      );
    } else {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, " + average
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }
}