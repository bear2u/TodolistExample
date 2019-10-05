package com.example.todolist.logic.local;

import com.example.todolist.logic.DataSource;
import com.example.todolist.logic.Repository;
import com.example.todolist.model.Item;

public class LocalDataSourceImpl implements DataSource {
    Repository repository;
    @Override
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Item item) {
        this.repository.saveDone();
    }
}
