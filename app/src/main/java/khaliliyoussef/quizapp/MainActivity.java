package khaliliyoussef.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
int score=0;
    //question zero
    @BindView(R.id.q0_editText) EditText editTextQ0;
    //first question
    @BindView(R.id.q1_option1) RadioButton radioButtonQ1Op1;    //this is the correct option


    //the second question
    @BindView(R.id.q2_option2) RadioButton radioButtonQ2Op2;    // this is the correct answer


    //the third question
    @BindView(R.id.q3_answer) EditText editTextQ3;   //the correct answer is boolean


    //the forth question
    @BindView(R.id.checkBox_static) CheckBox  checkBox_static;  //both are correct
    @BindView(R.id.checkBox_public) CheckBox  checkBox_public;  //both are correct

    //submit button
    @BindView(R.id.submitBtn) Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(radioButtonQ1Op1.isChecked())
                {
                    score++;

                }

                if (radioButtonQ2Op2.isChecked())
                {
                    score++;


                }
                if (editTextQ3.getText().toString().equals(String.valueOf("boolean")))
                {
                    score++;
                }

                if (checkBox_public.isChecked()||checkBox_static.isChecked())
                {
                    score++;
                }

                if (editTextQ0.getText().toString().equals(String.valueOf("object")))
                {
                    score++;
                }

                Toast.makeText(MainActivity.this, " Your Score is : "+score, Toast.LENGTH_SHORT).show();
                score=0;
            }
        });

    }
}
