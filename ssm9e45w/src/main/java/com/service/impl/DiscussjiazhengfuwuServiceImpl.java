package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussjiazhengfuwuDao;
import com.entity.DiscussjiazhengfuwuEntity;
import com.service.DiscussjiazhengfuwuService;
import com.entity.vo.DiscussjiazhengfuwuVO;
import com.entity.view.DiscussjiazhengfuwuView;

@Service("discussjiazhengfuwuService")
public class DiscussjiazhengfuwuServiceImpl extends ServiceImpl<DiscussjiazhengfuwuDao, DiscussjiazhengfuwuEntity> implements DiscussjiazhengfuwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiazhengfuwuEntity> page = this.selectPage(
                new Query<DiscussjiazhengfuwuEntity>(params).getPage(),
                new EntityWrapper<DiscussjiazhengfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiazhengfuwuEntity> wrapper) {
		  Page<DiscussjiazhengfuwuView> page =new Query<DiscussjiazhengfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiazhengfuwuVO> selectListVO(Wrapper<DiscussjiazhengfuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiazhengfuwuVO selectVO(Wrapper<DiscussjiazhengfuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiazhengfuwuView> selectListView(Wrapper<DiscussjiazhengfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiazhengfuwuView selectView(Wrapper<DiscussjiazhengfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
