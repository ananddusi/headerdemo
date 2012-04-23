package com.geodatadesign.headerdemo;

import java.util.List;

import com.geodatadesign.headerdemo.R.id;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class HeaderdemoActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        View descriptionHeader = findViewById(R.id.listheader_description);
        TextView description1 = (TextView) descriptionHeader.findViewById(id.header_line1);
        TextView description2 = (TextView) descriptionHeader.findViewById(id.header_line2);
        description1.setText("This is the first line describing the list");
        description2.setText("Another description in the header");
        
        View columnHeadersView = findViewById(R.id.listheader_columns);
        TextView columnHeader1 = (TextView) columnHeadersView.findViewById(R.id.column_header1);
        TextView columnHeader2 = (TextView) columnHeadersView.findViewById(R.id.column_header2);
        
        columnHeader1.setText("Date");
        columnHeader2.setText("Precipitation (inches)");
        
        ListView view = (ListView) findViewById(R.id.listview);
        final List<MyStringPair> myStringPairList = MyStringPair.makeData(10);
        MyStringPairAdapter adapter = new MyStringPairAdapter(this, myStringPairList);
              
        view.setAdapter(adapter);
    }

}