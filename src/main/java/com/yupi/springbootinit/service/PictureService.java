package com.yupi.springbootinit.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yupi.springbootinit.model.entity.Picture;

/**
 * 帖子服务
 *
 * @author <a href=" https://github.com/seems20">忽逢雪</a>
 *  
 */
public interface PictureService {
    Page<Picture> searchPicture(String searchText, long pageNum, long pageSize);
}
