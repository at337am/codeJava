package com.linyz.a01Search;

/*分块查找*/

public class demo2 {
    public static void main(String[] args) {
        // 将数组分成三块
        // 块中的任意数据都比下一个块中的小
        // 分块的数量取决于数组长度的二次根号, 例如长度为16的数组, 分成四块
        int[] arr = {3, 11, 15,
                21, 34, 24,
                56, 71, 82, 91};

        // 这是待查找的数据
        int number = 24;

        // 创建每一个块的对象
        Block b1 = new Block(15, 0, 2);
        Block b2 = new Block(34, 3, 5);
        Block b3 = new Block(91, 6, 9);

        // 将块对象存放到块数组中
        Block[] brr = {b1, b2, b3};

        System.out.println(getIndex(brr, arr, number));
    }

    // 查找最终索引的方法
    public static int getIndex(Block[] brr, int[] arr, int number) {
        // 得到块数组中的索引
        int brrIndex = getBrrIndex(brr, number);
        // 索引负数判断
        if (brrIndex < 0) {
            return brrIndex;
        }
        // 返回最终索引
        return getArrIndex(arr, brr[brrIndex].getStartIndex(), brr[brrIndex].getEndIndex(), number);
    }

    // 查找一个number在arr中的索引
    // startIndex为开始索引, endIndex为结束索引
    public static int getArrIndex(int[] arr, int startIndex, int endIndex, int number) {
        // 遍历数组中的一部分, 得到最终索引
        for (int i = startIndex; i < endIndex + 1; i++) {
            if (number == arr[i]) {
                return i;
            }
        }
        // 若数组中没有number
        return -1;
    }

    // 查找number属于哪一个块中, 返回该块在块数组中的索引
    public static int getBrrIndex(Block[] brr, int number) {
        // 遍历块数组, 返回第一个 number比块最大值小 的索引
        for (int i = 0; i < brr.length; i++) {
            if (number < brr[i].getMax()) {
                return i;
            }
        }
        // 若number比每一个块最大值都大, 则number不在数组中
        return -1;
    }
}

// 定义一个块的javabean
class Block{
    private int max;   // 每一个块中的最大值
    private int startIndex;   // 块中第一个数据在arr中的索引
    private int endIndex;           // 块中最后一个数据在arr中的索引

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
