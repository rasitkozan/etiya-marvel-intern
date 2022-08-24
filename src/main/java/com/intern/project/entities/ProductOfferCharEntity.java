package com.intern.project.entities;

import lombok.*;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "prod_ofr_char")
public class ProductOfferCharEntity extends AbstractEditedEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="prd_ofr_char_id")
	private int productOfferCharId;

    @Basic
    @Column(name="prod_ofr_id")
    private int productOfferId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "prod_ofr_id",referencedColumnName = "prod_ofr_id",updatable = false,insertable = false)
    private ProductOfferEntity productOfferEntity;

    @Basic
    @Column(name = "char_id")
    private int charId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "char_id",referencedColumnName = "gnl_char_id",updatable = false,insertable = false)
    private GeneralCharEntity generalCharEntity;

    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "st_id")
    private int statusId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "st_id",referencedColumnName = "gnl_st_id",updatable = false,insertable = false)
    private GeneralStatusEntity generalStatusEntity;

    @Column(name="shrt_code")
    private int shortCode;

    @Column(name = "descr")
	private String description;
}
