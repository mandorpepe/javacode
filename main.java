public class main {
    public static void main(String[] args) {
//ввод данных
        int[][] data1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] data2 = {
                {7, 8, 9},
                {1, 2, 3}
        };
// объявление матриц через конструктор
        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);
// вызов функции сложения
        Matrix result = matrix1.add(matrix2);
//вывод самих матриц и результатов
        System.out.println("Матрица 1:");
        System.out.println(matrix1);

        System.out.println("Матрица 2:");
        System.out.println(matrix2);

        System.out.println("Результат сложения:");
        System.out.println(result);
    }
}
