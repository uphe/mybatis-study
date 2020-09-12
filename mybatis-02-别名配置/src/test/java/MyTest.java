import com.hzy.mapper.UserMapper;
import com.hzy.pojo.User;
import com.hzy.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
//        int num = userMapper.addUser(new User("com.hzy","123"));
//        sqlSession.commit(); //提交事务这句话在增删改中不能少
//        System.out.println(num);

        sqlSession.close();
    }
}
