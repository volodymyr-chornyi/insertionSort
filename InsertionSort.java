public class InsertionSort {

    // print array to console
    public static void print(int [] arr){
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // sort an array by the insertion method
    public static int [] sort(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int j = i-1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] array = new int[15];
        for (int i = 0; i < array.length; i++) {                  //generate an array of random numbers
            array [i] = (int) (Math.random()*100);
        }

        System.out.println("Before sorting: ");
        print(array);
        sort(array);
        System.out.println("After sorting: ");
        print(array);
    }
}
