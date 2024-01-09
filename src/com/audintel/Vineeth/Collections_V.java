package com.audintel.Vineeth;

import java.util.*;


public class Collections_V {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int key = sc.nextInt();
        List<Integer> sampleList = new ArrayList<>();
        for(int i=0;i<n;i++){
            sampleList.add(sc.nextInt());
        }
        List<Integer> mergeList  = new ArrayList<>(sampleList);
        Collections.sort(sampleList);
        System.out.println("Sorted List: " + sampleList);
        int index = Collections.binarySearch(sampleList, key);
        System.out.println("index of element : "+(index>=0?index:false));
        mergeList.addAll(sampleList);
        System.out.println("Merged List: " + mergeList);
    }
}

