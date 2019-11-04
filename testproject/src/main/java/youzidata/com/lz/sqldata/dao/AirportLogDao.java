package youzidata.com.lz.sqldata.dao;

import org.apache.ibatis.annotations.Param;
import youzidata.com.lz.sqldata.entity.AirportLog;

import java.util.List;

public interface AirportLogDao extends BaseDao<AirportLog> {

	List<AirportLog> selectList(@Param("beginTime") String beginTime, @Param("endTime") String endTime);

}
