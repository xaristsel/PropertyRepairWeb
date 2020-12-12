package com.projectFuture.propertyRepairWebApp.domain;

import com.projectFuture.propertyRepairWebApp.enums.RepairType;
import com.projectFuture.propertyRepairWebApp.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="REPAIRS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Repair {

    @Id
    @Column(name="repairID",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="repairDate",nullable = false)
    private Date repairDate;

    @Enumerated(EnumType.STRING)
    @Column(name="status",nullable = false,columnDefinition ="varchar(255) default 'PENDING'" )
    private Status status;

    @Column(name="cost",nullable = false)
    private double cost;

    @Column(name="address",length = 120,nullable = false)
    private String address;

    @ManyToOne(optional = false)
    @JoinColumn(name="userID",referencedColumnName = "userID")
    private User user;

    @Column(name="description",nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name="repairType",nullable = false)
    private RepairType repairType;


}
