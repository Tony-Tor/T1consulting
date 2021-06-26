package com.tonytor.t1consulting.model;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Access(AccessType.FIELD)
@Data
public abstract class AbstractIdEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer id;
}
