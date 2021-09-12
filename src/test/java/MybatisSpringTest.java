//import com.wangcan.mybatis.demo.domain.User;
//import com.wangcan.mybatis.demo.mapper.UserMapper;
//import com.wangcan.mybatis.demo.spring.mybatis.SpringApplicationMain;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
///**
// * @author: wangcan
// * @date: 2021/9/11 16:23
// */
//@SpringBootTest(classes = SpringApplicationMain.class)
//public class MybatisSpringTest {
//
//    @Autowired(required = false)
//    UserMapper userMapper;
//    @Autowired
//    SqlSessionFactory sqlSessionFactory;
//
//    @Test
//    public void test() {
//       User user1= userMapper.select(1);
//
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User user = mapper.select(1);
//        System.out.println(user);
//    }
//}
