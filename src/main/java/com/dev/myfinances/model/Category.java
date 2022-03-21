package com.dev.myfinances.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Code", nullable = false)
    private String code;

    @Column(name = "Description")
    private String description;

}
