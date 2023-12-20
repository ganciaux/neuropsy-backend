package com.ganciaux.neuropsy.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemValue {
    @Id
    @GeneratedValue
    private Integer id;
    private String label;
    private Integer value;
    @Column(name = "item_order")
    private Integer itemOrder;
}
