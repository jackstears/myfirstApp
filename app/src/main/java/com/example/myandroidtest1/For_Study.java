package com.example.myandroidtest1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class For_Study extends AppCompatActivity implements View.OnClickListener{
    private Subject study;
    private Subject study2;
    private Subject study3;
    private Subject study4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_study);

        // 初始化 科目
         study = new Subject("英语","每天学十个单词",2,3,5);
         study2 = new Subject("数学","每天学一个小节",5,2,5);
         study3 = new Subject("语文","每天背一首古诗",1,4,5);
         study4 = new Subject("政治","每天背一个小节",3,3,5);

        // 设置点击监听
        TextView mNameTV = (TextView)findViewById(R.id.st_name);
        TextView mContentTV = (TextView)findViewById(R.id.st_content);
        findViewById(R.id.english).setOnClickListener(this);
        TextView mBrainTV = (TextView)findViewById(R.id.tv_brain);
        TextView mQualityTV = (TextView)findViewById(R.id.tv_quality);
        TextView mAbilityTV = (TextView)findViewById(R.id.tv_ability);

        mNameTV.setText(study.getName()+" ");
        mContentTV.setText(study.getContent());
        mBrainTV.setText("智 力+"+study.getBrain());
        mQualityTV.setText("品 质+"+study.getQuality());
        mAbilityTV.setText("能 力+"+study.getAbility());


        // 设置点击监听
        TextView mName2TV = (TextView)findViewById(R.id.st_name2);
        TextView mContent2TV = (TextView)findViewById(R.id.st_content2);
        findViewById(R.id.math).setOnClickListener(this);
        TextView mBrain2TV = (TextView)findViewById(R.id.tv_brain2);
        TextView mQuality2TV = (TextView)findViewById(R.id.tv_quality2);
        TextView mAbility2TV = (TextView)findViewById(R.id.tv_ability2);

        mName2TV.setText(study2.getName()+" ");
        mContent2TV.setText(study2.getContent());
        mBrain2TV.setText("智 力+"+study2.getBrain());
        mQuality2TV.setText("品 质+"+study2.getQuality());
        mAbility2TV.setText("能 力+"+study2.getAbility());


        // 设置点击监听
        TextView mName3TV = (TextView)findViewById(R.id.st_name3);
        TextView mContent3TV = (TextView)findViewById(R.id.st_content3);
        findViewById(R.id.china).setOnClickListener(this);
        TextView mBrain3TV = (TextView)findViewById(R.id.tv_brain3);
        TextView mQuality3TV = (TextView)findViewById(R.id.tv_quality3);
        TextView mAbility3TV = (TextView)findViewById(R.id.tv_ability3);

        mName3TV.setText(study3.getName()+" ");
        mContent3TV.setText(study3.getContent());
        mBrain3TV.setText("智 力+"+study3.getBrain());
        mQuality3TV.setText("品 质+"+study3.getQuality());
        mAbility3TV.setText("能 力+"+study3.getAbility());



        // 设置点击监听
        TextView mName4TV = (TextView)findViewById(R.id.st_name4);
        TextView mContent4TV = (TextView)findViewById(R.id.st_content4);
        findViewById(R.id.politics).setOnClickListener(this);
        TextView mBrain4TV = (TextView)findViewById(R.id.tv_brain4);
        TextView mQuality4TV = (TextView)findViewById(R.id.tv_quality4);
        TextView mAbility4TV = (TextView)findViewById(R.id.tv_ability4);

        mName4TV.setText(study4.getName()+" ");
        mContent4TV.setText(study4.getContent());
        mBrain4TV.setText("智 力+"+study4.getBrain());
        mQuality4TV.setText("品 质+"+study4.getQuality());
        mAbility4TV.setText("能 力+"+study4.getAbility());

    }

    @Override
    public void onClick(View v) {
        // 获取intent
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.english:
                // 存放序列化后的装备对象
                intent.putExtra("study",study);
                // 返回结果码和intent
                setResult(2,intent);
                // 关闭该界面
                finish();
                // 退出选择
                break;
            case R.id.math:
                // 存放序列化后的装备对象
                intent.putExtra("study",study2);
                // 返回结果码和intent
                setResult(2,intent);
                // 关闭该界面
                finish();
                // 退出选择
                break;
            case R.id.china:
                // 存放序列化后的装备对象
                intent.putExtra("study",study3);
                // 返回结果码和intent
                setResult(2,intent);
                // 关闭该界面
                finish();
                // 退出选择
                break;
            case R.id.politics:
                // 存放序列化后的装备对象
                intent.putExtra("study",study4);
                // 返回结果码和intent
                setResult(2,intent);
                // 关闭该界面
                finish();
                // 退出选择
                break;
        }
    }
    }

