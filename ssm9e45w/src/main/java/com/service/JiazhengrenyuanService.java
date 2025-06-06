package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiazhengrenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiazhengrenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiazhengrenyuanView;


/**
 * 家政人员
 *
 * @author 
 * @email 
 * @date 2021-05-14 16:42:59
 */
public interface JiazhengrenyuanService extends IService<JiazhengrenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiazhengrenyuanVO> selectListVO(Wrapper<JiazhengrenyuanEntity> wrapper);
   	
   	JiazhengrenyuanVO selectVO(@Param("ew") Wrapper<JiazhengrenyuanEntity> wrapper);
   	
   	List<JiazhengrenyuanView> selectListView(Wrapper<JiazhengrenyuanEntity> wrapper);
   	
   	JiazhengrenyuanView selectView(@Param("ew") Wrapper<JiazhengrenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiazhengrenyuanEntity> wrapper);
   	
}

