import java.util.Scanner;

public class InsertionSort {
    private double[] array;
    private int size;
    public InsertionSort (int size)
    {
        this.size = size;
        this.array = new double[size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Initialize array");
        for (int i = 0; i < this.size; i++) {
            this.array[i] = scanner.nextDouble();
        }
        this.sort();
    }

    private void sort()
    {
        double value;
        int j;
        for (int i = 1; i < this.size; i++) {
            j = i - 1;
            value = this.array[i];
            while (j >= 0 && this.array[j] > value) {
                this.array[j + 1] = this.array[j];
                --j;
            }
            this.array[j + 1] = value;
        }
    }

    public void showResult ()
    {
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.array[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of an array");
        InsertionSort Sort = new InsertionSort(sc.nextInt());
        Sort.showResult();
    }
}
