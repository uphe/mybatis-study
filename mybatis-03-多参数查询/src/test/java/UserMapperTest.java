
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

        List<User> userList = userMapper.getUserByNameAndPassword("root","root");
//        List<User> userList = userMapper.getUserList();
//        Map<String,Object> map = new HashMap<String, Object>();
//        map.put("username", "root");
//        map.put("password", "root");
//        List<User> userList = userMapper.getUserByNameAndPassword(map);
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}