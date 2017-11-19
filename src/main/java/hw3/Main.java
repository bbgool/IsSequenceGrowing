package hw3;

public class Main {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {5, 5, 3};
        int arr3[] = {1, 1, 3};
        //jdhfgjdhgldkjhgljdh;
        isIncreased(arr1);
        isIncreased(arr2);
        isIncreased(arr3);
        if (isIncreased(arr1) == true) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        if (isIncreased(arr2) == true) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        if (isIncreased(arr3) == true) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

    public static boolean isIncreased(int[] arr) {
        boolean isIncreased = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                isIncreased = true;
            } else isIncreased = false;
            break;
        }
        return isIncreased;
    }

}
