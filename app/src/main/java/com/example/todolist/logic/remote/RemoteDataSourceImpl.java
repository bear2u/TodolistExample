package com.example.todolist.logic.remote;

import com.example.todolist.logic.DataSource;
import com.example.todolist.logic.Repository;
import com.example.todolist.model.Item;

import io.reactivex.Single;

public class RemoteDataSourceImpl implements DataSource {

    @Override
    public void setRepository(Repository repository) {

    }

    @Override
    public Single<Long> save(Item item) {

        return null;
    }

    @Override
    public void fetchItems() {

    }
}
