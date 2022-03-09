package com.dev.myfinances.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Data
@Entity
@Immutable
@Cacheable
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class BillType {

    @Id
    @ToString.Include
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "Code", nullable = false)
    private Integer code;

    @Column(name = "Name", nullable = false)
    private String name;
}
