import java.util.Arrays;

class MergeSort {
    int[] mergeSort(int A[]) {
        System.out.println("splitting ");
        for (int var : A) {
            System.out.print(var + " ");
        }
        System.out.print("\n");
        int Lhalf[];
        int Rhalf[];
        if (A.length > 1) {
            int mid = A.length / 2;
            Lhalf = Arrays.copyOfRange(A, 0, mid);
            Rhalf = Arrays.copyOfRange(A, mid, A.length);
            mergeSort(Lhalf);
            mergeSort(Rhalf);
            int i = 0;
            int j = 0;
            int k = 0;
            while ((i < Lhalf.length) && (j < Rhalf.length)) {
                if (Lhalf[i] < Rhalf[j]) {
                    A[k] = Lhalf[i];
                    i = i + 1;
                } else {
                    A[k] = Rhalf[j];
                    j = j + 1;
                }
                k = k + 1;
            }
            while (i < Lhalf.length) {
                A[k] = Lhalf[i];
                i = i + 1;
                k = k + 1;
            }
            while (j < Rhalf.length) {
                A[k] = Rhalf[j];
                j = j + 1;
                k = k + 1;
            }
        }
        System.out.println("Merging");
        return A;
    }

    public static void main(String[] args) {
        int A[] = { 54, 26, 93, 17, 77, 31, 44, 55, 20 };
        MergeSort ms = new MergeSort();
        A = ms.mergeSort(A);
        System.out.print("\n");
        for (int var : A) {
            System.out.print(var + " ");
        }
    }
}