import java.util.ArrayList; // ArrayList class uses a dynamic array for storing the elements.It extends AbstractList class and implements List interface(that extends the collection interface).
import java.util.Iterator;

class student
{
    int roll;
    String name;
    
    public student(int a,String b)
    {
        roll=a;
        name=b;
    }
}


public class userdefinedclassobjectsinarraylist {
    
    
    public static void main(String args[]){
    student obj1 = new student(10,"ankit");
    student obj2 = new student(24,"vikesh");

    /* object of ArrayList class is arraylist */
    ArrayList<student> al = new ArrayList<student>(); //creating object of ArrayList class(means creating arraylist),here al is arraylist & student is type of values stored in al(arraylist)//
    al.add(obj1); //add() method is inherited from collection interface & defined in AbstractList class(that implements the List interface first)
    al.add(obj2);
    
    Iterator itr = al.iterator(); //iterator() method is inherited from collection interface & defined in AbstractList class  (this method return the iterator)
    while(itr.hasNext()){
        student obj=(student)itr.next();
        System.out.println(obj.roll+" "+obj.name);
                }
}
}
