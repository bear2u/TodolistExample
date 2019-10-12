package com.example.todolist.logic;

import com.example.todolist.base.BasePresenter;
import com.example.todolist.model.Item;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

public interface Repository<T> {
    void setPresenter(BasePresenter<T> presenter);
    Single save(Item item);
    void saveDone();

    //Fetch
    void fetchItems();
    void fetchItemsDone(List<Item> items);
}
