
import com.hzy.mapper.UserMapper;
import com.hzy.pojo.User;
import com.hzy.utils.MybatisUtils;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {

    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);


        User user = new User();
        user.setUsername("aaa");
        user.setPassword("bbb");
        int i = userMapper.addUser(user);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }
}