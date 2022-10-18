package p1;

public class Pivot37 {
    public static int findPivotElem(int[] arr1, int leftElem, int rightElem) {
        if(rightElem < leftElem) {
            return -1;
        }
        if(rightElem == leftElem) {
            return leftElem;
        }
        int midElem = (leftElem + rightElem) / 2;
        if(midElem < rightElem && arr1[midElem] > arr1[midElem + 1]) {
            return midElem;
        }
        if(midElem > leftElem && arr1[midElem] < arr1[midElem - 1]) {
            return midElem - 1;
        }
        if(arr1[leftElem] >= arr1[midElem]) {
            return findPivotElem(arr1, leftElem, midElem - 1);
        } else {
            return findPivotElem(arr1, midElem + 1, rightElem);
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {14, 23, 7, 9, 3, 6, 18, 22, 16, 36};
        int ctr = (int)arr1.length;
        System.out.print("The given array is :  ");
        for(int i = 0; i < ctr; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.println("The Pivot Element in the array is : " + arr1[findPivotElem(arr1, 0, ctr - 1) + 1] + " ");
    }
}
