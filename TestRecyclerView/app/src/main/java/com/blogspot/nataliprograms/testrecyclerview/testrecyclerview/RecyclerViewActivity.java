package com.blogspot.nataliprograms.testrecyclerview.testrecyclerview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class RecyclerViewActivity extends ActionBarActivity {

    private RecyclerView myRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        myRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        List<String> elements = new ArrayList<String>();
        elements.add("1");
        elements.add("2");
        elements.add("3");
        elements.add("4");
        elements.add("5");
        elements.add("6");
        elements.add("7");
        elements.add("8");
        elements.add("9");
        elements.add("10");
        elements.add("12");
        elements.add("13");
        elements.add("14");
        elements.add("15");
        elements.add("16");
        elements.add("17");
        elements.add("18");
        elements.add("19");
        elements.add("20");
        elements.add("21");
        elements.add("22");
        elements.add("23");
        elements.add("24");
        elements.add("25");
        elements.add("26");
        elements.add("27");
        elements.add("28");
        elements.add("29");
        myRecyclerView.setAdapter(new MyRecyclerAdapter(elements));
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private class MyRecyclerAdapter extends RecyclerView.Adapter{

        private List<String> records;

        public MyRecyclerAdapter(List<String> records) {
            this.records = records;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            TextView text = new TextView(parent.getContext());
            return new MyViewHolder(text);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            ((MyViewHolder)holder).text.setText(records.get(position));
        }

        @Override
        public int getItemCount() {
            return records.size();
        }
    }

    private class MyViewHolder extends RecyclerView.ViewHolder{

        TextView text;

        public MyViewHolder(View itemView) {
            super(itemView);
            text = (TextView) itemView;
        }
    }
}
