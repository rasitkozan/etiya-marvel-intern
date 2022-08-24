package com.intern.project.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "gnl_tp")
public class GeneralTypeEntity extends AbstractEditedEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="gnl_tp_id")
	private int generalTypeId;

    @Column(name = "name")
	private String name;

    @Column(name = "descr")
    private String description;

    @Column(name = "shr_code")
    private int shortCode;

    @Column(name = "ent_code_name")
    private String entityCodeName;

    @Column(name = "is_actv")
    private int isActive;
}
