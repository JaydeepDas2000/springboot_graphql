package com.graphql.learn.graphqlproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "emp_details")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmpDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String empName;
    private String empRole;
    private String location;
    private double salary;
    private int empRating;

}
