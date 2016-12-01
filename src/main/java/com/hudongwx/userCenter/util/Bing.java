package com.hudongwx.userCenter.util;

import java.util.ArrayList;
import java.util.List;

public class Bing<T> {
    private List<T> list;

    public Bing() {
        list = new ArrayList<>();
    }

    public Bing<T> add(T t) {
        list.add(t);
        return this;
    }

    public List<T> build() {
        return list;
    }
}
