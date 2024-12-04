package com.sdaproject.frugalflowapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityPlanning extends AppCompatActivity {

    private Button backButton;
    private View budgetsCard;
    private View savingGoalsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planning);

        // Initialize views
        backButton = findViewById(R.id.back_button);
        budgetsCard = findViewById(R.id.budgets_icon);
        savingGoalsCard = findViewById(R.id.saving_goals_icon);

        // Set up click listeners
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close the current activity and return to the previous one
                finish();
            }
        });

        budgetsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Budgets Page
                Intent intent = new Intent(ActivityPlanning.this, ActivityBudget.class);
                startActivity(intent);
            }
        });

        savingGoalsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Saving Goals Page
                Intent intent = new Intent(ActivityPlanning.this, ActivitySavingGoals.class);
                startActivity(intent);
            }
        });
    }
}