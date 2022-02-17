package com.minkyu.springboilerplate.domain.example.repository;

import com.minkyu.springboilerplate.domain.example.model.Example;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by MinKyu Kim
 * Created on 2022-02-17.
 **/
public interface ExampleRepository extends JpaRepository<Example, Long> {

}
