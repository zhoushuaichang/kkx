package com.shinowit.dao.mapper;

import com.shinowit.entity.SysLog;
import com.shinowit.entity.SysLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    int countByExample(SysLogCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    int deleteByExample(SysLogCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    int deleteByPrimaryKey(Integer logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    int insert(SysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    int insertSelective(SysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    List<SysLog> selectByExample(SysLogCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    SysLog selectByPrimaryKey(Integer logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    int updateByExampleSelective(@Param("record") SysLog record, @Param("example") SysLogCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    int updateByExample(@Param("record") SysLog record, @Param("example") SysLogCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    int updateByPrimaryKeySelective(SysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    int updateByPrimaryKey(SysLog record);

    List<SysLog> selectPage(SysLogCriteria example);

    Integer selectMaxPrimaryKeyValue();
}