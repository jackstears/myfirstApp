package com.example.myandroidtest1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Shop_Device extends AppCompatActivity implements View.OnClickListener {
    private ItemInfo itemInfo;
    private ItemInfo itemInfo2;
    private ItemInfo itemInfo3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_device);

        // 初始化 装备属性
        itemInfo = new ItemInfo("金剑",100,20,20);
        itemInfo2 = new ItemInfo("宝马",50,10,180);
        itemInfo3 = new ItemInfo("小侍女",20,50,30);

        // 设置点击监听
        findViewById(R.id.rl).setOnClickListener(this);

        // 获取界面元素
        TextView mLifeTV = (TextView)findViewById(R.id.tv_life);
        TextView mNameTV = (TextView)findViewById(R.id.tv_name);
        TextView mAttackTV = (TextView)findViewById(R.id.tv_attack);
        TextView mSpeedTV = (TextView)findViewById(R.id.tv_speed);

        // 界面设值
        mLifeTV.setText("生命值+"+itemInfo.getLife());
        mNameTV.setText(itemInfo.getName()+" ");
        mSpeedTV.setText("敏捷度+"+itemInfo.getSpeed());
        mAttackTV.setText("攻击力+"+itemInfo.getAcctack());



        // 设置点击监听
        findViewById(R.id.bmw).setOnClickListener(this);
        TextView mLifeTV2 = (TextView)findViewById(R.id.tv_life2);
        TextView mNameTV2 = (TextView)findViewById(R.id.tv_name2);
        TextView mAttackTV2 = (TextView)findViewById(R.id.tv_attack2);
        TextView mSpeedTV2 = (TextView)findViewById(R.id.tv_speed2);
        mLifeTV2.setText("生命值+"+itemInfo2.getLife());
        mNameTV2.setText(itemInfo2.getName()+" ");
        mSpeedTV2.setText("敏捷度+"+itemInfo2.getSpeed());
        mAttackTV2.setText("攻击力+"+itemInfo2.getAcctack());


        // 设置点击监听
        findViewById(R.id.girl).setOnClickListener(this);
        TextView mLifeTV3 = (TextView)findViewById(R.id.tv_life3);
        TextView mNameTV3 = (TextView)findViewById(R.id.tv_name3);
        TextView mAttackTV3 = (TextView)findViewById(R.id.tv_attack3);
        TextView mSpeedTV3 = (TextView)findViewById(R.id.tv_speed3);
        mLifeTV3.setText("生命值+"+itemInfo3.getLife());
        mNameTV3.setText(itemInfo3.getName()+" ");
        mSpeedTV3.setText("敏捷度+"+itemInfo3.getSpeed());
        mAttackTV3.setText("攻击力+"+itemInfo3.getAcctack());



    }

    @Override
    public void onClick(View v) {
        // 获取intent
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.rl:
                // 存放序列化后的装备对象
                intent.putExtra("equipment",itemInfo);
                // 返回结果码和intent
                setResult(1,intent);
                // 关闭该界面
                finish();
                // 退出选择
                break;
            case R.id.bmw:
                // 存放序列化后的装备对象
                intent.putExtra("equipment",itemInfo2);
                // 返回结果码和intent
                setResult(1,intent);
                // 关闭该界面
                finish();
                // 退出选择
                break;
            case R.id.girl:
                // 存放序列化后的装备对象
                intent.putExtra("equipment",itemInfo3);
                // 返回结果码和intent
                setResult(1,intent);
                // 关闭该界面
                finish();
                // 退出选择
                break;
        }
    }
}
