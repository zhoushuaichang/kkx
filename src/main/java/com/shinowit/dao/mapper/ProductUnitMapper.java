package com.shinowit.dao.mapper;

import com.shinowit.entity.ProductUnit;
import com.shinowit.entity.ProductUnitCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductUnitMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_unit
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    int countByExample(ProductUnitCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_unit
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    int deleteByExample(ProductUnitCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_unit
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    int deleteByPrimaryKey(Byte unitId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_unit
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    int insert(ProductUnit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_unit
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    int insertSelective(ProductUnit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_unit
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    List<ProductUnit> selectByExample(ProductUnitCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_unit
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    ProductUnit selectByPrimaryKey(Byte unitId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_unit
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    int updateByExampleSelective(@Param("record") ProductUnit record, @Param("example") ProductUnitCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_unit
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    int updateByExample(@Param("record") ProductUnit record, @Param("example") ProductUnitCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_unit
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    int updateByPrimaryKeySelective(ProductUnit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_unit
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    int updateByPrimaryKey(ProductUnit record);

    List<ProductUnit> selectPage(ProductUnitCriteria example);

    Byte selectMaxPrimaryKeyValue();
}