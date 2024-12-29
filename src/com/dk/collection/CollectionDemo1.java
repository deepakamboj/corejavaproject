package com.dk.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Hari");
        list.add("Deepa");
        list.add("Anjali");
        list.add("Surendra");
        list.add("Gourav");
        list.add("Hari");

        Iterator<String> itr = list.iterator();
        
        while(itr.hasNext()) {
            System.out.println(itr.next());
            
        }
        
        

    }

}