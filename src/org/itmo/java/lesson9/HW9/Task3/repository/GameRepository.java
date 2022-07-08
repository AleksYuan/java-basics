package org.itmo.java.lesson9.HW9.Task3.repository;

import java.util.Map;

public interface GameRepository {

    void addData(String name, Integer points);

    void downloadData(Map<String, Integer> dataNew);

    Integer findBy(String key);

    Map createDataBase(Integer line);

}
