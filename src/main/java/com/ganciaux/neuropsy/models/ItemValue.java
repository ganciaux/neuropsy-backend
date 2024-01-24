package com.ganciaux.neuropsy.models;

import jakarta.persistence.*;
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

    @ManyToOne
    @JoinColumn(name="item_id", nullable=false)
    private Category item;
}
