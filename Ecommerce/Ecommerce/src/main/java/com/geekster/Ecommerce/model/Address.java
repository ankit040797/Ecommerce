package com.geekster.Ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addId;
    private String addName;
    private String addLandmark;
    private String addPhNumber;
    private String addZipcode;
    private String addState;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



}
