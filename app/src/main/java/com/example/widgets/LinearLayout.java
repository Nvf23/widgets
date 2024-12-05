package com.example.widgets;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.RadioGroup;

public class LinearLayout extends Activity
        implements RadioGroup.OnCheckedChangeListener {

    private android.widget.LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_linear);

        mainLayout = findViewById(R.id.linearLayout);
        RadioGroup orientationGroup = findViewById(R.id.orientation);
        RadioGroup gravityGroup = findViewById(R.id.gravity);

        orientationGroup.setOnCheckedChangeListener(this);
        gravityGroup.setOnCheckedChangeListener(this);
    }

    @SuppressLint("RtlHardcoded")
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (group.getId() == R.id.orientation) {
            if (checkedId == R.id.horizontal) {
                mainLayout.setOrientation(android.widget.LinearLayout.HORIZONTAL);
            } else if (checkedId == R.id.vertical) {
                mainLayout.setOrientation(android.widget.LinearLayout.VERTICAL);
            }
        }

        if (group.getId() == R.id.gravity) {
            if (checkedId == R.id.left) {
                mainLayout.setGravity(Gravity.LEFT);
            } else if (checkedId == R.id.center) {
                mainLayout.setGravity(Gravity.CENTER_HORIZONTAL);
            } else if (checkedId == R.id.right) {
                mainLayout.setGravity(Gravity.RIGHT);
            }
        }
    }
}