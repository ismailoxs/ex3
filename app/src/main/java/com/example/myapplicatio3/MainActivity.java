
package com.example.myapplicatio3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void chngeclorwhite(View view) {

        View root = view.getRootView();


        root.setBackgroundColor(Color.WHITE);
    }
    public void changecolorpink(View view) {

        View root = view.getRootView();


        root.setBackgroundColor(Color.parseColor("#F9C2FB"));
    }
    public void chngeclororange(View view) {

        View root = view.getRootView();


        root.setBackgroundColor(Color.parseColor("#F5CBA7"));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button quiter=findViewById(R.id.button3);





        Button renitialiser=findViewById(R.id.button1);
        EditText editTextText2=findViewById(R.id.editTextText2);
        TextView jadwaldarb=findViewById(R.id.jadwaldarb);
        quiter.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          finish();
                                          System.exit(0);
                                      }
                                  }

        );
        renitialiser.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                editTextText2.setText("");
                jadwaldarb.setText("\n? * 0= ? \n ? * 1= ? \n ? * 2= ? \n ? * 3= ? \n ? * 4= ? \n ? * 5= ? \n  ? * 6= ? \n? * 7= ? \n? * 8= ? \n? * 9= ?\n ? * 10= ?");
            }
        });

    }
}
