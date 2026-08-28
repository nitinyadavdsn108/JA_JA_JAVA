public class queue{
    int[] queue = new int[5];
    int front = -1;
    int rear = -1;
    void pushBack(int ele){
        // empty queue
        if(front == -1 && rear == -1){
            front++;
            rear++;
            queue[front] = ele;
            return;
        }
        // full queue
        if(rear == 4){
            System.out.println("queue is full");
            return;
        }
        rear++;
        queue[rear] = ele;
    }
    int popFront(){

        // empty queue
        if(front == -1 && rear == -1){
            System.out.println("Queue is Empty");
            return -1;
        }
        int frontEle = queue[front];

        // if this is tbhe last element
        if(front == rear){
            front = -1;
            rear = -1;
            return frontEle;
        }


       /*  front++;
        int[] currQ = new int[rear+front-1];
        for(int i = 0  ; i < rear ; i++){
            currQ[i] = queue[front];
            front++;
        }
        queue = currQ;
        front = 0;
        */
       
       
       // shifting all the elements to front
       for(int i = 0 ; i < rear ; i++){
        queue[i] = queue[i+1];
       }
       
        rear--;

        return frontEle;

    }
    void showQueue(){

        // adding condition if queue is empty
        if(front == -1 && rear == -1){
            System.out.println("queue is empty");
            return;
        }


        for(int i = front ; i <= rear ; i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /* 
        queue q = new queue();
        q.pushBack(80);
        q.pushBack(11);
        q.pushBack(55);
        q.pushBack(21);
        q.pushBack(71);
        q.pushBack(73);
        q.showQueue();
        System.out.println("front element poped is :"+q.popFront());
        System.out.println("front element poped is :"+q.popFront());
        q.showQueue();
        
        System.out.println("front element poped is :"+q.popFront());
        System.out.println("front element poped is :"+q.popFront());
        q.showQueue();

        
        System.out.println("front element poped is :"+q.popFront());
        System.out.println("front element poped is :"+q.popFront());
        q.showQueue(); */
    }
}