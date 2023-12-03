
package com.example.myapplicatio3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        Button afficher=findViewById(R.id.button2);
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
        afficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editTextText2.getText().toString();

                if(value.isEmpty()) {
                    for (int i = 0; i <= 10; i++) {
                        Toast.makeText(MainActivity.this,"ne doit etre vide",Toast.LENGTH_LONG).show();
                        jadwaldarb.setText("\n? * 0= ? \n ? * 1= ? \n ? * 2= ? \n ? * 3= ? \n ? * 4= ? \n ? * 5= ? \n  ? * 6= ? \n? * 7= ? \n? * 8= ? \n? * 9= ?\n ? * 10= ?");}}
                else{
                    double number = Double.parseDouble(value);
                    StringBuilder result = new StringBuilder();
                        for (int i = 0; i <= 10; i++){
                    result.append(number).append(" * ").append(i).append(" = ").append(number * i).append("\n");

                        jadwaldarb.setText(result.toString());}}
                        }
            });

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
