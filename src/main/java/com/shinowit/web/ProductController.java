package com.shinowit.web;

import com.shinowit.dao.mapper.ProductMapper;
import com.shinowit.dao.mapper.ProductTypeMapper;
import com.shinowit.entity.Product;
import com.shinowit.entity.ProductCriteria;
import com.shinowit.entity.ProductType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
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
    @Resource
    private ProductTypeMapper product_type_dao;

    @RequestMapping(value = "/productByType")
    @ResponseBody
    public List<Product> showProductByType(@RequestParam(value = "typeCode") String typeCode, Model model, HttpSession session) {
        session.removeAttribute("product_list");
        ProductCriteria ex=new ProductCriteria();
        ProductCriteria.Criteria criteria=ex.createCriteria();
        criteria.andTypeCodeEqualTo(typeCode);
        ex.setPageIndex(1);
        ex.setPageSize(1);
        List<Product> productList = product_dao.selectPage(ex);
        return productList;
    }

    @RequestMapping(value = "/productByCode/{productCode}")
    public String showProductByCode(@PathVariable String productCode,Model model){
        Product product=product_dao.selectByPrimaryKey(productCode);
        List<ProductType> productTypeList = product_type_dao.listAll();
        model.addAttribute("product",product);
        model.addAttribute("productTypeList",productTypeList);
        return "inner-page";
    }

}
