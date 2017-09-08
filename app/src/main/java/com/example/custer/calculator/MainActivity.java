package com.example.custer.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /**
     * 数字
     */
    private Button num0;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    /**
     * 运算符
     */
    private Button plus_btn;
    private Button subtract_btn;
    private Button multiply_btn;
    private Button divide_btn;
    private Button equal_btn;
    /**
     * 其他
     */
    private Button dot_btn;
    private Button percent_btn;
    private Button delete_btn;
    private Button ac_btn;

    /**
     * 结果框
     */
    private EditText result_text;

    /**
     * 暂时存储
     */
    private String existedText="";

    /**
     * 小数点是否存在
     */
    private boolean hasdot=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_btn();

    }
    private void init_btn(){
        num0=(Button) findViewById(R.id.num_0);
        num1=(Button) findViewById(R.id.num_1);
        num2=(Button) findViewById(R.id.num_2);
        num3=(Button) findViewById(R.id.num_3);
        num4=(Button) findViewById(R.id.num_4);
        num5=(Button) findViewById(R.id.num_5);
        num6=(Button) findViewById(R.id.num_6);
        num7=(Button) findViewById(R.id.num_7);
        num8=(Button) findViewById(R.id.num_8);
        num9=(Button) findViewById(R.id.num_9);

        ac_btn=(Button) findViewById(R.id.ac_btn);
        delete_btn=(Button) findViewById(R.id.delete_btn);
        dot_btn=(Button) findViewById(R.id.dot_btn);

        result_text=(EditText) findViewById(R.id.result_text);

        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        ac_btn.setOnClickListener(this);
        delete_btn.setOnClickListener(this);
        dot_btn.setOnClickListener(this);
    }
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.num_0:
                result_text.setText(Handle(existedText,"0"));
                break;
            case R.id.num_1:
                result_text.setText(Handle(existedText,"1"));
                break;
            case R.id.num_2:
                result_text.setText(Handle(existedText,"2"));
                break;
            case R.id.num_3:
                result_text.setText(Handle(existedText,"3"));
                break;
            case R.id.num_4:
                result_text.setText(Handle(existedText,"4"));
                break;
            case R.id.num_5:
                result_text.setText(Handle(existedText,"5"));
                break;
            case R.id.num_6:
                result_text.setText(Handle(existedText,"6"));
                break;
            case R.id.num_7:
                result_text.setText(Handle(existedText,"7"));
                break;
            case R.id.num_8:
                result_text.setText(Handle(existedText,"8"));
                break;
            case R.id.num_9:
                result_text.setText(Handle(existedText,"9"));
                break;
            case R.id.dot_btn:
                if(!hasdot) {
                    result_text.setText(Handle(existedText, "."));
                    hasdot=true;
                }
                break;
            case R.id.ac_btn:
                existedText="";
                result_text.setText("0");
                break;
            case R.id.delete_btn:
                if(existedText.length()>1) {
                    existedText = existedText.substring(0, existedText.length() - 1);
                    result_text.setText(existedText);
                }
                else{
                    existedText="";
                    result_text.setText("0");
                }
                break;
            default:
        }

    }
    private String Handle(String yy,String s){
        if(yy==""){
            existedText=s;
        }
        else{
            if(yy.length()<9) {
                existedText = existedText + s;
            }
        }
        return existedText;
    }
//    private String Handles(String yy,String s){
//
//    }
}