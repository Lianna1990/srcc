package ru.geekbrains.lesson7.auth;

import ru.geekbrains.lesson7.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthServiceImpl implements AuthService {

    public Map<String, String> users = new HashMap<>();

    public AuthServiceImpl() {
        users.put("ivan", "123");
        users.put("petr", "345");
        users.put("julia", "789");
    }

    @Override
    public boolean authUser(String username, String password) {
        String pwd = users.get(username);
        return pwd != null && pwd.equals(password);
    }

    @Override
    public User getAuthUser(String username, String password) {
        return new User(0, username, password);
    }

    @Override
    public List<String> getAllUsers() {
        return new ArrayList<>(users.keySet());
    }

    @Override
    public void changeLogin(String oldLogin, String newLogin) {

    }

    @Override
    public void close() throws Exception {
        //Do nothing
    }
}
