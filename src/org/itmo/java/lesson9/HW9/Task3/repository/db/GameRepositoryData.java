package org.itmo.java.lesson9.HW9.Task3.repository.db;

import org.itmo.java.lesson9.HW9.Task3.repository.GameRepository;
import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;

public class GameRepositoryData implements GameRepository {
    Map<String, Integer> dataBase = new HashMap<>();

    public GameRepositoryData() {
    }

    public GameRepositoryData(Map<String, Integer> dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void addData(String name, Integer points) {

        this.dataBase.put(name, points);
        System.out.printf("Новый пользователь имя %s, очки %s добавлен в базу данных", name, points);
        System.out.println();
        System.out.println(dataBase);
    }

    @Override
    public void downloadData(Map<String, Integer> dataNew) {
        this.dataBase = dataNew;
        System.out.println("база данных загружена успешно");
        System.out.println(dataBase);
    }


    @Override
    public Integer findBy(String key) {
        if (dataBase.containsKey(key)) {
            return dataBase.get(key);
        } else {
            return null;
        }
    }

    @Override
    public Map createDataBase(Integer line) {
        Map<String, Integer> dataBase = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < line; i++) {
            dataBase.put(scan.nextLine(), (int) (Math.random() * 1000));
        }
        this.dataBase = dataBase;
        return dataBase;
    }

}
