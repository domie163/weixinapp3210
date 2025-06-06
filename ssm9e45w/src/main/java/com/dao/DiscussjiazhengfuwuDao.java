package com.dao;

import com.entity.DiscussjiazhengfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiazhengfuwuVO;
import com.entity.view.DiscussjiazhengfuwuView;


/**
 * 家政服务评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-14 16:43:00
 */
public interface DiscussjiazhengfuwuDao extends BaseMapper<DiscussjiazhengfuwuEntity> {
	
	List<DiscussjiazhengfuwuVO> selectListVO(@Param("ew") Wrapper<DiscussjiazhengfuwuEntity> wrapper);
	
	DiscussjiazhengfuwuVO selectVO(@Param("ew") Wrapper<DiscussjiazhengfuwuEntity> wrapper);
	
	List<DiscussjiazhengfuwuView> selectListView(@Param("ew") Wrapper<DiscussjiazhengfuwuEntity> wrapper);

	List<DiscussjiazhengfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiazhengfuwuEntity> wrapper);
	
	DiscussjiazhengfuwuView selectView(@Param("ew") Wrapper<DiscussjiazhengfuwuEntity> wrapper);
	
}
