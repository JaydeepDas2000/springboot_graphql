package com.graphql.learn.graphqlproject.service;

import com.graphql.learn.graphqlproject.entity.EmpDetails;
import com.graphql.learn.graphqlproject.repositories.EmpRepo;
import com.graphql.learn.graphqlproject.service.impl.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService implements EmpServiceImpl {

    private EmpRepo empRepo;

    @Autowired
    public EmpService(EmpRepo empRepo) {
        this.empRepo = empRepo;
    }

    @Override
    public EmpDetails addEmp(EmpDetails empDetails) {
        return this.empRepo.save(empDetails);
    }

    @Override
    public List<EmpDetails> getAllEmp() {
        return this.empRepo.findAll();
    }

    @Override
    public EmpDetails get(int empId) {
        return this.empRepo.findById(empId)
                .orElseThrow(() -> new RuntimeException("Employee not found in Server"));
    }
}
