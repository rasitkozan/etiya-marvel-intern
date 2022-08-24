package com.intern.project.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "gnl_st")
public class GeneralStatusEntity extends AbstractEditedEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="gnl_st_id")
    private int generalStatusId;

    @Column(name = "name")
    private String name;

    @Column(name = "descr")
    private String description;

    @Column(name="shrt_code")
    private String shortCode;

    @Column(name="ent_code_name")
    private String entityCodeName;

    @Column(name="is_actv")
    private Boolean isActive;
}
