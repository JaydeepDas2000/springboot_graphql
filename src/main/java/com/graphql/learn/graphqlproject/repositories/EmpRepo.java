package com.graphql.learn.graphqlproject.repositories;

import com.graphql.learn.graphqlproject.entity.EmpDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<EmpDetails, Integer> {
}
