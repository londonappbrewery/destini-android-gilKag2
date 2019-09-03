package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button topButton;
    private Button bottomButton;

    private TextView story;

    private int index = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topButton = findViewById(R.id.buttonTop);
        bottomButton = findViewById(R.id.buttonBottom);
        story = findViewById(R.id.storyTextView);

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index < 3) {
                    moveToThirdStory();
                } else {
                    T6End();
                }
            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index == 1) {
                    moveToSecondStory();
                }
                else if (index == 2) {
                    T4End();
                } else if (index == 3) {
                    T5End();
                }
            }
        });

    }

    private void hideButtons() {
        topButton.setVisibility(View.GONE);
        bottomButton.setVisibility(View.GONE);
    }

    private void T4End() {
        story.setText(R.string.T4_End);
        hideButtons();
    }

    private void T5End() {
        story.setText(R.string.T5_End);
        hideButtons();
    }

    private void T6End() {
        story.setText(R.string.T6_End);
        hideButtons();
    }

    private void moveToSecondStory() {
        story.setText(R.string.T2_Story);
        topButton.setText(R.string.T2_Ans1);
        bottomButton.setText(R.string.T2_Ans2);
        index = 2;
    }

    private void moveToThirdStory() {
        story.setText(R.string.T3_Story);
        topButton.setText(R.string.T3_Ans1);
        bottomButton.setText(R.string.T3_Ans2);
        index = 3;
    }


}
