package com.wangcan.mybatis.demo.Interceptor;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

/**
 * @author Administrator
 */
@Intercepts(@Signature(
    type = Executor.class,
    method = "query",
    args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}))
public class LogInterceptor implements Interceptor {

    private String user;

    private Properties properties = new Properties();

    public Object intercept(Invocation invocation) throws Throwable {
        Object returnObject = invocation.proceed();
        System.out.println(user + "select");
        return returnObject;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Properties getProperties() {
        return properties;
    }
}
