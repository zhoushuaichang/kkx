package com.shinowit.web;

import com.shinowit.dao.mapper.ProductMapper;
import com.shinowit.dao.mapper.ProductTypeMapper;
import com.shinowit.entity.Product;
import com.shinowit.entity.ProductType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/12/24.
 */
@Controller
@RequestMapping(value = "/")
public class BaseController {

    @Resource
    private ProductTypeMapper product_type_dao;
    @Resource
    private ProductMapper product_dao;

    @RequestMapping(value = "/base")
    public String showProductTypeList(Model model) {
        List<ProductType> productTypeList = product_type_dao.listAll();
        List<Product> productList=product_dao.listAll();
        model.addAttribute("product_type_list", productTypeList);
        model.addAttribute("product_list", productList);
        return "index";
    }

}
