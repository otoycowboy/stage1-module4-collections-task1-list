package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aInt = 5 * (int) Math.pow(Integer.parseInt(a), 2) + 3;
        int bInt = 5 * (int) Math.pow(Integer.parseInt(b), 2) + 3;
        return aInt == bInt ? Integer.compare(Integer.parseInt(a), Integer.parseInt(b)) : Integer.compare(aInt, bInt);
    }
}
