package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 员工
 *
 * @author 
 * @email
 */
@TableName("yuangong")
public class YuangongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YuangongEntity() {

	}

	public YuangongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @ColumnInfo(comment="账户",type="varchar(200)")
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @ColumnInfo(comment="密码",type="varchar(200)")
    @TableField(value = "password")

    private String password;


    /**
     * 员工名称
     */
    @ColumnInfo(comment="员工名称",type="varchar(200)")
    @TableField(value = "yuangong_name")

    private String yuangongName;


    /**
     * 联系方式
     */
    @ColumnInfo(comment="联系方式",type="varchar(200)")
    @TableField(value = "yuangong_phone")

    private String yuangongPhone;


    /**
     * 邮箱
     */
    @ColumnInfo(comment="邮箱",type="varchar(200)")
    @TableField(value = "yuangong_email")

    private String yuangongEmail;


    /**
     * 性别
     */
    @ColumnInfo(comment="性别",type="int(11)")
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 员工图片
     */
    @ColumnInfo(comment="员工图片",type="varchar(200)")
    @TableField(value = "yuangong_photo")

    private String yuangongPhoto;


    /**
     * 员工部门
     */
    @ColumnInfo(comment="员工部门",type="int(11)")
    @TableField(value = "yuangong_types")

    private Integer yuangongTypes;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "yuangong_delete")

    private Integer yuangongDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 设置：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 设置：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：员工名称
	 */
    public String getYuangongName() {
        return yuangongName;
    }
    /**
	 * 设置：员工名称
	 */

    public void setYuangongName(String yuangongName) {
        this.yuangongName = yuangongName;
    }
    /**
	 * 获取：联系方式
	 */
    public String getYuangongPhone() {
        return yuangongPhone;
    }
    /**
	 * 设置：联系方式
	 */

    public void setYuangongPhone(String yuangongPhone) {
        this.yuangongPhone = yuangongPhone;
    }
    /**
	 * 获取：邮箱
	 */
    public String getYuangongEmail() {
        return yuangongEmail;
    }
    /**
	 * 设置：邮箱
	 */

    public void setYuangongEmail(String yuangongEmail) {
        this.yuangongEmail = yuangongEmail;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 设置：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：员工图片
	 */
    public String getYuangongPhoto() {
        return yuangongPhoto;
    }
    /**
	 * 设置：员工图片
	 */

    public void setYuangongPhoto(String yuangongPhoto) {
        this.yuangongPhoto = yuangongPhoto;
    }
    /**
	 * 获取：员工部门
	 */
    public Integer getYuangongTypes() {
        return yuangongTypes;
    }
    /**
	 * 设置：员工部门
	 */

    public void setYuangongTypes(Integer yuangongTypes) {
        this.yuangongTypes = yuangongTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getYuangongDelete() {
        return yuangongDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setYuangongDelete(Integer yuangongDelete) {
        this.yuangongDelete = yuangongDelete;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yuangong{" +
            ", id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", yuangongName=" + yuangongName +
            ", yuangongPhone=" + yuangongPhone +
            ", yuangongEmail=" + yuangongEmail +
            ", sexTypes=" + sexTypes +
            ", yuangongPhoto=" + yuangongPhoto +
            ", yuangongTypes=" + yuangongTypes +
            ", yuangongDelete=" + yuangongDelete +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
