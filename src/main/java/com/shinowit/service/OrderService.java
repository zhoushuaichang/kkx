package com.shinowit.service;

import com.shinowit.dao.mapper.OrderInfoMapper;
import com.shinowit.entity.OrderInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2014/12/29.
 */
@Service
public class OrderService {

    @Resource
    private OrderInfoMapper order_info_dao;

    @Transactional
    public boolean createOrder(){
        boolean result=false;
        OrderInfo orderInfo=new OrderInfo();

//        order_info_dao.insert()
        return result;
    }

}
