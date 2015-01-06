package com.shinowit.service;

import com.shinowit.dao.mapper.OrderInfoMapper;
import com.shinowit.entity.OrderDetail;
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
    public boolean createOrder(OrderInfo orderInfo,OrderDetail orderDetail){
        boolean result=false;
       int id=order_info_dao.insert(orderInfo);
//        orderDetail.set
        return result;
    }

}
