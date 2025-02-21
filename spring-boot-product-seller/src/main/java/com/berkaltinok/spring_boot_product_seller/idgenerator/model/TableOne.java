package com.berkaltinok.spring_boot_product_seller.idgenerator.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name= "table_one")
public class TableOne
{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator ="table_one_generator" )
    @TableGenerator(name ="table_one_generator", table="table_one_id_generator", allocationSize = 1)
    private Long id;

    private String name;
}