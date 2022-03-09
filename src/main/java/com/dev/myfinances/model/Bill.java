package com.dev.myfinances.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "Id_User")
    private Integer idUser;

    @Column(name = "Name")
    private String name;

    @Column(name = "Value")
    private BigDecimal value;

    @Column(name = "Paid")
    private Boolean paid;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Type")
    private BillType billType;

    @Column(name = "Description")
    private String description;

    @Column(name = "RegistrationDate")
    private LocalDateTime registrationDate;

    @Column(name = "ExpirationDate")
    private LocalDate expirationDate;

}
