package com.shinowit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OutStock implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.out_stock_id
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private Integer outStockId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.user_id
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.out_time
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private Date outTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.handler_name
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private String handlerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.out_type
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private Byte outType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.total_money
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private BigDecimal totalMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.remark
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table out_stock
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.out_stock_id
     *
     * @return the value of out_stock.out_stock_id
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public Integer getOutStockId() {
        return outStockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.out_stock_id
     *
     * @param outStockId the value for out_stock.out_stock_id
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setOutStockId(Integer outStockId) {
        this.outStockId = outStockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.user_id
     *
     * @return the value of out_stock.user_id
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.user_id
     *
     * @param userId the value for out_stock.user_id
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.out_time
     *
     * @return the value of out_stock.out_time
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public Date getOutTime() {
        return outTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.out_time
     *
     * @param outTime the value for out_stock.out_time
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.handler_name
     *
     * @return the value of out_stock.handler_name
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public String getHandlerName() {
        return handlerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.handler_name
     *
     * @param handlerName the value for out_stock.handler_name
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName == null ? null : handlerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.out_type
     *
     * @return the value of out_stock.out_type
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public Byte getOutType() {
        return outType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.out_type
     *
     * @param outType the value for out_stock.out_type
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setOutType(Byte outType) {
        this.outType = outType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.total_money
     *
     * @return the value of out_stock.total_money
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.total_money
     *
     * @param totalMoney the value for out_stock.total_money
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.remark
     *
     * @return the value of out_stock.remark
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.remark
     *
     * @param remark the value for out_stock.remark
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_stock
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
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
        OutStock other = (OutStock) that;
        return (this.getOutStockId() == null ? other.getOutStockId() == null : this.getOutStockId().equals(other.getOutStockId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOutTime() == null ? other.getOutTime() == null : this.getOutTime().equals(other.getOutTime()))
            && (this.getHandlerName() == null ? other.getHandlerName() == null : this.getHandlerName().equals(other.getHandlerName()))
            && (this.getOutType() == null ? other.getOutType() == null : this.getOutType().equals(other.getOutType()))
            && (this.getTotalMoney() == null ? other.getTotalMoney() == null : this.getTotalMoney().equals(other.getTotalMoney()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_stock
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOutStockId() == null) ? 0 : getOutStockId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOutTime() == null) ? 0 : getOutTime().hashCode());
        result = prime * result + ((getHandlerName() == null) ? 0 : getHandlerName().hashCode());
        result = prime * result + ((getOutType() == null) ? 0 : getOutType().hashCode());
        result = prime * result + ((getTotalMoney() == null) ? 0 : getTotalMoney().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}