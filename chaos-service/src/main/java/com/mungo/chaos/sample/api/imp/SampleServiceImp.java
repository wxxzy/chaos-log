package com.mungo.chaos.sample.api.imp;

import com.mungo.chaos.sample.api.SampleService;

/**
 * @author wangxingxiang
 * @Description
 * @date 2020/1/14 16:49
 */
public class SampleServiceImp implements SampleService {
    @Override
    public String getData(String name) {
        return "Sample Data";
    }
}
