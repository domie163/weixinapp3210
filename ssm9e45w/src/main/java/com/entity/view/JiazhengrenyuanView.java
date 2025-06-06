package com.entity.view;

import com.entity.JiazhengrenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家政人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-14 16:42:59
 */
@TableName("jiazhengrenyuan")
public class JiazhengrenyuanView  extends JiazhengrenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiazhengrenyuanView(){
	}
 
 	public JiazhengrenyuanView(JiazhengrenyuanEntity jiazhengrenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, jiazhengrenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
