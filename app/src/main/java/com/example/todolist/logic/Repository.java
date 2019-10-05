package com.example.todolist.logic;

import com.example.todolist.base.BasePresenter;
import com.example.todolist.model.Item;

public interface Repository<T> {
    void setPresenter(BasePresenter<T> presenter);
    void save(Item item);
    void saveDone();

    //Fetch
    void fetchItems();
    void fetchItemsDone();
}
