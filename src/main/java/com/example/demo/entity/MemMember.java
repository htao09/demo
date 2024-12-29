package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 会员
 *
 * @author qinxy
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName(value = "mem_member")
public class MemMember extends IdTimeEntity {

    private String userId;
    public static final String USER_ID = "user_id";


    private String loginId;
    public static final String LOGIN_ID = "login_id";


    private String loginPwd;
    public static final String LOGIN_PWD = "login_pwd";


    private String userName;
    public static final String USER_NAME = "user_name";


    private String nickName;
    public static final String NICK_NAME = "nick_name";


    private String mobile;
    public static final String MOBILE = "mobile";

}
