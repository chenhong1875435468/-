package SelectionSort;

/**
 * @author chenhong
 * @version 1.0
 * @description
 * @date 2021/11/22 19:32
 */
public class SelectionSort {
    /**
     *
     * @param nums
     * @param n
     */
    public static void selectionSort(int nums[],int n) {
       int i;//有序区的末尾
       int j;//无序区的开始
       int min;//最小元素下标

       for(i = 0; i < n; i++) {
           min = i;
           //从有序区末尾的后一个元素开始向后筛查，找出元素最小的下标
           for(j = i + 1; j < n; j++) {
               if(nums[min] > nums[j]) {
                   min = j;
               }
           }
           //交换
           if(min != i) {
               int temp = nums[min];
               nums[min] = nums[i];
               nums[i] = temp;
           }
       }
    }

    public static void main(String[] args) {
        int i;
        int[] a = {20,40,30,10,60,50};

        System.out.printf("before sort:");
        for (i=0; i<a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.printf("\n");

        selectionSort(a, a.length);

        System.out.printf("after  sort:");
        for (i=0; i<a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.printf("\n");
    }
}
