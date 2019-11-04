package youzidata.com.lz.sqldata.daoimpl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import youzidata.com.lz.sqldata.dao.BaseDao;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public abstract class BaseDaoImpl<T> implements BaseDao<T> {
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;
 
    //增
    @Override
    public int save(String mapper, Map<String, Object> parameter) throws Exception {
        return sqlSessionTemplate.insert(mapper,parameter);
    }
 
    //改
    @Override
    public int update(String mapper, Map<String, Object> parameter) throws Exception {
        return sqlSessionTemplate.update(mapper,parameter);
    }
 
    //删
    @Override
    public int delete(String mapper, Map<String, Object> parameter) throws Exception {
        return sqlSessionTemplate.delete(mapper,parameter);
    }
 
    //查
    @Override
    public T find(String mapper, Map<String, Object> parameter) throws Exception {
        return sqlSessionTemplate.selectOne(mapper,parameter);
    }
 
    @Override
    public List<T> findList(String mapper, Map<String, Object> parameter) throws Exception {
        return sqlSessionTemplate.selectList(mapper,parameter);
    }
 
}