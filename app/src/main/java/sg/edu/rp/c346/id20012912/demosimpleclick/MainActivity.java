package sg.edu.rp.c346.id20012912.demosimpleclick;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
{
    Button btnDisplay;
    EditText etInput;
    TextView tvDisplay;
    ToggleButton Tglbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tvDisplay = findViewById(R.id.textViewDisplay);
        Tglbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.RadioGroupGender);

        btnDisplay.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String userInput = etInput.getText().toString();

                if(rgGender.getCheckedRadioButtonId() ==  R.id.radioButtonGenderMale)
                {
                    userInput = "He says " + userInput;
                }

                else
                {
                    userInput = "She says " + userInput;
                }
                tvDisplay.setText(userInput);

            }
        });

        Tglbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(Tglbtn.isChecked())
                {
                    etInput.setEnabled(true);
                }

                else
                {
                    etInput.setEnabled(false);
                }

            }
        });




    }
}