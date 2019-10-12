package com.example.todolist.logic;

import com.example.todolist.model.Item;

import io.reactivex.Single;

public interface DataSource {
    void setRepository(Repository repository);
    Single<Long> save(Item item);

    void fetchItems();
}
