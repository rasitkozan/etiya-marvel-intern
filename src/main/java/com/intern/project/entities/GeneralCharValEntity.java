package com.intern.project.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "gnl_char_val")
public class GeneralCharValEntity extends AbstractEditedEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="gnl_char_val_id")
    private int generalCharValId;

//    @Basic
//    @Column(name = "char_id")
//    private int charId;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "char_id",referencedColumnName = "gnl_char_id",updatable = false,insertable = false)
//    private GeneralCharEntity generalCharEntity;

    @Column(name = "name")
    private String name;

    @Column(name="shrt_code")
    private int shortCode;

    @Column(name = "descr")
    private String description;

    @Column(name="val")
    private int val;

    @Basic
    @Column(name = "st_id")
    private int statusId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "st_id",referencedColumnName = "gnl_st_id",updatable = false,insertable = false)
    private GeneralStatusEntity generalStatusEntity;

//    @Basic
//    @Column(name = "default_selected")
//    private int default_selected;
//    default_selected????

}
