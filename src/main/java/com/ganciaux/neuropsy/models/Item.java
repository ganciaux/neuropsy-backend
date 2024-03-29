package com.ganciaux.neuropsy.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

public class Item {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String label;
    @Enumerated(EnumType.STRING)
    private ItemType itemType;
    private boolean required;
    private boolean multiple;
    private Integer order;
    @OneToMany(mappedBy="item")
    private Set<ItemValue> itemValues;
}
