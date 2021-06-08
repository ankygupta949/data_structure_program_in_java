//robert lafore
/* this program is same as program in robert lafore,only we changed name of classes & method*/


public class Test {

    int counter=0;
    Integer data=null;

    public void nthNodeFromEnd(Node head,int nth){
if(head != null){
    nthNodeFromEnd(head.next,nth);
    counter++;

if(nth==counter){
data= head.item;
}

}
return;
    }

    public static void main(String args[])
    {
        linkedlistbasicoperation list1obj = new linkedlistbasicoperation();  /* here we creating only 1 linklist,so we create only one object,if we have to create 2 linklist,then we create 2 object*/
        list1obj.insertfirst(100);
        list1obj.first.next=new Node(50);
        list1obj.first.next.next=new Node(30);
        list1obj.first.next.next.next=new Node(20);
        list1obj.first.next.next.next.next=new Node(60);

        Test test = new Test();
        test.nthNodeFromEnd(list1obj.first,2);
        System.out.println(test.data);
    }

}
