package com.example.todolist.logic;

import com.example.todolist.base.BasePresenter;
import com.example.todolist.logic.Repository;
import com.example.todolist.logic.local.LocalDataSourceImpl;
import com.example.todolist.logic.remote.RemoteDataSourceImpl;
import com.example.todolist.main.MainContract;
import com.example.todolist.main.MainPresenter;
import com.example.todolist.model.Item;
import com.example.todolist.write.WriteContract;

public class RepositoryImpl<T> implements Repository {
    BasePresenter<T> presenter;
    DataSource localDataSource;
    DataSource remoteDataSource;

    @Override
    public void setPresenter(BasePresenter presenter) {
        this.presenter = presenter;
        localDataSource = new LocalDataSourceImpl();
        remoteDataSource = new RemoteDataSourceImpl();
        localDataSource.setRepository(this);
        remoteDataSource.setRepository(this);
    }

    @Override
    public void save(Item item) {
        localDataSource.save(item);
    }

    @Override
    public void saveDone() {
        ((WriteContract.Presenter)presenter).saveDone();
    }

    @Override
    public void fetchItems() {
        ((MainContract.Presenter)presenter).fetchItemsDone();
    }

}
