 package com.yupi.springbootinit.model.vo;

 import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
 import com.yupi.springbootinit.model.entity.Picture;
 import lombok.Data;

 import java.io.Serializable;
 import java.util.List;

/**
 * 聚合搜索
 *
 * @author <a href="https://github.com/20">忽逢雪</a>
 *  
 */
@Data
public class SearchVO implements Serializable {

    private List<UserVO> userList;

    private List<PostVO> postList;

    private List<Picture> pictureList;

    private List<?> dataList;

    private static final long serialVersionUID = 1L;
}
