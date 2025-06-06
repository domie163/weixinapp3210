package com.entity.view;

import com.entity.DiscussjiazhengfuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家政服务评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-14 16:43:00
 */
@TableName("discussjiazhengfuwu")
public class DiscussjiazhengfuwuView  extends DiscussjiazhengfuwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiazhengfuwuView(){
	}
 
 	public DiscussjiazhengfuwuView(DiscussjiazhengfuwuEntity discussjiazhengfuwuEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiazhengfuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
