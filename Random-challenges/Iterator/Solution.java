package Iterator;

import java.util.*;

public class Solution {

    static Iterator func (ArrayList mylist){
        Iterator it = mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if(element.equals("###")) {
                break;
            }
            //skip until you find a string object
        }
        return it;
    }

    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0;i<n;i++){
            mylist.add(sc.nextInt());
        }
        mylist.add("###");
        for(int i = 0;i < m; i++){
            mylist.add(sc.next());
        }
        Iterator it = func(mylist);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
        sc.close();
    }
}

/*
Notes: Iterators is an object that can be used to loop through collections like ArrayList and Hashsets

 */