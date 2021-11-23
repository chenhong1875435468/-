package InsertionSort;

/**
 * @author chenhong
 * @version 1.0
 * @description 插入排序
 * @date 2021/11/23 20:16
 */
public class InsertionSort {

    public static void insertionSort(int[] nums, int n) {
        int i;
        int j;
        int k;

        for(i = 1; i < n; i++) {
            //在i前的 0 ~ i - 1 的区间里面找一个合适的位置来插入i（实质上就是从前面区间找一个能插入nums[i]的地方）
            for(j = i - 1; j >= 0; j--) {
                if(nums[j] < nums[i]) {
                    //如果找到合适位置就直接跳出循环，就是要从后向前找到一个位置，能使得nums[i]比它前面的所有数都大
                    break;
                }
            }
            //如果找到的位置不是i 的前面一个位置，那就需要移动位置操作
            if(j != i - 1) {
                //先记录一下要插入的值
                int temp = nums[i];
                //j的位置是需要插入nums[i]的位置，因此将这些数从后向前，一各一个移动位置
                for(k = i - 1; k > j; k--) {
                    nums[k + 1] = nums[k];
                }
                //最后插入操作
                nums[k + 1] = temp;
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

        insertionSort(a, a.length);

        System.out.printf("after  sort:");
        for (i=0; i<a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.printf("\n");
    }
}
