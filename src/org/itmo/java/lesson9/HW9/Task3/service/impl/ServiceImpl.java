package org.itmo.java.lesson9.HW9.Task3.service.impl;


import org.itmo.java.lesson9.HW9.Task3.repository.GameRepository;
import org.itmo.java.lesson9.HW9.Task3.repository.db.GameRepositoryData;
import org.itmo.java.lesson9.HW9.Task3.service.ServiceUser;
import org.itmo.java.lesson9.HW9.Task3.user.User;

import java.util.Map;

public class ServiceImpl implements ServiceUser {

    private GameRepository gameRepository = new GameRepositoryData();

    @Override
    public User create(String name, Integer points) {
        User user = new User(name, points);
        gameRepository.addData(name, points);
        return user;
    }

    @Override
    public void download(Map<String, Integer> dataNew) {
        gameRepository.downloadData(dataNew);
    }

    @Override
    public Integer get(String key) {
        return (gameRepository.findBy(key));
    }

    @Override
    public Map generateDataBase(Integer line) {
        return gameRepository.createDataBase(line);
    }


}
