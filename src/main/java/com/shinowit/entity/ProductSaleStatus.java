package com.shinowit.entity;

import java.io.Serializable;

public class ProductSaleStatus implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_sale_status.status_id
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    private Byte statusId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_sale_status.status_name
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    private String statusName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_sale_status.status
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_sale_status.memo
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    private String memo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_sale_status
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_sale_status.status_id
     *
     * @return the value of product_sale_status.status_id
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    public Byte getStatusId() {
        return statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_sale_status.status_id
     *
     * @param statusId the value for product_sale_status.status_id
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    public void setStatusId(Byte statusId) {
        this.statusId = statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_sale_status.status_name
     *
     * @return the value of product_sale_status.status_name
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_sale_status.status_name
     *
     * @param statusName the value for product_sale_status.status_name
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    public void setStatusName(String statusName) {
        this.statusName = statusName == null ? null : statusName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_sale_status.status
     *
     * @return the value of product_sale_status.status
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_sale_status.status
     *
     * @param status the value for product_sale_status.status
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_sale_status.memo
     *
     * @return the value of product_sale_status.memo
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_sale_status.memo
     *
     * @param memo the value for product_sale_status.memo
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_sale_status
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
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
        ProductSaleStatus other = (ProductSaleStatus) that;
        return (this.getStatusId() == null ? other.getStatusId() == null : this.getStatusId().equals(other.getStatusId()))
            && (this.getStatusName() == null ? other.getStatusName() == null : this.getStatusName().equals(other.getStatusName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_sale_status
     *
     * @mbggenerated Mon Jan 05 08:29:27 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStatusId() == null) ? 0 : getStatusId().hashCode());
        result = prime * result + ((getStatusName() == null) ? 0 : getStatusName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        return result;
    }
}