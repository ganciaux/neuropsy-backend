package com.ganciaux.neuropsy.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Form {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Category category;

    private Page page;
}
