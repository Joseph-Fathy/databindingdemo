package com.example.josephfathi.myapplication;

import java.util.List;

public class MyAdapter extends MyBaseAdapter {
    List<TemperatureData> data;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<TemperatureData> myDataset) {
        data = myDataset;
    }


    @Override
    public int getLayoutIdForType(int viewType) {
        return R.layout.rowlayout;
    }

    @Override
    public Object getDataAtPosition(int position) {
        return (data == null) ? null : data.get(position);
    }

    @Override
    public int getItemCount() {
        return (data == null) ? 0 : data.size();
    }


}
