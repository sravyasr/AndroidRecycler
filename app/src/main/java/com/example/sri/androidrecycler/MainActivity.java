package com.example.sri.androidrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.recycler);
        int images[]={R.drawable.cupcake,R.drawable.donut,R.drawable.eclair,R.drawable.froyo,R.drawable.ginger,R.drawable.honey,R.drawable.icecream,R.drawable.jelly,R.drawable.kitkat,R.drawable.lollipop,R.drawable.marsh};
        String names[]={"Cupcake","Donut","Eclair","Froyo","Ginger","Honey","Icecream","Jelly","Kitkat","Lollipop","Marsh"};
        MyAdapter adapter=new MyAdapter(this,images,names);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }
}
