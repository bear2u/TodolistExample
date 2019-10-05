package com.example.todolist.write.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.todolist.R;
import com.example.todolist.write.WriteContract;
import com.example.todolist.write.WritePresenter;

public class WriteActivity extends AppCompatActivity
        implements WriteContract.View {

    WriteContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        presenter = new WritePresenter();
        presenter.setView(this);

        findViewById(R.id.btnSave).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.save(null);
            }
        });
    }

    @Override
    public void saveDone() {
        Toast.makeText(this, "Save Done", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        presenter.removeView();
        super.onDestroy();
    }
}
