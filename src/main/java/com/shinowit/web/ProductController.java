package com.shinowit.web;

import com.shinowit.dao.mapper.ProductMapper;
import com.shinowit.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping(value = "/product")
public class ProductController {

    @Resource
    private ProductMapper product_dao;

    @RequestMapping(value = "/productAll")
    public String showProduct(HttpSession session) {
        session.removeAttribute("product_list");
        List<Product> productList = product_dao.listAll();
        session.setAttribute("productList", productList);
        return "product_by_type";
    }

    @RequestMapping(value = "/productByType")
    @ResponseBody
    public List<Product> showProductByType(@RequestParam(value = "typeCode") String typeCode, Model model, HttpSession session) {
        session.removeAttribute("product_list");
        List<Product> productList = product_dao.selectByProductType(typeCode);
        return productList;
    }

    @RequestMapping(value = "/productByCode/{productCode}")
    public String showProductByCode(@PathVariable String productCode,Model model){
        Product product=product_dao.selectByPrimaryKey(productCode);
        model.addAttribute("product",product);
        return "inner-page";
    }


}
