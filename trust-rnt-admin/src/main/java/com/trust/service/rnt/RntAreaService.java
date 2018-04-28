package com.trust.service.rnt;


import com.trust.entity.rnt.RntArea;

import java.util.List;
import java.util.Map;

public interface RntAreaService {

    Map<String,List<RntArea>> queryAreaByCount(int id, int count);
}
