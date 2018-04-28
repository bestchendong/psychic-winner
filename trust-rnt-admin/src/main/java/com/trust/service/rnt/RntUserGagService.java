package com.trust.service.rnt;

import java.util.List;

public interface RntUserGagService {
    //禁言
    public int gagUser(List<Integer> gagList, Integer userId,String gagReason);

    //禁言项
    public List<Integer> selectByUserId(Integer userId);

    //
}
