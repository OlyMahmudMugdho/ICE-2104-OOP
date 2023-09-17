import java.util.Scanner;

public class Descending {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array : ");


        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter the number : " + (i + 1));
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }


        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }


        scanner.close();
    }
}