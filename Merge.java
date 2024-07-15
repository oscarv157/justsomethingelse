//Oscar Moreno
//COP 3530
public class Merge<T extends Comparable<T>> {
    public void mergeSort(int[] arr, int p, int r){
        if(p >= r){
            return;
        }
        int q = ((p + r) / 2);
        mergeSort(arr, p, q);
        mergeSort(arr,q + 1, r);
        merge(arr, p, q, r);

    }

    public void merge(int[] arr, int p, int q, int r){
        int nl = q - p + 1;
        int nr = r - q;
        int[] L = new int[nl];
        int[] R = new int[nr];
        for(int i = 0; i < nl ; i++){
            L[i] = arr[p + i];
        }
        for(int j = 0; j < nr; j++){
            R[j] = arr[q + j + 1];
        }
        int i = 0;
        int j = 0;
        int k = p;

        while(i < nl && j < nr){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i = i + 1;
            }
            else{
                arr[k] = R[j];
                j = j + 1;
            }
            k = k + 1;
        }

        while(i < nl){
            arr[k] = L[i];
            i = i + 1;
            k = k + 1;
        }
        while(j < nr){
            arr[k] = R[j];
            j = j + 1;
            k = k + 1;
        }
    }

    //The following is for comparable T
    public void mergeSort(T[] arr, int p, int r){
        if(p >= r){
            return;
        }
        int q = ((p + r) / 2);
        mergeSort(arr, p, q);
        mergeSort(arr,q + 1, r);
        merge(arr, p, q, r);

    }

    public void merge(T[] arr, int p, int q, int r){
        int nl = q - p + 1;
        int nr = r - q;
        T[] L = (T[]) new Comparable[nl];
        T[] R = (T[]) new Comparable[nr];
        for(int i = 0; i < nl ; i++){
            L[i] = arr[p + i];
        }
        for(int j = 0; j < nr; j++){
            R[j] = arr[q + j + 1];
        }
        int i = 0;
        int j = 0;
        int k = p;

        while(i < nl && j < nr){
            if(L[i].compareTo(R[j]) <= 0){
                arr[k] = L[i];
                i = i + 1;
            }
            else{
                arr[k] = R[j];
                j = j + 1;
            }
            k = k + 1;
        }

        while(i < nl){
            arr[k] = L[i];
            i = i + 1;
            k = k + 1;
        }
        while(j < nr){
            arr[k] = R[j];
            j = j + 1;
            k = k + 1;
        }
    }
}
