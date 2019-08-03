package com.fh.shop.category.po;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

@Data
@TableName("t_category")
public class Category {

    /*代表 id自增*/
    @TableId(type=IdType.AUTO)
    private Integer id;

    private String categoryName;

    private Integer parentId;
}
