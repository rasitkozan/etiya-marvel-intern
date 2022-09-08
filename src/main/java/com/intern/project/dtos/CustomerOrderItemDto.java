package com.intern.project.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrderItemDto {

    private int customerOrderItemId;
    private int customerOrderId;
    private CustomerOrderDto customerOrderDto;
    private int productOfferId;
    private ProductOfferDto productOfferDto;
    private int statusId;
    private GeneralStatusDto generalStatusDto;

    public CustomerOrderItemDto(CustomerOrderItemDtoBuilder builder) {
        this.customerOrderItemId = builder.customerOrderItemId;
        this.customerOrderId = builder.customerOrderId;
        this.customerOrderDto = builder.customerOrderDto;
        this.productOfferId = builder.productOfferId;
        this.productOfferDto = builder.productOfferDto;
        this.statusId = builder.statusId;
        this.generalStatusDto = builder.generalStatusDto;
    }

    @NoArgsConstructor
    public static class CustomerOrderItemDtoBuilder {

        private int customerOrderItemId;
        private int customerOrderId;
        private CustomerOrderDto customerOrderDto;
        private int productOfferId;
        private ProductOfferDto productOfferDto;
        private int statusId;
        private GeneralStatusDto generalStatusDto;

        public CustomerOrderItemDtoBuilder customerOrderItemId(int customerOrderItemId) {
            this.customerOrderItemId = customerOrderItemId;
            return this;
        }

        public CustomerOrderItemDtoBuilder customerOrderId(int customerOrderId) {
            this.customerOrderId = customerOrderId;
            return this;
        }

        public CustomerOrderItemDtoBuilder customerOrderDto(CustomerOrderDto customerOrderDto) {
            this.customerOrderDto = customerOrderDto;
            return this;
        }

        public CustomerOrderItemDtoBuilder productOfferId(int productOfferId) {
            this.productOfferId = productOfferId;
            return this;
        }

        public CustomerOrderItemDtoBuilder productOfferDto(ProductOfferDto productOfferDto) {
            this.productOfferDto = productOfferDto;
            return this;
        }

        public CustomerOrderItemDtoBuilder statusId(int statusId) {
            this.statusId = statusId;
            return this;
        }

        public CustomerOrderItemDtoBuilder userId(GeneralStatusDto generalStatusDto) {
            this.generalStatusDto = generalStatusDto;
            return this;
        }

        public CustomerOrderItemDto build() {
            return new CustomerOrderItemDto(this);

        }
    }
}
