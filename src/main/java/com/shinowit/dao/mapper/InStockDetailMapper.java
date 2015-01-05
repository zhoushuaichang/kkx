package com.shinowit.dao.mapper;

import com.shinowit.entity.InStockDetail;
import com.shinowit.entity.InStockDetailCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InStockDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_stock_detail
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int countByExample(InStockDetailCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_stock_detail
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int deleteByExample(InStockDetailCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_stock_detail
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int deleteByPrimaryKey(Integer inStockDetailId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_stock_detail
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int insert(InStockDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_stock_detail
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int insertSelective(InStockDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_stock_detail
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    List<InStockDetail> selectByExample(InStockDetailCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_stock_detail
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    InStockDetail selectByPrimaryKey(Integer inStockDetailId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_stock_detail
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int updateByExampleSelective(@Param("record") InStockDetail record, @Param("example") InStockDetailCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_stock_detail
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int updateByExample(@Param("record") InStockDetail record, @Param("example") InStockDetailCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_stock_detail
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int updateByPrimaryKeySelective(InStockDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_stock_detail
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int updateByPrimaryKey(InStockDetail record);

    List<InStockDetail> selectPage(InStockDetailCriteria example);

    Integer selectMaxPrimaryKeyValue();
}