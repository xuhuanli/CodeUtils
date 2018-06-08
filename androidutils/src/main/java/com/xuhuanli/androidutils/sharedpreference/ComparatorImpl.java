package com.xuhuanli.androidutils.sharedpreference;

import java.util.Comparator;

class ComparatorImpl implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
