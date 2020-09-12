import com.github.pagehelper.PageHelper;
import com.hzy.mapper.UserMapper;
import com.hzy.pojo.User;
import com.hzy.util.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("offset",1);
        map.put("pageSize",2);
//        RowBounds rowBounds = new RowBounds(1,2);
        List<User> userByLimit = userMapper.getUserByLimit(map);
//        List<User> userByRowBounds = userMapper.getUserByRowBounds(rowBounds);
//        PageHelper.offsetPage(1,2);
        List<User> userList = userMapper.getUserByPageHelper();
        for (User user : userByLimit) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
