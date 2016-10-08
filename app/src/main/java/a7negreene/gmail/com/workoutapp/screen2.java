package a7negreene.gmail.com.workoutapp;

import android.content.Context;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static a7negreene.gmail.com.workoutapp.R.id.list_view;
import static android.R.id.list;
import static android.R.id.message;

public class screen2 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);

        Intent intent = getIntent();

        ArrayList<String> workoutDays = new ArrayList<String>();

        workoutDays.add("Monday");
        workoutDays.add("Tuesday");
        workoutDays.add("Wednesday");
        workoutDays.add("Thursday");
        workoutDays.add("Friday");
        workoutDays.add("Saturday");
        workoutDays.add("Sunday");
        //create list adapater
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                workoutDays );

        ListView listView = (ListView) findViewById(list_view);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int i, long l) {


                if(i == 0){
                    Intent mainIntent = new Intent(screen2.this, monday_activity.class);
                    startActivity(mainIntent);
                }
                if(i == 1){
                    Intent mainIntent = new Intent(screen2.this, tuesday_activity.class);
                    startActivity(mainIntent);
                }
                if(i == 2){
                    Intent mainIntent = new Intent(screen2.this, wednesday_activity.class);
                    startActivity(mainIntent);
                }
                if(i == 3){
                    Intent mainIntent = new Intent(screen2.this, thursday_activity.class);
                    startActivity(mainIntent);
                }if(i == 4){
                    Intent mainIntent = new Intent(screen2.this, friday_activity.class);
                    startActivity(mainIntent);
                }
                if(i == 5){
                    Intent mainIntent = new Intent(screen2.this, saturday_activity.class);
                    startActivity(mainIntent);
                }
                if(i == 6){
                    Context context = getApplicationContext();
                    CharSequence text = "Take a day off!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }

            }
        });
        }
    }


