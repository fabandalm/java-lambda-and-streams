package com.falmeida.tech.data_structure;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IterableSample {

    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("red","orange","yellow");
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
