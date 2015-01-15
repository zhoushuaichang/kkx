package com.shinowit.web;

import com.shinowit.dao.mapper.CityMapper;
import com.shinowit.dao.mapper.DistrictMapper;
import com.shinowit.dao.mapper.ProvinceMapper;
import com.shinowit.entity.City;
import com.shinowit.entity.District;
import com.shinowit.entity.Province;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/12/30.
 */
@Controller
@RequestMapping("/address")
public class AddressController {

    @Resource
    private ProvinceMapper province_dao;
    @Resource
    private CityMapper city_dao;
    @Resource
    private DistrictMapper district_dao;

    @RequestMapping(value = "/province")
    @ResponseBody
    public List<Province> queryProvince(){
        List<Province> provinceList=province_dao.listAll();
        return provinceList;
    }

    @RequestMapping(value = "/city")
    @ResponseBody
    public List<City> queryCity(String provinceId){
        List<City> cityList=city_dao.queryCityByProvinceId(provinceId);
        return cityList;
    }

    @RequestMapping(value = "/district")
    @ResponseBody
    public List<District> queryDistrict(String cityId){
        List<District> districtList=district_dao.queryDistrictByCityId(cityId);
        return districtList;
    }

}
