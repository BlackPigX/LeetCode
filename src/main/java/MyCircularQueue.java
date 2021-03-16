
import java.util.LinkedList;
import java.util.Queue;

class MyCircularQueue {

    private int[] data;
    private int head;
    private int foot;
    private int size;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data = new int[k];
        head = -1;
        foot = -1;
        size = k;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        //判断数组是否已满
        if(isFull()){
            //队列已满，添加失败，返回false
            return false;
        }
        //向队列中添加值，判断数组是否为空
        if(isEmpty()){
            //初始化栈首坐标为0
            head = 0;
        }

        //赋值
        foot = (foot +1)%size;
        data[foot] = value;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return  false;
        }
        if(head == foot){
            head =-1;
            foot =-1;
            return true;
        }
        head = (head + 1)%size;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return data[head];

    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }else {
            return data[head];
        }
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(head == -1) {
            return true;
        }else {
            return false;
        }
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if((foot +1)%size == head){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(10);
        myCircularQueue.enQueue(111);
        boolean empty = myCircularQueue.isEmpty();
        System.out.println(empty);

    }
}

