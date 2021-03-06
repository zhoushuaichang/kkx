package com.shinowit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WebUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_user.user_name
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_user.id
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_user.user_pass
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    private String userPass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_user.email
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_user.real_name
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    private String realName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_user.balance
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    private BigDecimal balance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_user.status
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_user.reg_date
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    private Date regDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_user.active_date
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    private Date activeDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_user.remark
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table web_user
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_user.user_name
     *
     * @return the value of web_user.user_name
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_user.user_name
     *
     * @param userName the value for web_user.user_name
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_user.id
     *
     * @return the value of web_user.id
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_user.id
     *
     * @param id the value for web_user.id
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_user.user_pass
     *
     * @return the value of web_user.user_pass
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_user.user_pass
     *
     * @param userPass the value for web_user.user_pass
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_user.email
     *
     * @return the value of web_user.email
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_user.email
     *
     * @param email the value for web_user.email
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_user.real_name
     *
     * @return the value of web_user.real_name
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_user.real_name
     *
     * @param realName the value for web_user.real_name
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_user.balance
     *
     * @return the value of web_user.balance
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_user.balance
     *
     * @param balance the value for web_user.balance
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_user.status
     *
     * @return the value of web_user.status
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_user.status
     *
     * @param status the value for web_user.status
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_user.reg_date
     *
     * @return the value of web_user.reg_date
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public Date getRegDate() {
        return regDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_user.reg_date
     *
     * @param regDate the value for web_user.reg_date
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_user.active_date
     *
     * @return the value of web_user.active_date
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public Date getActiveDate() {
        return activeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_user.active_date
     *
     * @param activeDate the value for web_user.active_date
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public void setActiveDate(Date activeDate) {
        this.activeDate = activeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_user.remark
     *
     * @return the value of web_user.remark
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_user.remark
     *
     * @param remark the value for web_user.remark
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_user
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        WebUser other = (WebUser) that;
        return (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserPass() == null ? other.getUserPass() == null : this.getUserPass().equals(other.getUserPass()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRegDate() == null ? other.getRegDate() == null : this.getRegDate().equals(other.getRegDate()))
            && (this.getActiveDate() == null ? other.getActiveDate() == null : this.getActiveDate().equals(other.getActiveDate()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_user
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserPass() == null) ? 0 : getUserPass().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRegDate() == null) ? 0 : getRegDate().hashCode());
        result = prime * result + ((getActiveDate() == null) ? 0 : getActiveDate().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}