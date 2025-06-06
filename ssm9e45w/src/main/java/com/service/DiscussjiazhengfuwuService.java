package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiazhengfuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiazhengfuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiazhengfuwuView;


/**
 * 家政服务评论表
 *
 * @author 
 * @email 
 * @date 2021-05-14 16:43:00
 */
public interface DiscussjiazhengfuwuService extends IService<DiscussjiazhengfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiazhengfuwuVO> selectListVO(Wrapper<DiscussjiazhengfuwuEntity> wrapper);
   	
   	DiscussjiazhengfuwuVO selectVO(@Param("ew") Wrapper<DiscussjiazhengfuwuEntity> wrapper);
   	
   	List<DiscussjiazhengfuwuView> selectListView(Wrapper<DiscussjiazhengfuwuEntity> wrapper);
   	
   	DiscussjiazhengfuwuView selectView(@Param("ew") Wrapper<DiscussjiazhengfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiazhengfuwuEntity> wrapper);
   	
}

