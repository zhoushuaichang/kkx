package com.shinowit.web;

import com.shinowit.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2014/12/29.
 */
@Controller
@RequestMapping(value = "/order")
public class OrderController {

    @Resource
    private ProductMapper product_dao;
    @Resource
    private ChartMapper chart_dao;
    @Resource
    private OrderService order_service;

     @RequestMapping(value = "/order/{productCode}")
    public String makeOrder(@PathVariable(value = "productCode") String productCode, HttpSession session) {

         WebUser webUser= (WebUser) session.getAttribute("current_user");
        ChartCriteria chartEx = new ChartCriteria();
        ChartCriteria.Criteria criteria = chartEx.createCriteria();
        criteria.andUserNameEqualTo(webUser.getUserName());
        criteria.andProductCodeEqualTo(productCode);
        List<Chart> chartList = new ArrayList<Chart>();
        try {
            chartList = chart_dao.selectByExample(chartEx);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (chartList.size() == 0) {
            Product prod = new Product();
            try {
                prod = product_dao.selectByPrimaryKey(productCode);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Chart chart = new Chart();
            chart.setNum(1);
            chart.setProductCode(productCode);
            chart.setPrice(prod.getPrice());
            chart.setUserName(webUser.getUserName());
            chart.setTotal(prod.getPrice());
            try {
                chart_dao.insert(chart);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        chartList = chart_dao.listAll();

        session.setAttribute("chartList", chartList);
        return "/order";
    }

    @RequestMapping(value = "/delProduct")
    @ResponseBody
    public List<Chart> deleteProduce(@RequestParam(value = "productCode") String productCode, HttpSession session) {
        WebUser webUser= (WebUser) session.getAttribute("current_user");
        ChartCriteria chartEx = new ChartCriteria();
        ChartCriteria.Criteria criteria = chartEx.createCriteria();
        criteria.andProductCodeEqualTo(productCode);
        criteria.andUserNameEqualTo(webUser.getUserName());
        int result = chart_dao.deleteByExample(chartEx);
        List<Chart> chartList = chart_dao.listAll();
        return chartList;
    }

    @RequestMapping(value = "clearAll")
    public String clearAll(HttpSession session) {
        WebUser webUser= (WebUser) session.getAttribute("current_user");
        ChartCriteria chartEx = new ChartCriteria();
        ChartCriteria.Criteria criteria = chartEx.createCriteria();
        criteria.andUserNameEqualTo(webUser.getUserName());
        try {
            chart_dao.deleteByExample(chartEx);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/base";
    }

    @RequestMapping(value = "editChart")
    public void editChart (Chart chart,HttpSession session){
        WebUser webUser= (WebUser) session.getAttribute("current_user");
        ChartCriteria chartEx=new ChartCriteria();
        ChartCriteria.Criteria criteria=chartEx.createCriteria();
        criteria.andUserNameEqualTo(webUser.getUserName());
        criteria.andProductCodeEqualTo(chart.getProductCode());

        chart_dao.updateByExampleSelective(chart,chartEx);
        System.out.print("1111111111111111111111111111111111");
    }

    @RequestMapping(value = "/jiesuan")
    public String submitOrder(){
//        OrderInfo orderInfo=new OrderInfo();
//        OrderDetail orderDetail=new OrderDetail();
//        order_service.createOrder(orderInfo,orderDetail);
        return "address";
    }

}
