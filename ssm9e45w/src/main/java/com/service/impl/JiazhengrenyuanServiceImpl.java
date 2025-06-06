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


import com.dao.JiazhengrenyuanDao;
import com.entity.JiazhengrenyuanEntity;
import com.service.JiazhengrenyuanService;
import com.entity.vo.JiazhengrenyuanVO;
import com.entity.view.JiazhengrenyuanView;

@Service("jiazhengrenyuanService")
public class JiazhengrenyuanServiceImpl extends ServiceImpl<JiazhengrenyuanDao, JiazhengrenyuanEntity> implements JiazhengrenyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiazhengrenyuanEntity> page = this.selectPage(
                new Query<JiazhengrenyuanEntity>(params).getPage(),
                new EntityWrapper<JiazhengrenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiazhengrenyuanEntity> wrapper) {
		  Page<JiazhengrenyuanView> page =new Query<JiazhengrenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiazhengrenyuanVO> selectListVO(Wrapper<JiazhengrenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiazhengrenyuanVO selectVO(Wrapper<JiazhengrenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiazhengrenyuanView> selectListView(Wrapper<JiazhengrenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiazhengrenyuanView selectView(Wrapper<JiazhengrenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
