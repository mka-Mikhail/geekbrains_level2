package lesson_2.num1;

public class Main {

    public static void main(String[] args) {

        int k = 0;

        String[][] array0 = {
                {"1321", "1`23", "345", "3456"} };

        String[][] array1 = {
                {"2134"},
                {"3t"},
                {"32456"},
                {"2345"} };

        String[][] array2 = {
                {"123", "42", "3е45", "4533"},
                {"143", "2435", "345", "435"},
                {"2345", "78", "6534", "345"},
                {"3456", "657", "456", "34"} };

        try {
            //handlerArray(array0, 1, 4);
            //handlerArray(array1, 1, 4);
            handlerArray(array2, 4, 4);
        } catch (MyArraySizeException e) {
            System.err.println(e.getMessage());
            k++;
        } catch (MyArrayDataException e) {
            System.err.println(e.getMessage());
            k++;
        } finally {
            if (k == 0) System.out.println("Программа завершилась корректно");
            else System.out.println("Программа завершилась некорректно");
        }
    }

    public static void handlerArray(String[][] array, int row, int col) {

        //Проверка массива на определённый размер
        if (array.length != row || array[0].length != col) throw new MyArraySizeException("Размер массива не " + row + "*" + col);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                try {
                    Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверное значение в ячейке [" + i + "][" + j + "]");
                }
            }
        }
    }
}
