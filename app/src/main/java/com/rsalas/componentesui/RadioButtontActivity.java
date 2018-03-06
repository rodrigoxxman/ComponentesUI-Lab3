package com.rsalas.componentesui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RadioButtontActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_buttont);
        radioGroup =  (RadioGroup) findViewById(R.id.radioGroup);
        displayText = (TextView) findViewById(R.id.dsplayText);
    }

    public void radioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton1:
                if (checked)
                    Toast.makeText(getApplicationContext(), "It seems like you feel RelativeLayout easy", Toast.LENGTH_SHORT).show();
                break;

            case R.id.radioButton2:
                Toast.makeText(getApplicationContext(), "It seems like you feel LinearLayout easy", Toast.LENGTH_SHORT).show();
                break;

            case R.id.radioButton3:
                Toast.makeText(getApplicationContext(), "It seems like you feel FrameLayout easy", Toast.LENGTH_SHORT).show();
                break;

            case R.id.radioButton4:
                Toast.makeText(getApplicationContext(), "It seems like you feel TablleLayout easy", Toast.LENGTH_SHORT).show();
                break;

            case R.id.radioButton5:
                Toast.makeText(getApplicationContext(), "It seems like you feel GridLayout easy", Toast.LENGTH_SHORT).show();
                break;
            }
        }
    public void answer(View view){
        int radioButtonId = radioGroup.getCheckedRadioButtonId();
        if (radioButtonId == -1){
            Toast.makeText(this, "This field is required!", Toast.LENGTH_LONG).show();
        }
        else{
            if (radioButtonId == R.id.radioButton1){
                Toast.makeText(this, "You selected RelativeLayout", Toast.LENGTH_SHORT).show();
            }else if (radioButtonId == R.id.radioButton2){
                Toast.makeText(this, "You selected LinearLayout", Toast.LENGTH_SHORT).show();
            }

            RadioButton radioButton = (RadioButton) findViewById(radioButtonId);
            Toast.makeText(this, "This text is " + radioButton.getText(), Toast.LENGTH_SHORT).show();
        }
    }

}
