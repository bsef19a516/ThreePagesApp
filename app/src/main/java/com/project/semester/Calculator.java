package com.project.semester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    EditText First,Second;
    TextView ans;
    Button add,divide,multiply,subtract,clear,about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        init();
    }

    private void init(){
        First = (EditText) findViewById(R.id.first);
        Second = (EditText) findViewById(R.id.second);

        ans = (TextView) findViewById(R.id.ans);

        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        divide = (Button) findViewById(R.id.divide);
        multiply = (Button) findViewById(R.id.multiply);
        clear = (Button) findViewById(R.id.clear);
        about = (Button) findViewById(R.id.about);

        add.setOnClickListener(this);
        subtract.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiply.setOnClickListener(this);
        clear.setOnClickListener(this);
        about.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        String one = First.getText().toString();
        String two = Second.getText().toString();
        int answer;
        switch (view.getId()){
            case R.id.add:
                if(one.length()>0 && two.length()>0){
                    answer = Integer.parseInt(one)+Integer.parseInt(two);
                    ans.setText("Answer is: "+answer);
                }else{
                    Toast.makeText(getApplicationContext(), "Field Cannot be empty", Toast.LENGTH_SHORT).show();

                }
                break;
            case R.id.subtract:
                if(one.length()>0 && two.length()>0){
                    answer = Integer.parseInt(one)-Integer.parseInt(two);
                    ans.setText("Answer is: "+answer);
                }else{
                    Toast.makeText(getApplicationContext(), "Field Cannot be empty", Toast.LENGTH_SHORT).show();

                }
                break;
            case R.id.multiply:
                if(one.length()>0 && two.length()>0){
                    answer = Integer.parseInt(one)*Integer.parseInt(two);
                    ans.setText("Answer is: "+answer);
                }else{
                    Toast.makeText(getApplicationContext(), "Field Cannot be empty", Toast.LENGTH_SHORT).show();

                }
                break;
            case R.id.divide:
                if(one.length()>0 && two.length()>0){
                    if(Integer.parseInt(two)==0){
                        Toast.makeText(getApplicationContext(), "Second value cannot be zero", Toast.LENGTH_SHORT).show();

                    }else {
                        answer = Integer.parseInt(one) / Integer.parseInt(two);
                        ans.setText("Answer is: " + answer);
                    }
                }else{
                    Toast.makeText(getApplicationContext(), "Field Cannot be empty", Toast.LENGTH_SHORT).show();

                }
                break;
            case R.id.clear:
                First.getText().clear();
                Second.getText().clear();
                ans.setText("Answer is:");
                break;
            case R.id. about:
                Intent intent = new Intent(this,About.class);
                startActivity(intent);
                break;

        }
    }
}