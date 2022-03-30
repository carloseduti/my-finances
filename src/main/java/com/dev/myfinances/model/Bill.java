package com.dev.myfinances.model;

import com.dev.myfinances.enums.BillType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "Uuid", nullable = false)
    private String uuid;

    @Column(name = "Name")
    private String name;

    @Column(name = "Value")
    private BigDecimal value;

    @Column(name = "Paid")
    private Boolean paid;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Category")
    private Category category;

    @Column(name = "Company")
    private String company;

    @Enumerated(EnumType.STRING)
    @Column(name = "BillType")
    private BillType type;

    @Column(name= "BarCode")
    private String barCode;

    @Column(name = "Portion")
    private Integer portion;

    @Column(name = "startDate")
    private LocalDate startDate;

    @Column(name = "DueDate")
    private LocalDate dueDate;

    @Column(name= "Payday")
    private LocalDate Payday;

    @Column(name = "RegistrationDate")
    private LocalDateTime registrationDate;
}
