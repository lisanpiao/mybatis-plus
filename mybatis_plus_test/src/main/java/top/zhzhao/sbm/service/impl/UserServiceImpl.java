package top.zhzhao.sbm.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.zhzhao.sbm.mapper.UserMapper;
import top.zhzhao.sbm.model.entity.User;
import top.zhzhao.sbm.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public List<User> findAll() {
        return baseMapper.findAll();
    }

    @Override
    public Page<User> findMyPage(Page<User> page,Wrapper<User> wrapper) {
        page.setRecords(baseMapper.findMyPage(page,wrapper));
        return page;
    }
}
