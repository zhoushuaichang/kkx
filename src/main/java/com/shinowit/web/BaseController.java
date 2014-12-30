package com.shinowit.web;

import com.shinowit.dao.mapper.ProductMapper;
import com.shinowit.dao.mapper.ProductTypeMapper;
import com.shinowit.entity.Product;
import com.shinowit.entity.ProductCriteria;
import com.shinowit.entity.ProductType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

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
    public String showProductTypeList(Model model,@RequestParam(value = "pageIndex", required = false, defaultValue = "1")int pageIndex) {

        ProductCriteria ex=new ProductCriteria();
        ex.setPageSize(8);
        ex.setPageIndex(pageIndex);

        List<ProductType> productTypeList = product_type_dao.listAll();
        List<Product> productList = product_dao.selectPage(ex);
        model.addAttribute("product_type_list", productTypeList);
        model.addAttribute("product_list", productList);
        return "index";
    }

}
