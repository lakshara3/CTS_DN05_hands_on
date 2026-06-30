public class Exercise2Search {

    static void linearSearch(int arr[], int key) {

        for(int i=0;i<arr.length;i++) {

            if(arr[i] == key) {
                System.out.println("Linear Search Found at index " + i);
                return;
            }
        }

        System.out.println("Not Found");
    }


    static void binarySearch(int arr[], int key) {

        int low = 0;
        int high = arr.length-1;


        while(low <= high) {

            int mid = (low+high)/2;


            if(arr[mid] == key) {
                System.out.println("Binary Search Found at index " + mid);
                return;
            }

            if(arr[mid] < key)
                low = mid+1;
            else
                high = mid-1;
        }

        System.out.println("Not Found");
    }


    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};

        linearSearch(arr,30);

        binarySearch(arr,40);
    }
}