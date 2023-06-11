package com.graphql.learn.graphqlproject.controller;

import com.graphql.learn.graphqlproject.entity.EmpDetails;
import com.graphql.learn.graphqlproject.service.impl.EmpServiceImpl;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

//@RestController
//@RequestMapping("/emp")
@Controller
public class EmpController {

    @Autowired
    private EmpServiceImpl empServiceImpl;

    //create
//    @PostMapping
    @MutationMapping("createEmp")
    public EmpDetails createEmp(@Argument EmpDetailInput addEmp) {
        EmpDetails e = new EmpDetails();
        e.setEmpName(addEmp.getEmpName());
        e.setEmpRole(addEmp.getEmpRole());
        e.setLocation(addEmp.getLocation());
        e.setSalary(addEmp.getSalary());
        e.setEmpRating(addEmp.getEmpRating());
        return this.empServiceImpl.addEmp(e);
    }

    //get all
//    @GetMapping
    @QueryMapping("allEmps")
    public List<EmpDetails> getAllEmp() {
        return this.empServiceImpl.getAllEmp();
    }

//    @GetMapping("/{empId}")
    @QueryMapping("getEmp")
    public EmpDetails get(@Argument int empId) {
        return this.empServiceImpl.get(empId);
    }

}

@Getter
@Setter
class EmpDetailInput {
    private String empName;
    private String empRole;
    private String location;
    private double salary;
    private int empRating;
}
