/**
 * https://www.zhzhao.top
 */
package top.zhzhao.sbm.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import top.zhzhao.sbm.model.entity.base.SuperEntity;

/**
 * User实体
 *@author zhzhao
 *@version $ Id: User.java,V 0.1 2018/1/16 14:48 zhzhao Exp $
 */
@SuppressWarnings("serial")
public class User extends SuperEntity<User> {

    /** 姓名 */
    private String name;
    /** 密码 */
    @JsonIgnore
    private String password;
    /** 年龄 */
    private String age;
    /** 性别 */
    private String gender;
    /** 状态 0:正常 1:失效*/
    @JsonIgnore
    private String state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
