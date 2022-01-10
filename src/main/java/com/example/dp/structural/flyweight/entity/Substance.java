package com.example.dp.structural.flyweight.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Substance {
    private double grams;
    private Chemical chemical;
}
