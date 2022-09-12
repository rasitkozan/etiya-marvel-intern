package com.intern.project.entities;

import lombok.*;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "prod_ofr")
public class ProductOfferEntity extends AbstractEditedEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prod_ofr_id")
	private int productOfferId;

	@Column(name = "name")
	private String name;

	@Column(name = "descr")
	private String description;

	@Basic
	@Column(name = "st_id")
	private int statusId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "st_id",referencedColumnName = "gnl_st_id",updatable = false,insertable = false)
	private GeneralStatusEntity generalStatusEntity;

	@Basic
	@Column(name = "tp_id")
	private int typeId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tp_id",referencedColumnName = "gnl_tp_id",updatable = false,insertable = false)
	private GeneralTypeEntity generalTypeEntity;
}
