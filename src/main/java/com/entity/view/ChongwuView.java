package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ChongwuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 宠物信息
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("chongwu")
public class ChongwuView extends ChongwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 宠物类型的值
	*/
	@ColumnInfo(comment="宠物类型的字典表值",type="varchar(200)")
	private String chongwuValue;
	/**
	* 宠物性别的值
	*/
	@ColumnInfo(comment="宠物性别的字典表值",type="varchar(200)")
	private String sexValue;
	/**
	* 领养状态的值
	*/
	@ColumnInfo(comment="领养状态的字典表值",type="varchar(200)")
	private String zhuangtiaValue;




	public ChongwuView() {

	}

	public ChongwuView(ChongwuEntity chongwuEntity) {
		try {
			BeanUtils.copyProperties(this, chongwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 宠物类型的值
	*/
	public String getChongwuValue() {
		return chongwuValue;
	}
	/**
	* 设置： 宠物类型的值
	*/
	public void setChongwuValue(String chongwuValue) {
		this.chongwuValue = chongwuValue;
	}
	//当前表的
	/**
	* 获取： 宠物性别的值
	*/
	public String getSexValue() {
		return sexValue;
	}
	/**
	* 设置： 宠物性别的值
	*/
	public void setSexValue(String sexValue) {
		this.sexValue = sexValue;
	}
	//当前表的
	/**
	* 获取： 领养状态的值
	*/
	public String getZhuangtiaValue() {
		return zhuangtiaValue;
	}
	/**
	* 设置： 领养状态的值
	*/
	public void setZhuangtiaValue(String zhuangtiaValue) {
		this.zhuangtiaValue = zhuangtiaValue;
	}




	@Override
	public String toString() {
		return "ChongwuView{" +
			", chongwuValue=" + chongwuValue +
			", sexValue=" + sexValue +
			", zhuangtiaValue=" + zhuangtiaValue +
			"} " + super.toString();
	}
}
