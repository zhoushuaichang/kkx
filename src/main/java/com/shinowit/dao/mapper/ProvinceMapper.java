package com.shinowit.dao.mapper;

import com.shinowit.entity.Province;
import com.shinowit.entity.ProvinceCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProvinceMapper {
    List<Province> listAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Mon Jan 05 16:07:39 CST 2015
     */
    int countByExample(ProvinceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Mon Jan 05 16:07:39 CST 2015
     */
    int deleteByExample(ProvinceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Mon Jan 05 16:07:39 CST 2015
     */
    int insert(Province record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Mon Jan 05 16:07:39 CST 2015
     */
    int insertSelective(Province record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Mon Jan 05 16:07:39 CST 2015
     */
    List<Province> selectByExample(ProvinceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Mon Jan 05 16:07:39 CST 2015
     */
    int updateByExampleSelective(@Param("record") Province record, @Param("example") ProvinceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbggenerated Mon Jan 05 16:07:39 CST 2015
     */
    int updateByExample(@Param("record") Province record, @Param("example") ProvinceCriteria example);

    List<Province> selectPage(ProvinceCriteria example);
}