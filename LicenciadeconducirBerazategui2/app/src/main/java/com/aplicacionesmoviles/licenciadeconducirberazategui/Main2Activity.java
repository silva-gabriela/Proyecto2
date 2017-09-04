package com.aplicacionesmoviles.licenciadeconducirberazategui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mPuntosView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    private String mAnswer;
    private int mPuntos = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mPuntosView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);

        updateQuestion();

        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (mButtonChoice1.getText() == mAnswer) {
                    mPuntos = mPuntos + 1;
                    updateScore(mPuntos);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(Main2Activity.this, "Correcto", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(Main2Activity.this, "Falso", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer) {
                    mPuntos = mPuntos + 1;
                    updateScore(mPuntos);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(Main2Activity.this, "Correcto", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(Main2Activity.this, "Falso", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == mAnswer) {
                    mPuntos = mPuntos + 1;
                    updateScore(mPuntos);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(Main2Activity.this, "Correcto", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(Main2Activity.this, "Falso", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });


    }

    private void updateQuestion() {

        if (mQuestionNumber < 10) {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));


            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }else {
            mQuestionView.setText(mQuestionLibrary.getQuestion(9));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(9));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(9));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(9));


            mAnswer = mQuestionLibrary.getCorrectAnswer(9);
        }
    }


    private void updateScore (int punto) {
        mPuntosView.setText("" + mPuntos);
    }



    public void iralinicio(View view) {
        finish();
    }
}



