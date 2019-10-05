package com.example.todolist.logic.local;

import android.os.AsyncTask;

import com.example.todolist.logic.DataSource;
import com.example.todolist.logic.Repository;
import com.example.todolist.model.Item;

public class LocalDataSourceImpl implements DataSource {
    Repository repository;


    @Override
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void save(final Item item) {
        //TODO SAVE

        try {
            final AppDatabase appDatabase = AppDatabaseProvider.getINSTANCE();
            // 첫번째 쓰레드
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    ItemDao itemDao = appDatabase.getItemDao();
//                    itemDao.saveItem(item);
//                }
//            }).start();

            new AsyncTask<Void, Void, Void>(

            ) {
                // 백그라운드 동작
                @Override
                protected Void doInBackground(Void... voids) {
                    ItemDao itemDao = appDatabase.getItemDao();
                    itemDao.saveItem(item);
                    return null;
                }

                //UI 쓰레드 동작
                @Override
                protected void onPostExecute(Void aVoid) {
                    repository.saveDone();
                }
            }.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
