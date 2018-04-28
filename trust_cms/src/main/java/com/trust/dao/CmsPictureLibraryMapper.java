package com.trust.dao;

import com.trust.entity.cms.CmsPictureLibrary;
import com.trust.entity.cms.CmsPictureLibraryExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CmsPictureLibraryMapper {
    int countByExample(CmsPictureLibraryExample example);

    int deleteByExample(CmsPictureLibraryExample example);

    int deleteByPrimaryKey(Long cPictureId);

    int insert(CmsPictureLibrary record);

    int insertSelective(CmsPictureLibrary record);

    List<CmsPictureLibrary> selectByExample(CmsPictureLibraryExample example);

    CmsPictureLibrary selectByPrimaryKey(Long cPictureId);

    int updateByExampleSelective(@Param("record") CmsPictureLibrary record, @Param("example") CmsPictureLibraryExample example);

    int updateByExample(@Param("record") CmsPictureLibrary record, @Param("example") CmsPictureLibraryExample example);

    int updateByPrimaryKeySelective(CmsPictureLibrary record);

    int updateByPrimaryKey(CmsPictureLibrary record);
}