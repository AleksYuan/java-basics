package org.itmo.java.lesson9.HW9.Task3.service;

import org.itmo.java.lesson9.HW9.Task3.user.User;

import java.util.Map;

public interface ServiceUser {
    User create(String name, Integer points);
    void download(Map<String, Integer> dataNew);
    Integer get(String key);
    Map generateDataBase(Integer line);

}
