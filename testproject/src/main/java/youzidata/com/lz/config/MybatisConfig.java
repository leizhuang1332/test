package youzidata.com.lz.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan("youzidata.com.lz.sqldata.dao")
public class MybatisConfig {

}
