package com.trust.service.impl;

import com.trust.dao.RntAreaMapper;
import com.trust.entity.RntArea;
import com.trust.entity.RntAreaExample;
import com.trust.service.RntAreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 唐亮
 * @create 2018-01-02 22:41
 * @desc 行政区域四级联动数据展示
 **/
@Service("rntAreaService")
public class RntAreaServiceImpl implements RntAreaService{

    //用于不同等级数据封装到map中的标识
    private String[] names = new String[]{"town","county","city","province"};
    
    @Resource
    private RntAreaMapper rntAreaMapper;

    /**
     * @Descrintion: 按父类id查询所有子类（行政区域）
     * @param: id为本类id ，count为查询等级（范围1-4）
     * @return: 根据map的key获取其中的各个子区域集合
     */
    @Override
    public Map<String, List<RntArea>> queryAreaByCount(int id, int count) {
        HashMap<String, List<RntArea>> defaultRntAreas = new HashMap<>();
        Integer parentId = id;
        Integer nameIndex = count;
        //按照count的值确定查询次数（避免表链接查询）
        for (int i = 0; i < count; i++) {
            RntAreaExample rntAreaExample = new RntAreaExample();
            RntAreaExample.Criteria criteria = rntAreaExample.createCriteria();
            criteria.andParentidEqualTo(parentId);
            List<RntArea> areas = rntAreaMapper.selectByExample(rntAreaExample);
            defaultRntAreas.put(names[nameIndex-1],areas);
            nameIndex--;
            if( (i+1)<count && areas.size()>0){
                //默认查询本次结果的第一条数据下面的所有子数据
                System.out.println(areas.size());
                parentId = areas.get(0).getId();
            }
        }
        return defaultRntAreas;
    }

}
