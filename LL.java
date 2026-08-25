public class LL{

    private int size;

    LL(){
        this.size = 0;
    }
   
    class node{
        String data;
        node next;
        node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

/* declaring the head globally */
    node head;

/* add-first */
public void addFirst(String data){

    node newnode = new node(data);

    if(head == null){
        head = newnode;
        return;
    }

    newnode.next = head;
    head = newnode;
}


/* add-last */
public void addLast(String data){
    node newnode = new node(data);

    /* check the head */
    if(head == null){
        head = newnode;
        return;
    }


    node temp = head;
    while(temp.next != null ){
        temp = temp.next;
    }
    temp.next = newnode;

}

/* print the nodes of LL */
public void showwLL(){
    if(head == null){
        System.out.println("list is empty");
        return;
    }



    node temp = head;
    while(temp != null){
        System.out.print(temp.data+"-->");
        temp = temp.next;
    }

    System.out.print("NULL");
}



/* delete First */
/* just move head by one node forward */
public void delFirst(){
    size--;

    if(head == null){
        System.out.println("the list is empty");
        return;
    }

    head = head.next;

}


/* delete Last */
/* find the second last node by traversing temp.next until it is null */
/* two node pointers temp and secondLast will work together. */
/* both will keep going to there next node until temp.next-->null  */

public void delLast(){
    if(head == null){
        System.out.println("the list is empty");
        return;
    }

    size--;
    if(head.next == null){
        head = null;
        return;
    }

    node temp = head.next;
    node secondLast = head;

    while(temp.next != null){
            temp = temp.next;
            secondLast = secondLast.next;
    }

    secondLast.next = null;
}


public int getSize(){
    return size;
}


public static void main(String[] args) {
        /* insertion in ll is O(1).
            searching in ll is O(n).  */

            /* ll has two memebers data and next.
             altogether this strucutre we call it a node.
             can imagine it like a train.
            */

             /* this-->is-->a-->list */

             /* keep address of first node , the head is the one that points to first node. */
             /* 
             types :
             1)Singly LL
             2)Double LL
             3)Circular LL
             */
/* first intialize the LL class object. */
        LL list = new LL();
        list.addFirst("me");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("World!");
        list.showwLL();
        System.out.println();
        list.delFirst();
        list.showwLL();
        System.out.println();
        list.delLast();
        list.showwLL();
        System.out.println();
        System.out.println(list.getSize());

    }
}


