package com.example.terraformingmars_support;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView money, wood, titanium, plant, electric, heat;
    private Button money_increase, money_reduce, wood_increase, wood_reduce, titanium_increase, titanium_reduce, plant_increase, plant_reduce, electric_increase, electric_reduce, heat_increase, heat_reduce;
    private int money_value, wood_value, titanium_value, plant_value, electric_value, heat_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        money = findViewById(R.id.money_value);
        money_increase = findViewById(R.id.money_increase);
        money_reduce = findViewById(R.id.money_reduce);
        wood = findViewById(R.id.wood_value);
        wood_increase = findViewById(R.id.wood_increase);
        wood_reduce = findViewById(R.id.wood_reduce);
        titanium = findViewById(R.id.titanium_value);
        titanium_increase = findViewById(R.id.titanium_increase);
        titanium_reduce = findViewById(R.id.titanium_reduce);
        plant = findViewById(R.id.plant_value);
        plant_increase = findViewById(R.id.plant_increase);
        plant_reduce = findViewById(R.id.plant_reduce);
        electric = findViewById(R.id.electric_value);
        electric_increase = findViewById(R.id.electric_increase);
        electric_reduce = findViewById(R.id.electric_reduce);
        heat = findViewById(R.id.heat_value);
        heat_increase = findViewById(R.id.heat_increase);
        heat_reduce = findViewById(R.id.heat_reduce);

        //効果音の設定
        SoundPool SE = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        int SoundId_kati = SE.load(this, R.raw.kati,1);
        int SoundId_teretere = SE.load(this, R.raw.teretere,1);

        //各ボタンを押した際の動作設定
        money_increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                money_value = Integer.parseInt(money.getText().toString())+1;
                money.setText(String.valueOf(money_value));

                //効果音を再生
                SE.play(SoundId_kati, 1.0f, 1.0f, 0, 0, 1);
            }
        });
        money_reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                if(money_value >= -4) {
                    money_value = Integer.parseInt(money.getText().toString())-1;
                    money.setText(String.valueOf(money_value));

                    //効果音を再生
                    SE.play(SoundId_kati, 1.0f, 1.0f, 0, 0, 1);
                }else {
                    SE.play(SoundId_teretere, 1.0f, 1.0f, 0, 0, 1);
                }
            }
        });

        wood_increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                wood_value = Integer.parseInt(wood.getText().toString())+1;
                wood.setText(String.valueOf(wood_value));

                //効果音を再生
                SE.play(SoundId_kati, 1.0f, 1.0f, 0, 0, 1);
            }
        });
        wood_reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                if(wood_value >= 1) {
                    wood_value = Integer.parseInt(wood.getText().toString())-1;
                    wood.setText(String.valueOf(wood_value));

                    //効果音を再生
                    SE.play(SoundId_kati, 1.0f, 1.0f, 0, 0, 1);
                }else {
                    SE.play(SoundId_teretere, 1.0f, 1.0f, 0, 0, 1);
                }
            }
        });

        titanium_increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                titanium_value = Integer.parseInt(titanium.getText().toString())+1;
                titanium.setText(String.valueOf(titanium_value));

                //効果音を再生
                SE.play(SoundId_kati, 1.0f, 1.0f, 0, 0, 1);
            }
        });
        titanium_reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                if(titanium_value >= 1) {
                    titanium_value = Integer.parseInt(titanium.getText().toString())-1;
                    titanium.setText(String.valueOf(titanium_value));

                    //効果音を再生
                    SE.play(SoundId_kati, 1.0f, 1.0f, 0, 0, 1);
                }else {
                    SE.play(SoundId_teretere, 1.0f, 1.0f, 0, 0, 1);
                }
            }
        });

        plant_increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                plant_value = Integer.parseInt(plant.getText().toString())+1;
                plant.setText(String.valueOf(plant_value));

                //効果音を再生
                SE.play(SoundId_kati, 1.0f, 1.0f, 0, 0, 1);
            }
        });
        plant_reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                if(plant_value >= 1) {
                    plant_value = Integer.parseInt(plant.getText().toString())-1;
                    plant.setText(String.valueOf(plant_value));

                    //効果音を再生
                    SE.play(SoundId_kati, 1.0f, 1.0f, 0, 0, 1);
                }else {
                    SE.play(SoundId_teretere, 1.0f, 1.0f, 0, 0, 1);
                }
            }
        });

        electric_increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                electric_value = Integer.parseInt(electric.getText().toString())+1;
                electric.setText(String.valueOf(electric_value));

                //効果音を再生
                SE.play(SoundId_kati, 1.0f, 1.0f, 0, 0, 1);
            }
        });
        electric_reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                if(electric_value >= 1) {
                    electric_value = Integer.parseInt(electric.getText().toString())-1;
                    electric.setText(String.valueOf(electric_value));

                    //効果音を再生
                    SE.play(SoundId_kati, 1.0f, 1.0f, 0, 0, 1);
                }else {
                    SE.play(SoundId_teretere, 1.0f, 1.0f, 0, 0, 1);
                }
            }
        });

        heat_increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                heat_value = Integer.parseInt(heat.getText().toString())+1;
                heat.setText(String.valueOf(heat_value));

                //効果音を再生
                SE.play(SoundId_kati, 1.0f, 1.0f, 0, 0, 1);
            }
        });
        heat_reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                if(heat_value >= 1) {
                    heat_value = Integer.parseInt(heat.getText().toString())-1;
                    heat.setText(String.valueOf(heat_value));

                    //効果音を再生
                    SE.play(SoundId_kati, 1.0f, 1.0f, 0, 0, 1);
                }else {
                    SE.play(SoundId_teretere, 1.0f, 1.0f, 0, 0, 1);
                }
            }
        });


    }
}