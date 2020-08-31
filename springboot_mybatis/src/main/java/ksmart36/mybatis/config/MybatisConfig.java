package ksmart36.mybatis.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value="ksmart36.mybatis.mapper", sqlSessionFactoryRef = "mybatisSqlSessionFactory")
public class MybatisConfig {

	@Bean(name="mybatisSqlSessionFactory")
	public SqlSessionFactory mybatisSqlSessionFactory(DataSource datasource, 
												ApplicationContext context) throws Exception {
		
		SqlSessionFactoryBean mybatisSqlSessionFactoryBean = 
											new SqlSessionFactoryBean();
		mybatisSqlSessionFactoryBean.setDataSource(datasource);
		mybatisSqlSessionFactoryBean.setMapperLocations(context.getResources("classpath:mapper/**/*.xml"));
		mybatisSqlSessionFactoryBean.setTypeAliasesPackage("ksmart36.mybatis.domain");
						
		return mybatisSqlSessionFactoryBean.getObject();
	}
}
