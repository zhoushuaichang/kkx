package com.shinowit.dao.mapper;

import com.shinowit.entity.OrderInfo;
import com.shinowit.entity.OrderInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    int countByExample(OrderInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    int deleteByExample(OrderInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    int deleteByPrimaryKey(String billCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    int insert(OrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    int insertSelective(OrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    List<OrderInfo> selectByExample(OrderInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    OrderInfo selectByPrimaryKey(String billCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    int updateByExampleSelective(@Param("record") OrderInfo record, @Param("example") OrderInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    int updateByExample(@Param("record") OrderInfo record, @Param("example") OrderInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    int updateByPrimaryKeySelective(OrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    int updateByPrimaryKey(OrderInfo record);

    List<OrderInfo> selectPage(OrderInfoCriteria example);

    String selectMaxPrimaryKeyValue();
}