package com.muwednesday.service;

import com.muwednesday.dao.UserMapper;
import com.muwednesday.model.User;
import com.muwednesday.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Description:
 *
 * @author Xinwen
 * @date 2018/9/2
 */
public class UserServiceImpl implements UserService {

    @Override
    public void insertUser(User user) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.insertUser(user);
            sqlSession.commit();
        }
    }

    @Override
    public User getUserById(Integer id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(Integer id) {

    }
}
