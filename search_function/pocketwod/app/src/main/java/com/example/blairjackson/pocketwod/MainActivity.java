package com.example.blairjackson.pocketwod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Console;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.search_button);
        final Search search = new Search();

       // EditText search_text = (EditText) findViewById(R.id.editText);



        btn.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View view) {
                                       Log.i("My_app", "seems to work");

                                       //Output to show if there is a match
                                       String output;

                                       //Get text from user
                                       EditText search_text = (EditText) findViewById(R.id.editText);
                                       String search_string = search_text.getText().toString();

                                       //check if there is a match in the list of exercises
                                       output = search.get_text(search_string);

                                       //set the users text to the text area
                                       TextView text = (TextView) findViewById(R.id.show_text);
                                       TextView text_list = (TextView) findViewById(R.id.list_one);

                                       TextView text_list2 = (TextView) findViewById(R.id.list_two);
                                       TextView text_list3 = (TextView) findViewById(R.id.list_three);


                                        if(search_string.equals("bicep")) {
                                            text_list.setText("Bicep Curls");
                                            text_list2.setText("Bicep Barbell");
                                            text_list3.setText("Bicep Hammer Curls");
                                        }else{
                                            text_list.setText("");
                                            text_list2.setText(output);
                                            text_list3.setText("");
                                        }

                                       //show a message "searching"
//                                       Toast.makeText(getApplicationContext(), "Searching Database",
//                                               Toast.LENGTH_LONG).show();

                                   }
                               }

        );

    }
}
