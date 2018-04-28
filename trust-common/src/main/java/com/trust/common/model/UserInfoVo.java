package com.trust.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

import java.io.Serializable;

/**
 * @author: Bob Zhu
 * @date: 2018/1/10
 */
@Data
@NoArgsConstructor
@Log4j
public class UserInfoVo implements Serializable {
    private static final long serialVersionUID = -4916228492093242797L;
    @JsonProperty("loginName")
    private String loginName = null;
    @JsonProperty("nickName")
    private String nickName = null;
    @JsonProperty("mobile")
    private String mobile = null;
    @JsonProperty("memberId")
    private String memberId = null;
    @JsonProperty("sex")
    private Integer sex = null;
}
