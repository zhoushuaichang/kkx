package com.shinowit.dao.mapper;

import com.shinowit.entity.MemberAddress;
import com.shinowit.entity.MemberAddressCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_address
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    int countByExample(MemberAddressCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_address
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    int deleteByExample(MemberAddressCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_address
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_address
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    int insert(MemberAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_address
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    int insertSelective(MemberAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_address
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    List<MemberAddress> selectByExample(MemberAddressCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_address
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    MemberAddress selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_address
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    int updateByExampleSelective(@Param("record") MemberAddress record, @Param("example") MemberAddressCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_address
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    int updateByExample(@Param("record") MemberAddress record, @Param("example") MemberAddressCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_address
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    int updateByPrimaryKeySelective(MemberAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_address
     *
     * @mbggenerated Tue Dec 30 15:50:09 CST 2014
     */
    int updateByPrimaryKey(MemberAddress record);

    List<MemberAddress> selectPage(MemberAddressCriteria example);

    Integer selectMaxPrimaryKeyValue();
}