package com.ganciaux.neuropsy.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Page {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @OneToMany(mappedBy="page")
    private Set<Form> forms;
}
