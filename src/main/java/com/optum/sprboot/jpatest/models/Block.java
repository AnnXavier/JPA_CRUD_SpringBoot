package com.optum.sprboot.jpatest.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import lombok.*;


@Data
@Entity(name="block")
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private Integer mbr_sk;
    private Integer room_id;
    private Integer blockholder_id;
    private String start_tm;
    private String end_tm;
    private Date effective_start_dt;
    private Date effective_end_dt;
    private Integer day_of_week;
    private Integer week_of_month;
    private String active_flg;
    private Date update_dt;
    private String recurrence;

}
