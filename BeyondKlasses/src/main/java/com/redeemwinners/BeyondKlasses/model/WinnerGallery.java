package com.redeemwinners.BeyondKlasses.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class WinnerGallery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private String name;
    private String school;
    private String month;
    private String email;
    private String age;
    private String competition;
    private String sponsor;
    private String type;
    private String dynamicPage;

}
