package com.shinowit.service;

import com.shinowit.dao.mapper.ChartMapper;
import com.shinowit.dao.mapper.MemberAddressMapper;
import com.shinowit.dao.mapper.OrderDetailMapper;
import com.shinowit.dao.mapper.OrderInfoMapper;
import com.shinowit.entity.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2014/12/29.
 */
@Service
public class OrderService {

    @Resource
    private OrderInfoMapper order_info_dao;
    @Resource
    private MemberAddressMapper member_address_dao;
    @Resource
    private OrderDetailMapper order_detail_dao;
    @Resource
    private ChartMapper chart_dao;

    @Transactional
    public boolean createOrder(int addressId, HttpSession session) {
        boolean result = false;

        MemberAddress memberAddress = member_address_dao.selectByPrimaryKey(addressId);
        OrderInfo order = new OrderInfo();
        List<OrderDetail> orderDetailList=new ArrayList<OrderDetail>();
        WebUser webUser = (WebUser) session.getAttribute("current_user");
        order.setUserName(webUser.getUserName());
//生成订单号
        int r1 = (int) (Math.random() * 100);
        int r2 = (int) (Math.random() * 100);
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String billCode = dateFormat.format(new Date()) + webUser.getId() + String.valueOf(r1) + String.valueOf(r2);
        order.setBillCode(billCode);
//构造OrderInfo
        order.setLinkTel(memberAddress.getTel());
        order.setPostCode(memberAddress.getPostCode());
        order.setRecvAddress(memberAddress.getRecvAddress());
        order.setRecvName(memberAddress.getRecvMan());
        order.setBillStatus((byte) 1);
        order.setOrderTime(new Date());
//查询购物车，并添加到订单详细OrderDetail
        ChartCriteria chartEx=new ChartCriteria();
        ChartCriteria.Criteria criteria=chartEx.createCriteria();
        criteria.andUserNameEqualTo(webUser.getUserName());
        List<Chart> chartList=chart_dao.selectByExample(chartEx);
        float total=0;

        for(Chart c:chartList){
            OrderDetail orderDetail=new OrderDetail();
            total+=c.getTotal().floatValue();
            orderDetail.setBillCode(billCode);
            orderDetail.setNum(c.getNum());
            orderDetail.setPrice(c.getPrice());
            orderDetail.setProductCode(c.getProductCode());
            orderDetailList.add(orderDetail);
        }
        order.setTotalMoney(BigDecimal.valueOf(total));
        int num=0;
        try{
            num = order_info_dao.insert(order);
        }catch (Exception e){
            e.printStackTrace();
        }
        for(OrderDetail o:orderDetailList){
            try{
                order_detail_dao.insert(o);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        chart_dao.deleteByExample(chartEx);

        if(num==1){
            result=true;
        }
        return result;
    }

}
