package com.example.todolist.main;

import com.example.todolist.base.BasePresenter;
import com.example.todolist.base.BaseView;

public class MainContract {
    public interface View
            extends BaseView {
        void fetchItemsFinished();
    }

    public interface Presenter
            extends BasePresenter<View> {
        //TODO fetch Items
        void fetchItems();
    }
}
