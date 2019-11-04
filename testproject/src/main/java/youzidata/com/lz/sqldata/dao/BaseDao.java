package youzidata.com.lz.sqldata.dao;

import java.util.List;
import java.util.Map;

public interface BaseDao<T> {
 
    //增
    public  int save(String mapper, Map<String ,Object> parameter)throws Exception;
 
    //改
    public int update(String mapper,Map<String ,Object> parameter)throws Exception;
 
    //删
    public int delete(String mapper,Map<String ,Object> parameter)throws Exception;
 
    //查
    public T find(String mapper,Map<String ,Object> parameter)throws Exception;
    public List<T> findList(String mapper, Map<String ,Object> parameter)throws Exception;
 
}