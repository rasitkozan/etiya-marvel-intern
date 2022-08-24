package com.intern.project.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "cust_ord_item")
public class CustomerOrderItemEntity extends AbstractEditedEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cust_ord_item_id")
    private int customerOrderItemId;

    @Basic
    @Column(name = "cust_ord_id")
    private int customerOrderId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cust_ord_id",referencedColumnName = "cust_ord_id",updatable = false,insertable = false)
    private CustomerOrderEntity customerOrderEntity;

    @Basic
    @Column(name = "prod_ofr_id")
    private int productOfferId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "prod_ofr_id",referencedColumnName = "prod_ofr_id",updatable = false,insertable = false)
    private ProductOfferEntity productOfferEntity;

    @Basic
    @Column(name = "st_id")
    private int statusId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "st_id",referencedColumnName = "gnl_st_id",updatable = false,insertable = false)
    private GeneralStatusEntity generalStatusEntity;
}
