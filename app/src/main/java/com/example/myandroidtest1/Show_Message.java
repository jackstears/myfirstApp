package com.example.myandroidtest1;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.ProgressBar;
import android.widget.TextView;

public class Show_Message extends AppCompatActivity {
    private TextView u_name;
    private TextView u_password;

    private ProgressBar mProgressBar1;
    private ProgressBar mProgressBar2;
    private ProgressBar mProgressBar3;
    private TextView mLifeTV;
    private TextView mAttackTV;
    private TextView mSpeedTV;


    private ProgressBar mProgressBar4;
    private ProgressBar mProgressBar5;
    private ProgressBar mProgressBar6;
    private TextView mBrainTV;
    private TextView mQualityTV;
    private TextView mAbilityTV;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String password = intent.getStringExtra("password");

        u_name = (TextView)findViewById(R.id.u_name);
        u_password = (TextView)findViewById(R.id.u_password);
        u_name.setText("用 户："+name);
        u_password.setText("密 码："+password);

        mLifeTV = (TextView)findViewById(R.id.tv_life_progress);
        mAttackTV = (TextView)findViewById(R.id.tv_attack_progress);
        mSpeedTV = (TextView)findViewById(R.id.tv_speed_progress);

        mBrainTV = (TextView)findViewById(R.id.tv_brain_progress);
        mQualityTV = (TextView)findViewById(R.id.tv_quality_progress);
        mAbilityTV = (TextView)findViewById(R.id.tv_ability_progress);


        initProgress();
    }
    private void initProgress(){
        mProgressBar1 = (ProgressBar)findViewById(R.id.progressBar1);
        mProgressBar2 = (ProgressBar)findViewById(R.id.progressBar2);
        mProgressBar3 = (ProgressBar)findViewById(R.id.progressBar3);
        mProgressBar1.setMax(1000);
        mProgressBar2.setMax(1000);
        mProgressBar3.setMax(1000);



       mProgressBar4 = (ProgressBar)findViewById(R.id.progressBar4);
       mProgressBar4.setMax(100);

        mProgressBar5 = (ProgressBar)findViewById(R.id.progressBar5);
        mProgressBar5.setMax(100);

       mProgressBar6 = (ProgressBar)findViewById(R.id.progressBar6);
       mProgressBar6.setMax(100);
    }

    public void click(View view){
        Intent intent = new Intent(this,Shop_Device.class);
        startActivityForResult(intent,1);
    }


    public void click2(View view){
        Intent intent2 = new Intent(this,For_Study.class);
        startActivityForResult(intent2,1);
    }



    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(data!=null){
            if(requestCode==1){
                if(resultCode==1){
                    ItemInfo info = (ItemInfo)data.getSerializableExtra("equipment");
                    updateProgress(info);

                }else{
                    Subject study = (Subject)data.getSerializableExtra("study");
                    updateProgress2(study);
                }
            }
        }
    }




    private void updateProgress2(Subject study){
        int progress4 = mProgressBar4.getProgress();
        mProgressBar4.setProgress(progress4+study.getBrain());
        mBrainTV.setText(mProgressBar4.getProgress()+"");

        int progress5 = mProgressBar5.getProgress();
        mProgressBar5.setProgress(progress5+study.getQuality());
        mQualityTV.setText(mProgressBar5.getProgress()+"");


        int progress6 = mProgressBar6.getProgress();
        mProgressBar6.setProgress(progress6+study.getAbility());
        mAbilityTV.setText(mProgressBar6.getProgress()+"");



    }






    private void updateProgress(ItemInfo info){
        int progress1 = mProgressBar1.getProgress();
        int progress2 = mProgressBar2.getProgress();
        int progress3 = mProgressBar3.getProgress();
        mProgressBar1.setProgress(progress1+info.getLife());
        mProgressBar2.setProgress(progress2+info.getAcctack());
        mProgressBar3.setProgress(progress3+info.getSpeed());

        mLifeTV.setText(mProgressBar1.getProgress()+"");
        mAttackTV.setText(mProgressBar2.getProgress()+"");
        mSpeedTV.setText(mProgressBar3.getProgress()+"");
    }
}
