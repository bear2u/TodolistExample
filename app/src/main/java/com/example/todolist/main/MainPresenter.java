package com.example.todolist.main;

import com.example.todolist.base.BasePresenterImpl;
import com.example.todolist.logic.Repository;
import com.example.todolist.logic.RepositoryImpl;

public class MainPresenter
        extends BasePresenterImpl<MainContract.View>
        implements MainContract.Presenter {
    Repository repository;

    MainPresenter() {
        this.repository = new RepositoryImpl();
        this.repository.setPresenter(this);
    }

    @Override
    public void fetchItems() {
        this.repository.fetchItems();

    }

    @Override
    public void fetchItemsDone() {
        view.fetchItemsDone();
    }
}
