package com.trust.ucenter.service;

import com.trust.ucenter.entity.RealName;

public interface RealNameService {
    int insertRealName(RealName realName);

    RealName selectByUserId(Integer userId);
}
