//package com.wangcan.mybatis.demo.spring.mybatis;
//
//import com.mchange.v2.c3p0.ComboPooledDataSource;
//import java.beans.PropertyVetoException;
//import javax.sql.DataSource;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.mapper.MapperScannerConfigurer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
///**
// * @author: wangcan
// * @date: 2021/9/11 15:49
// */
//@Configuration
//public class MybatisConfig {
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactory()
//        throws Exception {
//        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
//        sessionFactoryBean.setDataSource(dataSource());
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sessionFactoryBean
//            .setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
//        sessionFactoryBean.setTypeAliasesPackage("com.wangcan.mybatis.demo.domain");
//        return sessionFactoryBean.getObject();
//
//    }
//
//    /**
//     * 配置mapper扫描
//     * @return
//     */
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer(){
//        MapperScannerConfigurer configurer=new MapperScannerConfigurer();
//        configurer.setBasePackage("com.wangcan.mybatis.demo.mapper");
//        return configurer;
//    }
//
//    @Bean
//    public DataSource dataSource() throws PropertyVetoException {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
//        dataSource.setJdbcUrl("jdbc:mysql://172.26.59.35:3306/WK_OMS_WORKORDER");
//        dataSource.setUser("mysqluser");
//        dataSource.setPassword("mysqluser");
//        // 关闭连接后不自动提交
//        dataSource.setAutoCommitOnClose(false);
//        return dataSource;
//    }
//
//    /**
//     * 手工配置单个mapper
//     */
////    @Bean
////    public UserMapper userMapper() throws Exception {
////        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
////        return sqlSessionTemplate.getMapper(UserMapper.class);
////    }
//
//}
