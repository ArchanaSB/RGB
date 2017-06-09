package com.example.welcome.rgb;
import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.welcome.rgb.MainActivity;
import com.example.welcome.rgb.R;

public class MainActivity extends AppCompatActivity
{
    Button r,g,b;
    TextView rr,gg,bb;
    RelativeLayout l;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = (RelativeLayout) findViewById(R.id.mainsp);

        r = (Button) findViewById(R.id.redchange);
        g = (Button) findViewById(R.id.greenchange);
        b = (Button) findViewById(R.id.bluechange);
        rr= (TextView) findViewById(R.id.redvalue);
        gg= (TextView) findViewById(R.id.greenvalue);
        bb= (TextView) findViewById(R.id.bluevalue);


    }


    public void mod(View view){
        String c=rr.getText().toString();
        int x=Integer.valueOf(c);
        String d=gg.getText().toString();
        int y=Integer.valueOf(d);
        String e=bb.getText().toString();
        int z=Integer.valueOf(e);

        switch (view.getId()) {
            case R.id.redchange:
                x=x+25;
                if(x>=255)
                    x=0;
                l.setBackgroundColor(Color.rgb(x,y,z));
                rr.setText(String.valueOf(x));
                break;

            case R.id.greenchange:
                y=y+25;
                if(y>=255)
                    y=0;

                l.setBackgroundColor(Color.rgb(x,y,z));
                gg.setText(String.valueOf(y));

                break;
            case R.id.bluechange:
                z=z+25;
                if(z>=255)
                    z=0;
                l.setBackgroundColor(Color.rgb(x,y,z));
                bb.setText(String.valueOf(z));

                break;

        }

    }
    public void reset(View view){
        String c=rr.getText().toString();
        int m=Integer.valueOf(c);
        String d=gg.getText().toString();
        int n=Integer.valueOf(d);
        String e=bb.getText().toString();
        int o=Integer.valueOf(e);
        m=n=o=0;
        rr.setText(String.valueOf(m));
        gg.setText(String.valueOf(n));
        bb.setText(String.valueOf(o));
        l.setBackgroundColor(Color.rgb(m,n,o));
    }
}




