package com.example.dp.structural.flyweight.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chemical{
    private String name;
    private String symbol;
    private Double atomicWeight;
}
