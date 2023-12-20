package com.ganciaux.neuropsy.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "_user")
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String firstname;
    @Column(unique = true)
    private String email;
    private String password;

}
