public class Lab1 {
    // выделяю место под массивы. мне удобнее, чтобы они были глобальными
    private static final short[] e = new short[8];
    private static final float[] x = new float[13];
    private static final double[][] f = new double[8][13];
    // два метода заполняют массивы е и х
    public static void makeFirstArray() {
        for (int i = 0; i < 8; i++) {
            e[i] = (short) (i * 2 + 4);
        }
    }
    public static void makeSecondArray() {
        for (int j = 0; j < 13; j++) {
            x[j] = (float) (Math.random() * 13 - 4);
        }
    }
    // метод, заполняющий третий массив. он работает от метода калькАррай
    public static void makeThirdArray() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 13; j++) {
                f[i][j] = calcArray(e[i], x[j]);
            }
        }
    // метод калькАррай, считает каждый элемент массива ф согласно правилу
    }
    public static double calcArray(int i, float j) {
        if (i == 4) {
            return Math.pow(Math.tan(Math.tan(j)), (0.25 + Math.cos(Math.sin(j))));
        } else if (i == 6 || i == 8 || i == 16 || i == 18 ) {
            return Math.cos(Math.asin(Math.pow((j + 1.5) / 11, 2)));
        } else {
            return Math.pow(Math.E, Math.pow(Math.E, Math.atan(j + 1.5) / 11));
        }
    }
    // метод маин будет выводить итоговый результат
    public static void main(String[] args) {
        makeFirstArray();
        makeSecondArray();
        makeThirdArray();
        System.out.println("First Array:");
        for (short elem : e) {
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Second Array:");
        for (float elem : x) {
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.println();
        printMatrix();
    }
    // отдельный метод для вывода матрицы
    public static void printMatrix() {
        System.out.println("Third Matrix:");
        for (double[] row : f) {
            for (double elem : row) {
                System.out.format("%5.2f", elem) ; System.out.print(" ");
            }
            System.out.println();
        }
    }
}