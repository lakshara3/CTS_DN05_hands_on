public class Exercise3Sorting {


    static void bubbleSort(int arr[]) {

        for(int i=0;i<arr.length-1;i++) {

            for(int j=0;j<arr.length-i-1;j++) {

                if(arr[j] > arr[j+1]) {

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {

        int arr[] = {50,20,40,10,30};

        bubbleSort(arr);


        System.out.println("Sorted Array:");

        for(int x : arr)
            System.out.print(x+" ");
    }
}