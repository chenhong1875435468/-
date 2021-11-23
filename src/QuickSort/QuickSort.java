package QuickSort;

/**
 * @author chenhong
 * @version 1.0
 * @description 快速排序
 * @date 2021/11/21 22:35
 */
public class QuickSort {
    /**
     *
     * @param nums 数组
     * @param l 数组左边界
     * @param r 数组右边界
     */
    public static void quickSort(int[] nums, int l, int r) {
        //如果左边界小于右边界
        if(l < r) {
            int i , j, x;
            i = l;
            j = r;
            x = nums[i];

            //左小于右
            while(i < j) {
                //基准x 从右边向左边筛选，直到找到右边比基准值小的数字，找到其下标
                while(i < j && x < nums[j]) {
                    j--;
                }
                //如果找到的目标数字的下标，比左边界要小的话，那么就把这个目标数字赋值给左边界上的数字
                if(i < j) {
                    nums[i++] = nums[j];
                }
                //从左边向右边筛选，直到找到左边比基准数字大的数字，找到其下标
                while(i < j && x > nums[i]) {
                    i++;
                }
                //如果满足要求的话，把这个数字赋给之前找到的目标数字的下标
                if(i < j) {
                    nums[j--] = nums[i];
                }
            }
            nums[i] = x;
            quickSort(nums, l, i -1);
            quickSort(nums, i + 1, r);

        }
    }

    public static void main(String[] args) {
        int i;
        int a[] = {20, 10};

        System.out.printf("before sort:");
        for (i=0; i<a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.printf("\n");

        quickSort(a, 0, a.length-1);

        System.out.printf("after  sort:");
        for (i=0; i<a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.printf("\n");
    }
}
