package com.intern.project.entities;


import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "cust_ord_char_val")
public class CustomerOrderCharValEntity extends AbstractEditedEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cust_ord_char_val_id")
    private int customerOrderCharValId;

    @Basic
    @Column(name = "cust_ord_id")
    private int customerOrderId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cust_ord_id",referencedColumnName = "cust_ord_id",updatable = false,insertable = false)
    private CustomerOrderEntity customerOrderEntity;

    @Basic
    @Column(name = "char_id")
    private int charId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "char_id",referencedColumnName = "gnl_char_id",updatable = false,insertable = false)
    private GeneralCharEntity generalCharEntity;

    @Basic
    @Column(name = "char_val_id")
    private int charValId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "st_id",referencedColumnName = "gnl_st_id",updatable = false,insertable = false)
    private GeneralStatusEntity generalStatusEntity;

}
