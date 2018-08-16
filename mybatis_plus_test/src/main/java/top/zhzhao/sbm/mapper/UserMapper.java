/**
 * https://www.zhzhao.top
 */
package top.zhzhao.sbm.mapper;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.zhzhao.sbm.mapper.base.SuperMapper;
import top.zhzhao.sbm.model.entity.User;

import java.util.List;

/**
 *
 *@author zhzhao
 *@version $ Id: UserMapper.java,V 0.1 2018/1/16 15:00 zhzhao Exp $
 */
@Mapper
public interface UserMapper extends SuperMapper<User> {
    List<User> findAll();
    List<User> findMyPage(Pagination page, @Param("ew") Wrapper<User> wrapper);
}
