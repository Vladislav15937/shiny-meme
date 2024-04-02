package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.SessionFactory;

import java.sql.Connection;
import java.util.List;

public class UserServiceImpl implements UserService {

    private final Util util = new Util();

    private final Connection connection = util.getConnection();

    private final SessionFactory sessionFactory = util.getSessionFactory();

    private final UserDao userDaoHibernate = new UserDaoHibernateImpl(sessionFactory);

    // private final UserDao userDao = new UserDaoJDBCImpl(connection);

    public void createUsersTable() {

        userDaoHibernate.createUsersTable();
        //userDao.createUsersTable();
    }

    public void dropUsersTable() {

        userDaoHibernate.dropUsersTable();
//        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {

        userDaoHibernate.saveUser(name, lastName, age);
        //userDao.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {

        userDaoHibernate.removeUserById(id);
        //userDao.removeUserById(id);
    }

    public List<User> getAllUsers() {

        return userDaoHibernate.getAllUsers();
        //return userDao.getAllUsers();
    }

    public void cleanUsersTable() {

        userDaoHibernate.cleanUsersTable();
        //userDao.cleanUsersTable();
    }
}
