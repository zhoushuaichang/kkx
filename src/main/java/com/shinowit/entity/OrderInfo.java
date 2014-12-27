package com.shinowit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.bill_code
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private String billCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.id
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.delivery_code
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private String deliveryCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.user_id
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.out_stock_id
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private Integer outStockId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.user_name
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.post_bill_code
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private String postBillCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.bill_status
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private Byte billStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.order_time
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private Date orderTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.recv_name
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private String recvName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.link_tel
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private String linkTel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.recv_address
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private String recvAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.post_code
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private String postCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.total_money
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private BigDecimal totalMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.remark
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_info
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.bill_code
     *
     * @return the value of order_info.bill_code
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public String getBillCode() {
        return billCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.bill_code
     *
     * @param billCode the value for order_info.bill_code
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.id
     *
     * @return the value of order_info.id
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.id
     *
     * @param id the value for order_info.id
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.delivery_code
     *
     * @return the value of order_info.delivery_code
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public String getDeliveryCode() {
        return deliveryCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.delivery_code
     *
     * @param deliveryCode the value for order_info.delivery_code
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setDeliveryCode(String deliveryCode) {
        this.deliveryCode = deliveryCode == null ? null : deliveryCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.user_id
     *
     * @return the value of order_info.user_id
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.user_id
     *
     * @param userId the value for order_info.user_id
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.out_stock_id
     *
     * @return the value of order_info.out_stock_id
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public Integer getOutStockId() {
        return outStockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.out_stock_id
     *
     * @param outStockId the value for order_info.out_stock_id
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setOutStockId(Integer outStockId) {
        this.outStockId = outStockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.user_name
     *
     * @return the value of order_info.user_name
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.user_name
     *
     * @param userName the value for order_info.user_name
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.post_bill_code
     *
     * @return the value of order_info.post_bill_code
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public String getPostBillCode() {
        return postBillCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.post_bill_code
     *
     * @param postBillCode the value for order_info.post_bill_code
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setPostBillCode(String postBillCode) {
        this.postBillCode = postBillCode == null ? null : postBillCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.bill_status
     *
     * @return the value of order_info.bill_status
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public Byte getBillStatus() {
        return billStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.bill_status
     *
     * @param billStatus the value for order_info.bill_status
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setBillStatus(Byte billStatus) {
        this.billStatus = billStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.order_time
     *
     * @return the value of order_info.order_time
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.order_time
     *
     * @param orderTime the value for order_info.order_time
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.recv_name
     *
     * @return the value of order_info.recv_name
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public String getRecvName() {
        return recvName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.recv_name
     *
     * @param recvName the value for order_info.recv_name
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setRecvName(String recvName) {
        this.recvName = recvName == null ? null : recvName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.link_tel
     *
     * @return the value of order_info.link_tel
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public String getLinkTel() {
        return linkTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.link_tel
     *
     * @param linkTel the value for order_info.link_tel
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setLinkTel(String linkTel) {
        this.linkTel = linkTel == null ? null : linkTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.recv_address
     *
     * @return the value of order_info.recv_address
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public String getRecvAddress() {
        return recvAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.recv_address
     *
     * @param recvAddress the value for order_info.recv_address
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setRecvAddress(String recvAddress) {
        this.recvAddress = recvAddress == null ? null : recvAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.post_code
     *
     * @return the value of order_info.post_code
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.post_code
     *
     * @param postCode the value for order_info.post_code
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.total_money
     *
     * @return the value of order_info.total_money
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.total_money
     *
     * @param totalMoney the value for order_info.total_money
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.remark
     *
     * @return the value of order_info.remark
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.remark
     *
     * @param remark the value for order_info.remark
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
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
        OrderInfo other = (OrderInfo) that;
        return (this.getBillCode() == null ? other.getBillCode() == null : this.getBillCode().equals(other.getBillCode()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDeliveryCode() == null ? other.getDeliveryCode() == null : this.getDeliveryCode().equals(other.getDeliveryCode()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOutStockId() == null ? other.getOutStockId() == null : this.getOutStockId().equals(other.getOutStockId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getPostBillCode() == null ? other.getPostBillCode() == null : this.getPostBillCode().equals(other.getPostBillCode()))
            && (this.getBillStatus() == null ? other.getBillStatus() == null : this.getBillStatus().equals(other.getBillStatus()))
            && (this.getOrderTime() == null ? other.getOrderTime() == null : this.getOrderTime().equals(other.getOrderTime()))
            && (this.getRecvName() == null ? other.getRecvName() == null : this.getRecvName().equals(other.getRecvName()))
            && (this.getLinkTel() == null ? other.getLinkTel() == null : this.getLinkTel().equals(other.getLinkTel()))
            && (this.getRecvAddress() == null ? other.getRecvAddress() == null : this.getRecvAddress().equals(other.getRecvAddress()))
            && (this.getPostCode() == null ? other.getPostCode() == null : this.getPostCode().equals(other.getPostCode()))
            && (this.getTotalMoney() == null ? other.getTotalMoney() == null : this.getTotalMoney().equals(other.getTotalMoney()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbggenerated Wed Dec 24 16:31:19 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBillCode() == null) ? 0 : getBillCode().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDeliveryCode() == null) ? 0 : getDeliveryCode().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOutStockId() == null) ? 0 : getOutStockId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getPostBillCode() == null) ? 0 : getPostBillCode().hashCode());
        result = prime * result + ((getBillStatus() == null) ? 0 : getBillStatus().hashCode());
        result = prime * result + ((getOrderTime() == null) ? 0 : getOrderTime().hashCode());
        result = prime * result + ((getRecvName() == null) ? 0 : getRecvName().hashCode());
        result = prime * result + ((getLinkTel() == null) ? 0 : getLinkTel().hashCode());
        result = prime * result + ((getRecvAddress() == null) ? 0 : getRecvAddress().hashCode());
        result = prime * result + ((getPostCode() == null) ? 0 : getPostCode().hashCode());
        result = prime * result + ((getTotalMoney() == null) ? 0 : getTotalMoney().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}