package com.company;

public class Main {

    public static void main(String[] args) {

        int month = -13;

        if (month <= 2 || month > 11) {
            System.out.println("Зима");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Весна");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Лето");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Осень");
        }

        String timeOfYear;

        switch (month) {
            case 12:
            case 1:
            case 2:
                timeOfYear = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                timeOfYear = "весна";
                break;
            case 6:
            case 7:
            case 8:
                timeOfYear = "лето";
                break;
            case 9:
            case 10:
            case 11:
                timeOfYear = "осень";
                break;
            default:
                timeOfYear = "Неопределено. Некорректный ввод.";


        }
        System.out.println("Наша пора года: " + timeOfYear);

////////////////////////////////////////////////////////////////////

        int[] array = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

////////////////////////////////////////////////////////////////////

        int[][] squareArray = new int[2][3];

        squareArray[0][0] = 11;
        squareArray[0][1] = 12;
        squareArray[0][2] = 13;
        squareArray[1][0] = 14;
        squareArray[1][1] = 15;
        squareArray[1][2] = 16;

        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }


    }

}