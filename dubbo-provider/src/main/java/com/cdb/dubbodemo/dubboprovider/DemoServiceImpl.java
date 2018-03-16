package com.cdb.dubbodemo.dubboprovider;

import com.cdb.dubbodemo.dubboapi.DemoService;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add("provider==="+id);
        return demo;
    }
}
