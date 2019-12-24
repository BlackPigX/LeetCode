import sun.invoke.empty.Empty;

class MyCircularQueue {

    private int[] data;
    private int head;
    private int foot;
    private int size;
    private int index_head;
    private int index_foot;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data = new int[k];
        head = -1;
        foot = -1;
        size = k;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        //向队列中添加值，首先判断数组是否为空
        if(isEmpty()){
            //初始化栈首坐标为0
            head = 0;
        }
        //判断数组是否已满
        if(isFull()){
            //队列已满，添加失败，返回false
            return false;
        }
        //赋值
        data[head] = value;
        //计算栈尾坐标
        foot = foot++;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {

        return false;
    }

    /** Get the front item from the queue. */
    public int Front() {

    }

    /** Get the last item from the queue. */
    public int Rear() {

    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(data.length == 0){
            return true;
        }else {
            return false;
        }
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(data.length == size){
            return true;
        }else {
            return false;
        }
    }
}

