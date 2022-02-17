package com.minkyu.springboilerplate.domain.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * Created by MinKyu Kim
 * Created on 2022-02-17.
 **/

@Entity
@Table(name="example", schema = "public")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Example {

    @Id
    @Column
    private Long id;
}
