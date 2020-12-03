package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class manager {
    //管理员id
    private Integer mId;
    //管理员姓名
    private String mName;
    //管理员密码
    private String mPassword;
    //管理员性别
    private String mSex;
    //管理员身份证
    private String mIdentityCode;
    //管理员注册时间
    private Date mDate;
    //上传的图片
    private String mImageName;
    //最后登录上的时间
    private String mLatelyLogin;
    //登录手机号
    private String mLogin_phone;
    //管理员类别
    private Integer managerId;
    //managerType类
    private managerType managerType;
}
