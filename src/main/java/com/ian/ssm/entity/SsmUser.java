package com.ian.ssm.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息
 * Created by chenlong on 2017/3/30.
 */
public class SsmUser implements Serializable {

    private static final long serialVersionUID = 2853536621394741096L;

    /**
     * 主键
     */
    public int codId;

    /**
     * 唯一标识
     */
    public String codNo;

    /**
     * 姓名
     */
    private String txtName;

    /**
     * 性别
     */
    private int codSex;

    /**
     * 出生日期
     */
    private Date datBirthday;

    public SsmUser() {

    }

    public int getCodId() {
        return codId;
    }

    public void setCodId(int codId) {
        this.codId = codId;
    }

    public String getCodNo() {
        return codNo;
    }

    public void setCodNo(String codNo) {
        this.codNo = codNo;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public int getCodSex() {
        return codSex;
    }

    public void setCodSex(int codSex) {
        this.codSex = codSex;
    }

    public Date getDatBirthday() {
        return datBirthday;
    }

    public void setDatBirthday(Date datBirthday) {
        this.datBirthday = datBirthday;
    }
}
