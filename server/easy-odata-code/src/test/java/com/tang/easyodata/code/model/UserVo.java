package com.tang.easyodata.code.model;

import com.tang.easyodata.code.annotation.OdataIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 用户信息实体
 * @Author: tzg
 * @Date: 2019/1/6/006 23:06
 */
@Data
public class UserVo implements Serializable {

    private String userId;
    private String username;
    @OdataIgnore
    private String password;
    @OdataIgnore
    private String passwordSalt;
    private String realname;
    private Integer gender;
    private String mobile;
    private Integer status;
    private String remark;
    private Date createTime;
    private Date updateTime;

}
