package com.example.todolist.write.presenter;

import com.example.todolist.base.BasePresenter;
import com.example.todolist.base.BasePresenterImpl;
import com.example.todolist.model.Item;
import com.example.todolist.write.WriteContract;

public class WritePresenter
        extends BasePresenterImpl<WriteContract.View>
        implements WriteContract.Presenter {
    WriteContract.View view;

    @Override
    public void setView(WriteContract.View view) {
        this.view = view;
    }

    @Override
    public void removeView() {
        this.view = null;
    }

    @Override
    public void save(Item item) {
        //TODO Repository에 저장
        view.saveDone();
    }

    @Override
    public void saveDone() {
        //TODO Repository에서 저장완료
    }
}
