package com.example.todolist.logic.local;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.todolist.model.Item;

import org.intellij.lang.annotations.Flow;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Single;

@Dao
public interface ItemDao {
    // TODO Query, Insert, Update
    // Query list
    @Query("select * from item order by no desc")
    Flowable<List<Item>> fetchItems();

    // Update
    @Query("select * from item where no = :no")
    Flowable<Item> fetchItem(int no);

    // Insert
    @Insert
    Single<Long> saveItem(Item item);
}
