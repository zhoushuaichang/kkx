package com.shinowit.dao.mapper;

import com.shinowit.entity.Chart;
import com.shinowit.entity.ChartCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChartMapper {
    List<Chart> listAll();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int countByExample(ChartCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int deleteByExample(ChartCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int deleteByPrimaryKey(Integer chartId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int insert(Chart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int insertSelective(Chart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    List<Chart> selectByExample(ChartCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    Chart selectByPrimaryKey(Integer chartId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int updateByExampleSelective(@Param("record") Chart record, @Param("example") ChartCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int updateByExample(@Param("record") Chart record, @Param("example") ChartCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int updateByPrimaryKeySelective(Chart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    int updateByPrimaryKey(Chart record);

    List<Chart> selectPage(ChartCriteria example);

    Integer selectMaxPrimaryKeyValue();
}