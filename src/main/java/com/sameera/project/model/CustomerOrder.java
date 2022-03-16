package com.sameera.project.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

/**
 * This class represents Customer order Entity.
 */
@Entity
@Getter
@Setter
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String customer;

    private String country;

    private String address;

    private String projectTitle;

    private String projectDescription;

    private Date date;

    @Enumerated(EnumType.STRING)
    private Status status;

     public enum Status{
         DELIVERED,
         COMPLETED,
         PREPARED,
         PROPONE
     }


}
