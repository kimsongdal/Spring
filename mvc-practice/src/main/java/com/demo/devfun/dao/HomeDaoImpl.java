package com.demo.devfun.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class HomeDaoImpl implements HomeDao {

    @Autowired
    SqlSessionTemplate template;

    public HomeDaoImpl(SqlSessionTemplate template) {
        this.template = template;
    }

    @Override
    public int getTestCount() {
        return template.selectOne("com.test.springTest.testxml.selectTest");
    }

    @Override
    public List<HashMap<String, Object>> getRequests() {
        return template.selectList("com.test.springTest.testxml.selectTest2");
    }

}
