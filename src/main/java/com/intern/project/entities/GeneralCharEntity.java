package com.intern.project.entities;

import lombok.*;


import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "gnl_char")
public class GeneralCharEntity extends AbstractEditedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gnl_char_id")
    private int generalCharId;

    @Column(name = "name")
    private String name;

    @Column(name = "shrt_code")
    private String shortCode;

    @Column(name = "descr")
    private String description;

    @Basic
    @Column(name = "st_id")
    private int statusId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "st_id", referencedColumnName = "gnl_st_id", updatable = false, insertable = false)
    private GeneralStatusEntity generalStatusEntity;

}

