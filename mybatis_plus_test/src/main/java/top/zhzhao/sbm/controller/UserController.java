package top.zhzhao.sbm.controller;

import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zhzhao.sbm.model.entity.User;
import top.zhzhao.sbm.service.UserService;
import top.zhzhao.sbm.utils.response.ResponseVO;
import top.zhzhao.sbm.utils.response.ResponseVOUtils;

import java.util.HashMap;
import java.util.List;

@RestController(value = "/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/index")
    public List<User>  findAll(){
        return userService.findAll();
    }


    @GetMapping(value = "/mp")
    public ResponseVO mp(){
        User user = userService.selectById(1);
        return ResponseVOUtils.generateSuccess(user);
    }

    @GetMapping(value = "/myPage")
    public ResponseVO mp11(){
        Page<User> page = new Page<>(1, 10, "name", false);
        EntityWrapper<User> wrapper = new EntityWrapper<>();
//        wrapper.eq("name","小丽");
        Page<User> myPage = userService.findMyPage(page,wrapper);
        return ResponseVOUtils.generateSuccess(myPage);
    }

    @GetMapping("/getAll")
    public ResponseVO getAll(){
        EntityWrapper<User> wrapper = new EntityWrapper<>();
        wrapper.eq("name","小丽");
        return ResponseVOUtils.generateSuccess(userService.selectList(wrapper));
    }

    @GetMapping(value = "getPage")
    public ResponseVO getPage(){
        Page<User> p = new Page<>(1, 20);
        EntityWrapper<User> wrapper = new EntityWrapper<>();
        wrapper.eq("name","小丽");
        Page<User> page = userService.selectPage(p,wrapper);
        return ResponseVOUtils.generateSuccess(page);
    }


    @GetMapping("/add")
    public ResponseVO add(){
        User user = new User();
        user.setAge("20");
        user.setName("王王");
        user.setGender("男");
        boolean insert = userService.insert(user);
        if (insert){
            return ResponseVOUtils.generateSuccess(true);
        }else {
            return ResponseVOUtils.generateCommonError("创建用户失败");
        }
    }
}
