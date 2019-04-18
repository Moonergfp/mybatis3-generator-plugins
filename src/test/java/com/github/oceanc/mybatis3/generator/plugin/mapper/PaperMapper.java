package com.github.oceanc.mybatis3.generator.plugin.mapper;

import com.github.oceanc.mybatis3.generator.plugin.model.Paper;
import com.github.oceanc.mybatis3.generator.plugin.model.PaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

public interface PaperMapper {


    @Select("select * from paper")
    List<Paper> tttt();

    int countByExample(PaperExample example);

    int deleteByExample(PaperExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Paper record);

    int insertSelective(Paper record);

    List<Paper> selectByExampleWithRowbounds(PaperExample example, RowBounds rowBounds);

    List<Paper> selectByExample(PaperExample example);

    Paper selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Paper record, @Param("example") PaperExample example);

    int updateByExample(@Param("record") Paper record, @Param("example") PaperExample example);

    int updateByPrimaryKeySelective(Paper record);

    int updateByPrimaryKey(Paper record);

    Long sumByExample(PaperExample example);

    void batchInsert(@Param("items") List<Paper> items);
}