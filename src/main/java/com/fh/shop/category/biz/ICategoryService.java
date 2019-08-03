package com.fh.shop.category.biz;

import com.fh.shop.category.common.ServerResponse;

public interface ICategoryService {
    ServerResponse findChildCategoryList(Integer id);
}
