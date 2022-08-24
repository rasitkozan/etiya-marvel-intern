package com.intern.project.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usr")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserEntity extends AbstractEditedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "scr_name")
    private String screenName;

    @Column(name = "pwd")
    private String password;

    @Column(name = "uname")
    private String userName;

    @Basic
    @Column(name = "st_id")
    private int statusId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "st_id", referencedColumnName = "gnl_st_id", updatable = false, insertable = false)
    private GeneralStatusEntity generalStatusEntity;

    @Basic
    @Column(name = "tp_id")
    private int typeId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tp_id", referencedColumnName = "gnl_tp_id", updatable = false, insertable = false)
    private GeneralTypeEntity generalTypeEntity;

}
