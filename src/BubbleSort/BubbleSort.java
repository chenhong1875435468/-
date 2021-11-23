package BubbleSort;

/**
 * @author chenhong
 * @version 1.0
 * @Description 冒泡排序算法
 * @date 2021/11/21 22:09
 */
public class BubbleSort {
    /**
     * 冒泡排序算法
     *
     * @param num  待排序的数组
     * @param n 数组的长度
     */
    public static void bubbleSort(int num[] , int n) {
        //对于长度为n的数组，需要遍历n - 1趟
        for(int i = 0; i < n - 1; i++) {
            //设置一个标签
            boolean flag = true;
            //每一趟从n - 1开始逐次减少，比如最开始四个元素比较三次，走完第一趟，
            // 最后一个元素就是最大的元素，那么只有前三个元素是无序的，那么比较的次数就可以减少了，这就是减去i的目的
            for(int j = 0; j < n - i - 1; j++) {
                //如果前者比后者大，那么就交换，升序排列(可以使用异或来交换元素)
                if(num[j] > num[j + 1]) {
                    //数组是无序的
                    flag = false;
                    //使用异或来交换元素
                    num[j] ^= num[j + 1];
                    num[j + 1] ^= num[j];
                    num[j] ^= num[j + 1];
                }
            }
            //如果第一趟发现数组是有序的，那么直接结束
            if(flag) {
                break;
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

        bubbleSort(a, a.length);
        //bubbleSort2(a, a.length);

        System.out.printf("after  sort:");
        for (i=0; i<a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.printf("\n");
    }
}
