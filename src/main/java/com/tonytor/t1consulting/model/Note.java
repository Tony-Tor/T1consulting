package com.tonytor.t1consulting.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Note extends AbstractIdEntity{

    @Size(max = 2000)
    @Column(nullable = false, length = 2000)
    @NotNull
    private String text;

    @Column(nullable = false)
    @NotNull
    private LocalDateTime created;

    @Size(max = 2000)
    @Column(nullable = false, length = 2000)
    @NotNull
    private String tags;

    @Size(max = 50)
    @Column(nullable = false, length = 50)
    private String name;
}
