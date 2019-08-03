package com.fh.shop.category.controller;

import com.fh.shop.category.biz.ICategoryService;
import com.fh.shop.category.common.ServerResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/categorys")
public class CategoryController {

    @Resource(name="categoryService")
    private ICategoryService categoryService;

   @GetMapping("/{id}")
    public ServerResponse findChildCategoryList(@PathVariable Integer id){
        return categoryService.findChildCategoryList(id);
    }

}
