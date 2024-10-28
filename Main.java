public class Main {
    public static void main(String[] args) {
        short[] e = new short[8];
        float[] x = new float[13];
        double[][] f = new double[8][13];
        short[] check2 = {6, 8, 16, 18};
        boolean flag = false;

        for (int i = 0; i < 8; i++) {
            e[i] = (short) (i * 2 + 4);
        }

        for (int j = 0; j < 13; j++) {
            x[j] = (float) (Math.random() * 13 - 4);
        }
        for (int i = 0; i < 8; i++) {
            if (e[i] == 4) {
                for (int j = 0; j < 13; j++) {
                    f[i][j] = Math.pow(Math.tan(Math.tan(x[j])), (0.25 + Math.cos(Math.sin(x[j]))));
                }
            } else {
                for (int l = 0; l < 3; l++) {
                    if (e[i] == check2[l]) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    for (int j = 0; j < 13; j++) {
                        f[i][j] = Math.cos(Math.asin(Math.pow((x[j] + 1.5) / 11, 2)));
                    }
                } else {
                    for (int j = 0; j < 13; j++) {
                        f[i][j] = Math.pow(Math.E, Math.pow(Math.E, Math.atan(x[j] + 1.5) / 11));
                    }
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.printf("%.2f", f[i][j]);
                System.out.println(" ");
            }
        }
    }
}