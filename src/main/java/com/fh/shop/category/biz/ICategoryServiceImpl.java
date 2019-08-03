package com.fh.shop.category.biz;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.fh.shop.category.common.ServerResponse;
import com.fh.shop.category.mapper.ICategoryMapper;
import com.fh.shop.category.po.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("categoryService")
public class ICategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryMapper categoryMapper;

    @Override
    public ServerResponse findChildCategoryList(Integer id) {
        EntityWrapper<Category> entityWrapper = new EntityWrapper<Category>();
        entityWrapper.eq("parentId",id);
        List<Category> categories = categoryMapper.selectList(entityWrapper);
        return ServerResponse.success(categories);
    }
}
