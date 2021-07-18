package HomeWork02;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"9", "9", "9", "9"},
                {"8", "8", "8", "8"},
                {"7", "7", "7", "7"},
                {"6", "6", "6", "6"}};
        try {
            try {
                int sum = receivingArr(array);
                System.out.println(sum);
            } catch (MyArraySizeException error) {
                System.out.println("Размер массива не равен 4x4!");
            }
        } catch (MyArrayDataException error) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + (error.x + 1) + "x" + (error.y + 1));
        }

    }

    public static int receivingArr(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    count = count + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException error) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}

