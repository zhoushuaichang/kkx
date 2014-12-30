package com.shinowit.web;

import com.shinowit.dao.mapper.ProductMapper;
import com.shinowit.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(value = "/order/{productCode}")
    public String makeOrder(@PathVariable(value = "productCode") String productCode,HttpSession session){
        List<Product> productList=new ArrayList<Product>();
        if(session.getAttribute("productList")!=null){
            productList=(List<Product>)session.getAttribute("productList");
            for(Product pro:productList){
                if(pro.getProductCode().equals(productCode)){
                    return "/order";
                }
            }
            Product product=product_dao.selectByPrimaryKey(productCode);
            productList.add(product);
            session.setAttribute("productList",productList);
            return "/order";
        }
        Product product=product_dao.selectByPrimaryKey(productCode);
        productList.add(product);
        session.setAttribute("productList",productList);
        return "/order";
    }

    @RequestMapping(value = "/delProduct")
    @ResponseBody
    public List<Product> deleteProduce(@RequestParam(value = "productCode") String productCode,HttpSession session){
        List<Product> productList=(List<Product>)session.getAttribute("productList");
        for(Product pro:productList){
            if(pro.getProductCode().equals(productCode)){
                Product product=product_dao.selectByPrimaryKey(productCode);
                productList.remove(product);
            }
        }
        return productList;
    }

    @RequestMapping(value = "clearAll")
    public String clearAll(HttpSession session){
        if(session.getAttribute("productList")!=null){
            session.removeAttribute("productList");
        }
        return"";
    }

}
