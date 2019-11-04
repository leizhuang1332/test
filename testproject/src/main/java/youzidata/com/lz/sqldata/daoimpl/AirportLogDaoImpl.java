package youzidata.com.lz.sqldata.daoimpl;

import org.springframework.stereotype.Repository;
import youzidata.com.lz.sqldata.dao.AirportLogDao;
import youzidata.com.lz.sqldata.entity.AirportLog;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AirportLogDaoImpl extends BaseDaoImpl<AirportLog> implements AirportLogDao {
    @Override
    public List<AirportLog> selectList(String beginTime, String endTime) {
        return null;
    }
}