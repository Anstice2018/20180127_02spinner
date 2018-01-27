package com.example.student.a20180127_02spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv, tv2;
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        sp = findViewById(R.id.spinner);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String f[] = getResources().getStringArray(R.array.fruits);
                tv2.setText(f[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    //轉換成文字
    public void click1 (View v){
        tv.setText(      (  (TextView)sp.getSelectedView()  ).getText().toString()    );
    }

    //取位置, 再得到文字
    public void click2 (View v){
        int s = sp.getSelectedItemPosition();
        String f[] = getResources().getStringArray(R.array.fruits);
        tv.setText(f[s]);
    }

}
