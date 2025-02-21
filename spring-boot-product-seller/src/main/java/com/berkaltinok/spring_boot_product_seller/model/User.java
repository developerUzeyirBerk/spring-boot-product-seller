package com.berkaltinok.spring_boot_product_seller.model;




import lombok.Data;

import java.time.LocalDateTime;
import javax.persistence.*;

@Data
@Entity
@Table(name="users")


public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "username", unique = true, nullable = false, length = 100)
    private String username;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name= "name", nullable = false)
    private String name;

    @Column(name="create_Time", nullable = false)
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column(name="role", nullable = false)
    private Role role;

    @Transient
    private String token;
}
