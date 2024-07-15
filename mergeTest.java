//Oscar Moreno
//COP 3530
public class mergeTest {
    public static void main(String[] args){
        int[] arr = {12,53,2,4,67,1};
        System.out.println("Listing unsorted array:");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

        Merge mergeAlg = new Merge();
        mergeAlg.mergeSort(arr,0, arr.length - 1);

        System.out.println("Listing merge sorted array:");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        String[] arr2 = {"Rob", "Emilia", "Santiago", "Leo", "Johanna"};
        System.out.println("Listing unsorted string array:");
        for(String j : arr2){
            System.out.print(j + " ");
        }
        System.out.println();

        mergeAlg.mergeSort(arr2, 0, arr2.length - 1);

        System.out.println("Listing merge sorted string array:");
        for(String j : arr2){
            System.out.print(j + " ");
        }
        System.out.println();

    }
}
