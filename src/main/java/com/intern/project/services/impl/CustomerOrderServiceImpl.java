package com.intern.project.services.impl;

import com.intern.project.dtos.*;
import com.intern.project.entities.CustomerOrderEntity;
import com.intern.project.entities.UserEntity;
import com.intern.project.exceptions.NotFoundException;
import com.intern.project.mappers.ICustomerOrderMapper;
import com.intern.project.mappers.IUserMapper;
import com.intern.project.repos.ICustomerOrderRepository;
import com.intern.project.dtos.customerOrders.CustomerOrderRequest;
import com.intern.project.dtos.customerOrderCharVals.CustomerOrderChar;
import com.intern.project.dtos.customerOrders.CustomerOrder;
import com.intern.project.dtos.productOffers.ProductOffer;
import com.intern.project.services.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerOrderServiceImpl implements ICustomerOrderService {
    private final ICustomerOrderRepository customerOrderRepository;
    private final ICustomerOrderItemService customerOrderItemService;
    private final IUserService userService;
    private final IProductOfferService productOfferService;

    private final IGeneralTypeService generalTypeService;

    public CustomerOrderServiceImpl(ICustomerOrderRepository customerOrderRepository, ICustomerOrderItemService customerOrderItemService,
                                    IUserService userService, IProductOfferService productOfferService,IGeneralTypeService generalTypeService) {
        this.customerOrderRepository = customerOrderRepository;
        this.customerOrderItemService = customerOrderItemService;
        this.userService = userService;
        this.productOfferService = productOfferService;
        this.generalTypeService=generalTypeService;
    }

    @Override
    public CustomerOrderDto save(CustomerOrderDto customerOrderDto) {

        checkIfUserExistsById(customerOrderDto);

        CustomerOrderEntity customerOrderEntity = ICustomerOrderMapper.INSTANCE.customerOrderDtoToCustomerOrderEntity(customerOrderDto);

        return ICustomerOrderMapper.INSTANCE
                .customerOrderEntityToCustomerOrderDto(
                        this.customerOrderRepository.save(customerOrderEntity)
                );


    }

    @Override
    public CustomerOrder continueSelectedOffer(CustomerOrderRequest customerOrderRequest) {

        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.setProductOfferList(customerOrderRequest.getProductOfferList());

        UserDto userDto = this.userService.getById(customerOrderRequest.getUserId());
        customerOrder.setUser(IUserMapper.INSTANCE.userDtoToUser(userDto));

        GeneralTypeDto generalTypeDto = this.generalTypeService.getByShortCode("quote");
        customerOrder.setType(generalTypeDto.getShortCode());

        List<CustomerOrderChar> customerOrderCharList = new ArrayList<>();
        customerOrder.setCustomerOrderCharList(customerOrderCharList);

        CustomerOrderDto response = save(customerOrderDtoBuilderHelper(customerOrderRequest));


        List<CustomerOrderItemDto> customerOrderItemDtoList = new ArrayList<>();
        int customerOrderId = response.getCustomerOrderId();
        customerOrderRequest.getProductOfferList().forEach(productOffer ->
                customerOrderItemDtoList.add(customerOrderItemDtoHelper(customerOrderId, productOffer))
        );

        this.customerOrderItemService.saveAll(customerOrderItemDtoList);

        return customerOrder;
    }

    private CustomerOrderDto customerOrderDtoBuilderHelper(CustomerOrderRequest customerOrderRequest) {

        return new CustomerOrderDto.CustomerOrderDtoBuilder()
                .userId(customerOrderRequest.getUserId())
                .typeId(1)
                .statusId(1)
                .build();
    }

    private CustomerOrderItemDto customerOrderItemDtoHelper(int id, ProductOffer productOffer) {

        return new CustomerOrderItemDto.CustomerOrderItemDtoBuilder()
                .customerOrderId(id)
                .productOfferId(productOffer.getProductOfferId())
                .statusId(1)
                .build();
    }

    private ProductOfferDto checkIfProductOfferExistsById(ProductOffer productOffer) {
        ProductOfferDto productOfferDto;

        try {
         productOfferDto = this.productOfferService.getById(productOffer.getProductOfferId());
        } catch (Exception e) {
            throw new NotFoundException("USERS.NOT.EXISTS");
        }
        return productOfferDto;
    }

    private UserEntity checkIfUserExistsById(CustomerOrderDto customerOrderDto) {
        UserEntity currentUser;

        try {
            currentUser = IUserMapper.INSTANCE.userDtoToUserEntity(this.userService.getById(customerOrderDto.getUserId()));
        } catch (Exception e) {
            throw new NotFoundException("USERS.NOT.EXISTS");
        }
        return currentUser;
    }
}