import java.util.Arrays;

public class LinkedList {

    class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    Node head;
    int size;

    public LinkedList() {
        head = null;
    }

    public int get(int i) {

        // if LL is empty
        if(head == null){
            return -1;
        }

        // if value of first element is asked.
        if(i==0){
            return head.data;
        }


        if(i>0 && i<=size-1){
            int count = 0;
            Node temp = head;

            while(count < i){
                temp = temp.next;
                count++;
            }

             return temp.data;   
        }

        return -1;
        
}

    public void insertHead(int val) {
    
        Node newnode = new Node(val);
        //always incerease the size first
        size++;
        // if the list is intially empty
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void insertTail(int val) {
    
    Node newnode = new Node(val);
    Node temp = head;

    // always increase the size first 
    size++;

    // what if list is empty


    if(head == null){
        head = newnode;
        return;
    }

// intially temp pointer will point to head and we will traverse till the last node
    while(temp.next != null){
        temp = temp.next;
    }

    temp.next = newnode;

    }

    public boolean remove(int i) {

        // check whether i is less than or equal to size of LL
        if(i>=0 && i<size){


        // if i is one means remove first element , just move head pointer by one.
                                if(i==0){
                                    head = head.next;
                                    size--;
                                    return true;
                                    
                                }
        //if i is equal to the size that is asking to remove last element from LL
        // we have to track the second last node as well

                                if(i == size-1){
                                
                                Node temp = head.next;
                                Node secLast = head;
                                while(temp.next != null){
                                    temp = temp.next;
                                    secLast = secLast.next;
                                }
                                secLast.next = null;

                                }


        // i is between 1 and size of LL
                            if(i>0 && i<size-1){
        // to traverse till that ith element.
        //  temp will point to that element and beforetemp will point to one node before the target node.                       
                                int count = 0;
                                Node beforetemp = head;
                                Node temp = head.next;

                                while(count<i-1){
                                    temp = temp.next;
                                    beforetemp = beforetemp.next;
                                    count++; 
                                }

                                beforetemp.next = temp.next;

                            }  

            // atlast decrese size by 1
                            size--;                                          
                            return true;
        }

                                
        return false;
    
    }

    public int[] getValues() {

    
        int[] values = new int[size];
        int i = 0;
        Node temp = head;
    
    // if the LL is already empty then what
    // we will return an empty array.
    
            if(head == null){
                return new int[0];
            }

        while(temp != null){
            values[i] =  temp.data;
            temp = temp.next;
            i++;
        }

        return values;
    
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println(Arrays.toString(ll.getValues()));
        ll.getValues();
    }


}