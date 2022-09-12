package com.intern.project.dtos;

import com.intern.project.entities.GeneralStatusEntity;
import com.intern.project.entities.GeneralTypeEntity;
import com.intern.project.entities.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrderDto {

    private int customerOrderId;
    private int userId;
    private UserDto userDto;
    private int statusId;
    private GeneralStatusDto generalStatusDto;
    private int typeId;
    private GeneralTypeDto generalTypeDto;

    private CustomerOrderDto(CustomerOrderDtoBuilder builder) {
        this.customerOrderId = builder.customerOrderId;
        this.userId = builder.userId;
        this.userDto = builder.userDto;
        this.statusId = builder.statusId;
        this.generalStatusDto = builder.generalStatusDto;
        this.typeId = builder.typeId;
        this.generalTypeDto = builder.generalTypeDto;
    }


    @NoArgsConstructor
    public static class CustomerOrderDtoBuilder {

        private int customerOrderId;
        private int userId;
        private UserDto userDto;
        private int statusId;
        private GeneralStatusDto generalStatusDto;
        private int typeId;
        private GeneralTypeDto generalTypeDto;

        public CustomerOrderDtoBuilder customerOrderId(int customerOrderId){
            this.customerOrderId = customerOrderId;
            return this;
        }

        public CustomerOrderDtoBuilder userId(int userId){
            this.userId = userId;
            return this;
        }

        public CustomerOrderDtoBuilder userDto(UserDto userDto){
            this.userDto = userDto;
            return this;
        }

        public CustomerOrderDtoBuilder statusId(int statusId){
            this.statusId = statusId;
            return this;
        }

        public CustomerOrderDtoBuilder generalStatusDto(GeneralStatusDto generalStatusDto){
            this.generalStatusDto = generalStatusDto;
            return this;
        }

        public CustomerOrderDtoBuilder typeId(int typeId){
            this.typeId = typeId;
            return this;
        }

        public CustomerOrderDtoBuilder userId(GeneralTypeDto generalTypeDto){
            this.generalTypeDto = generalTypeDto;
            return this;
        }

        public CustomerOrderDto build(){
            CustomerOrderDto customerOrderDto = new CustomerOrderDto(this);
            return customerOrderDto;
        }
    }
}