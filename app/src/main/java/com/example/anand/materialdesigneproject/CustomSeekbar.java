package com.example.anand.materialdesigneproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;

import android.widget.Toast;

import com.rey.material.widget.Slider;
import com.rey.material.widget.Switch;

/**
 * Created by anand on 31/7/16.
 */
public class CustomSeekbar  extends Activity {
    Switch customSwitch;
    Slider customSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_seekbar);
        customSwitch = (Switch) findViewById(R.id.switch_control);
        customSlider=(Slider)findViewById(R.id.custom_slider);
        customSwitch.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(Switch view, boolean checked) {
                String mchecked;
                if (checked == true) {
                    mchecked = "selected for true";
                } else {
                    mchecked = "Selected for false";

                }
                Toast.makeText(getApplicationContext(), mchecked, Toast.LENGTH_LONG).show();

            }
        });

        customSlider.setOnPositionChangeListener(new Slider.OnPositionChangeListener() {
            @Override
            public void onPositionChanged(Slider view, boolean fromUser, float oldPos, float newPos, int oldValue, int newValue) {
                //Toast.makeText(getApplicationContext(),String.valueOf(newValue),Toast.LENGTH_LONG).show();
            }
        });

    }

}


