package com.hudongwx.userCenter.util;

import com.hudongwx.userCenter.mock.Exp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuhongxu on 2016/12/1 0001.
 */
public class MockKit {
    public static <T> Bing<T> start() {
        return new Bing<T>();
    }
}

