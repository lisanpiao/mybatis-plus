package top.zhzhao.sbm.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.baomidou.mybatisplus.service.IService;
import top.zhzhao.sbm.model.entity.User;

import java.util.List;

public interface UserService extends IService<User> {
    List<User> findAll();
    Page<User> findMyPage(Page<User> page,Wrapper<User> wrapper);
}
