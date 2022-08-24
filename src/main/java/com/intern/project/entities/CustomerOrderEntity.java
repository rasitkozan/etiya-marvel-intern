package com.intern.project.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "cust_ord")
public class CustomerOrderEntity extends AbstractEditedEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cust_ord_id")
    private int customerOrderId;

	@Basic
	@Column(name="user_id")
	private int userId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id",referencedColumnName = "user_id",updatable = false,insertable = false)
	private UserEntity userEntity;

	@Basic
	@Column(name = "st_id")
	private int statusId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "st_id",referencedColumnName = "gnl_st_id",updatable = false,insertable = false)
	private GeneralStatusEntity generalStatusEntity;

	@Basic
	@Column(name="tp_id")
	private int typeId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "to_id",referencedColumnName = "gnl_tp_id",updatable = false,insertable = false)
	private GeneralTypeEntity generalTypeEntity;
}
