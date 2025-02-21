package com.berkaltinok.spring_boot_product_seller.idgenerator.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name= "sequence_one")
public class SequenceOne
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_one_generator" )
    @SequenceGenerator(name = "sequence_one_generator", sequenceName = "sequence_one_id", allocationSize = 1)

    private Long id;

    private String name;
}