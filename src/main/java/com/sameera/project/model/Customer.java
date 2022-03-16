package com.sameera.project.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

/**
 * This class represents Customer Entity.
 */
@Entity
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String mailId;

    private long mobileNumber;

    private String address;

    private String country;

}