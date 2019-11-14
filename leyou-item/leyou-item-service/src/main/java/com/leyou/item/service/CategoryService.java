package com.leyou.item.service;

import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 分类实现类
 */

@Service
public class CategoryService{


    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 根据父节点查询子节点
     * @param pid
     * @return
     */
    public List<Category> queryCategoryByPid(Long pid) {
        Category record = new Category();
        record.setParentId(pid);
       return this.categoryMapper.select(record);

    }
}
