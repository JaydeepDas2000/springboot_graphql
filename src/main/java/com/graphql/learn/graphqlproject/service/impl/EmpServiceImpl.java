package com.graphql.learn.graphqlproject.service.impl;

import com.graphql.learn.graphqlproject.entity.EmpDetails;

import java.util.List;

public interface EmpServiceImpl {

    //add emp
    EmpDetails addEmp(EmpDetails empDetails);

    //get all emp
    List<EmpDetails> getAllEmp();

    //get single emp
    EmpDetails get(int empId);
}
