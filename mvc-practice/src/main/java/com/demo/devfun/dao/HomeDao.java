package com.demo.devfun.dao;

import java.util.HashMap;
import java.util.List;

public interface HomeDao {
    int getTestCount();
    List<HashMap<String,Object>> getRequests();
}
