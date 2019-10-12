package com.example.todolist.logic.local;

import com.example.todolist.logic.DataSource;
import com.example.todolist.logic.Repository;
import com.example.todolist.model.Item;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

public class LocalDataSourceImpl implements DataSource {
    Repository repository;
    AppDatabase appDatabase;

    public LocalDataSourceImpl() {
        try {
            appDatabase = AppDatabaseProvider.getINSTANCE();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Single<Long> save(final Item item) {
        //TODO SAVE
        return appDatabase.getItemDao().saveItem(item);

//        try {
//
//            new AsyncTask<Void, Void, Void>(
//
//            ) {
//                // 백그라운드 동작
//                @Override
//                protected Void doInBackground(Void... voids) {
//                    ItemDao itemDao = appDatabase.getItemDao();
//                    itemDao.saveItem(item);
//                    return null;
//                }
//
//                //UI 쓰레드 동작
//                @Override
//                protected void onPostExecute(Void aVoid) {
//                    repository.saveDone();
//                }
//            }.execute();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    // Fetch Items
    @Override
    public Flowable<List<Item>> fetchItems() {
        return appDatabase.getItemDao().fetchItems();
    }
}
