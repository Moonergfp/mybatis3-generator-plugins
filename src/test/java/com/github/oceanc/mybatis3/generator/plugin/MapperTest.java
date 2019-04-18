package com.github.oceanc.mybatis3.generator.plugin;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.github.oceanc.mybatis3.generator.plugin.mapper.PaperMapper;
import com.github.oceanc.mybatis3.generator.plugin.model.Paper;

/**
 * Created by chengyang
 */
public class MapperTest {
    public static void main(String[] args) {
        String resource = "/mybatis_config.xml";

        // 使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = MapperTest.class.getResourceAsStream(resource);
        // 构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);

//        sessionFactory.getConfiguration().addMapper(PaperMapper.class);

        // 使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        // Reader reader = Resources.getResourceAsReader(resource);
        // 构建sqlSession的工厂
        // SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);

        // 创建能执行映射文件中sql的sqlSession
        SqlSession session = sessionFactory.openSession();

        PaperMapper mapper = session.getMapper(PaperMapper.class);

        Paper paper = mapper.selectByPrimaryKey(3L);
        System.out.println("paper===" + paper);

        List<Paper> ps = mapper.tttt();
        System.out.println("papers===" + ps);

//        Paper p1 = new Paper();
//        p1.setName("abc");
//        Paper p2 = new Paper();
//        p2.setName("abc");
//
//        List<Paper> papers = new ArrayList<Paper>();
//        papers.add(p1);
//        papers.add(p2);
//        mapper.batchInsert(papers);

    }
}
