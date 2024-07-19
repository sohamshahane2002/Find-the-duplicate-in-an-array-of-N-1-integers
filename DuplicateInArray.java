//Optimal Solution
package DuplicateArrayNplusOne;
public class DuplicateInArray {
    public static int findDuplicate(int nums[]){
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        fast = nums[0];
        while( slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,2,4};
        System.out.println("The Duplicate Element is : "+findDuplicate(arr) );
    }
}
