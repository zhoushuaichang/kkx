package com.shinowit.dao.mapper;

import com.shinowit.entity.WebUser;
import com.shinowit.entity.WebUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_user
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    int countByExample(WebUserCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_user
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    int deleteByExample(WebUserCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_user
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    int deleteByPrimaryKey(String userName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_user
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    int insert(WebUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_user
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    int insertSelective(WebUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_user
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    List<WebUser> selectByExample(WebUserCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_user
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    WebUser selectByPrimaryKey(String userName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_user
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    int updateByExampleSelective(@Param("record") WebUser record, @Param("example") WebUserCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_user
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    int updateByExample(@Param("record") WebUser record, @Param("example") WebUserCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_user
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    int updateByPrimaryKeySelective(WebUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_user
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    int updateByPrimaryKey(WebUser record);

    List<WebUser> selectPage(WebUserCriteria example);

    String selectMaxPrimaryKeyValue();
}