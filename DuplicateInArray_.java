//Brute Force Solution
package DuplicateArrayNplusOne;
public class DuplicateInArray_ {

    public static int findDuplicate(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i]; // Duplicate found
            }
        }
        return -1; // No duplicates found
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 8, 8};
        int duplicate = findDuplicate(arr);
        if (duplicate != -1) {
            System.out.println("The duplicate element is: " + duplicate);
        } else {
            System.out.println("No duplicates found in the array.");
        }
    }
}