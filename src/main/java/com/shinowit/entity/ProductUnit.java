package com.shinowit.entity;

import java.io.Serializable;

public class ProductUnit implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_unit.unit_id
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    private Byte unitId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_unit.name
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_unit.status
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_unit.memo
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    private String memo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_unit
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_unit.unit_id
     *
     * @return the value of product_unit.unit_id
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public Byte getUnitId() {
        return unitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_unit.unit_id
     *
     * @param unitId the value for product_unit.unit_id
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public void setUnitId(Byte unitId) {
        this.unitId = unitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_unit.name
     *
     * @return the value of product_unit.name
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_unit.name
     *
     * @param name the value for product_unit.name
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_unit.status
     *
     * @return the value of product_unit.status
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_unit.status
     *
     * @param status the value for product_unit.status
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_unit.memo
     *
     * @return the value of product_unit.memo
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_unit.memo
     *
     * @param memo the value for product_unit.memo
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_unit
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
        ProductUnit other = (ProductUnit) that;
        return (this.getUnitId() == null ? other.getUnitId() == null : this.getUnitId().equals(other.getUnitId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_unit
     *
     * @mbggenerated Mon Jan 05 09:09:12 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUnitId() == null) ? 0 : getUnitId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        return result;
    }
}