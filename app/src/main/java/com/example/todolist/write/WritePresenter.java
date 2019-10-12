package com.example.todolist.write;

import android.util.Log;

import com.example.todolist.base.BasePresenterImpl;
import com.example.todolist.logic.Repository;
import com.example.todolist.logic.RepositoryImpl;
import com.example.todolist.model.Item;

import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

public class WritePresenter
        extends BasePresenterImpl<WriteContract.View>
        implements WriteContract.Presenter {
    WriteContract.View view;
    Repository repository;

    @Override
    public void setView(WriteContract.View view) {
        this.view = view;
        repository = new RepositoryImpl();
        repository.setPresenter(this);
    }

    @Override
    public void removeView() {
        this.view = null;
    }

    @Override
    public void save(Item item) {
        //TODO Repository에 저장
        repository.save(item)
                .doOnSuccess((object)
                        -> Log.d("WritePresenter",
                            Thread.currentThread().getName()))
                .subscribe(new Consumer() {
                    @Override
                    public void accept(Object o) throws Exception {
                     view.saveDone();
                    }
                });
    }

    @Override
    public void saveDone() {
        view.saveDone();
    }
}
