package com.shinowit.dao.mapper;

import com.shinowit.entity.Product;
import com.shinowit.entity.ProductCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {

    int countAll();
    List<Product> listAll();
    List<Product> selectByProductType(String typeCode);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int countByExample(ProductCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int deleteByExample(ProductCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int deleteByPrimaryKey(String productCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int insertSelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    List<Product> selectByExample(ProductCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    Product selectByPrimaryKey(String productCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int updateByExample(@Param("record") Product record, @Param("example") ProductCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int updateByPrimaryKey(Product record);

    List<Product> selectPage(ProductCriteria example);

    String selectMaxPrimaryKeyValue();
}