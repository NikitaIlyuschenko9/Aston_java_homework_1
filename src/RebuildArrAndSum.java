public class RebuildArrAndSum {
    public static void rebuildArrAndSum(String[][] arr) {
        System.out.println("Обработка массива:");
        try {
            System.out.println("Сумма всех элементов массива: " + checkErrors(arr) + "\n");
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива отличается от 4х4.\n");
        } catch (MyArrayDataException e) {
            System.out.println("Преобразование невозможно.\n");
        }
    }

    public static int checkErrors(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4 | arr[0].length != 4)
            throw new MyArraySizeException();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("В массиве неверные данные на позиции: ["+ i +"]["+ j +"]");

                    throw new MyArrayDataException();
                }
            }
        }
        return sum;
    }
}
