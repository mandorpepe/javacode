class Matrix {

    private int[][] data;
    private int rows;
    private int cols;

    // конструктор
    public Matrix(int[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;

        this.data = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }

    // cложение
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Матрицы должны быть одинакового размера");
        }

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.data[i][j] + other.data[i][j];
            }
        }

        return new Matrix(result);
    }

    // вывод
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int[] row : data) {
            for (int val : row) {
                sb.append(val).append("\t");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
