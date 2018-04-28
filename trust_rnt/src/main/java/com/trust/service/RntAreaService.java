package com.trust.service;


import com.trust.entity.RntArea;

import java.util.List;
import java.util.Map;

public interface RntAreaService {
    Map<String,List<RntArea>> queryAreaByCount(int id, int count);
}
