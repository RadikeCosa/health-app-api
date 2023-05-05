package com.chinatown.healthAPI.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String date;
    private String hour;
    private String hr;
    private String rr;
    private String bp;
    private String o2;
    private String glucose;
    private Boolean bowel;
    private Boolean urine;
    private String report;
    private String indications;
    private String sign;

}
