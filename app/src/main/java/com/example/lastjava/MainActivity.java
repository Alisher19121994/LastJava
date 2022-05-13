package com.example.lastjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void initViews() {
        recyclerView = findViewById(R.id.id_R);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        ArrayList<ContactLists> list = new ArrayList<>();
        list.add(new ContactLists(R.drawable.rasm, "5", "Alisher Daminov"));
        list.add(new ContactLists(R.drawable.rasm1, "5", "Alisher Daminov"));
        list.add(new ContactLists(R.drawable.rasm2, "65", "Alisher Daminov"));
        list.add(new ContactLists(R.drawable.rasm3, "44", "Alisher Daminov"));
        list.add(new ContactLists(R.drawable.rasm4, "5", "Alisher Daminov"));
        list.add(new ContactLists(R.drawable.rasm4, "5", "Alisher Daminov"));
        list.add(new ContactLists(R.drawable.rasm5, "5", "Alisher Daminov"));
        list.add(new ContactLists(R.drawable.rasm6, "5", "Alisher Daminov"));
        list.add(new ContactLists(R.drawable.rasm7, "5", "Alisher Daminov"));
        list.add(new ContactLists(R.drawable.rasm8, "5", "Alisher Daminov"));
        list.add(new ContactLists(R.drawable.rasm9, "5", "Alisher Daminov"));
        list.add(new ContactLists(R.drawable.rasm9, "", "Alisher Daminov"));
        list.add(new ContactLists(R.drawable.rasm9, "5", "Alisher Daminov"));
        list.add(new ContactLists(R.drawable.rasm10, "55", "Alisher Daminov"));
        list.add(new ContactLists(R.drawable.rasm4, "5", "Alisher Daminov"));
        list.add(new ContactLists(R.drawable.rasm7, "5", "Alisher Daminov"));
        list.add(new ContactLists(R.drawable.rasm9, "5", "Alisher Daminov"));
        list.add(new ContactLists(R.drawable.rasm, "5", "Alisher Daminov"));
        list.add(new ContactLists(R.drawable.rasm, "44", "Alisher Daminov"));

        Chat_Adapter_RecyclerView chat_adapter_recyclerView = new Chat_Adapter_RecyclerView(this, list);
        recyclerView.setAdapter(chat_adapter_recyclerView);
    }
}