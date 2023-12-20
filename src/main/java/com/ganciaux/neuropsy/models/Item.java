package com.ganciaux.neuropsy.models;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

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
}
