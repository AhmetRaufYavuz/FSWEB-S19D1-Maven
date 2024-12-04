package com.workintech.s18d2.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@MappedSuperclass
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @NotNull(message = "Name boş olamaz!")
    @Size(min = 2,max = 45,message = "Name 2 ile 45 arası olmalı!")
    private String name;



    @Column(name = "price")
    @DecimalMin(value = "10",message = "price 10 dan küçük olamaz!")
    private Double price;


}
