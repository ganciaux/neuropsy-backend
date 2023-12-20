package com.ganciaux.neuropsy.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String firstname;
    private LocalDate birthDate;
    @Column(unique = true)
    private String phone;
    private String gsm;
    private String email;
    private String address;
    private String city;
    @Enumerated(EnumType.STRING)
    private Country country;
    private String zip;

}
