package hw0;

public class Main {
    public static void main(String[] args) {
        double[] source = {1.4, 3.5, 6.8, 3.5556, 9, 0};
        int len = source.length;
        int[] target = new int[len];

        for (int i = 0; i < len; i++) {
            target[i] = (int) source[i];
        }

        for (int i = 0; i < len; i ++) {
            System.out.print(target[i]);
            System.out.print(' ');
        }
    }
}
