package com.example.mohit.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
    Button button11,button12,button13,button14,button15,button16,button17,button18,button19;
    TextView textView1,textView2,textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.b1);
        button1.setOnClickListener(this);

        button2=findViewById(R.id.b2);
        button2.setOnClickListener(this);

        button3=findViewById(R.id.b3);
        button3.setOnClickListener(this);

        button4=findViewById(R.id.b4);
        button4.setOnClickListener(this);

        button5=findViewById(R.id.b5);
        button5.setOnClickListener(this);

        button6=findViewById(R.id.b6);
        button6.setOnClickListener(this);

        button7=findViewById(R.id.b7);
        button7.setOnClickListener(this);

        button8=findViewById(R.id.b8);
        button8.setOnClickListener(this);

        button9=findViewById(R.id.b9);
        button9.setOnClickListener(this);

        button10=findViewById(R.id.b10);
        button10.setOnClickListener(this);

        button11=findViewById(R.id.b11);
        button11.setOnClickListener(this);

        button12=findViewById(R.id.b12);
        button12.setOnClickListener(this);

        button13=findViewById(R.id.b13);
        button13.setOnClickListener(this);

        button14=findViewById(R.id.b14);
        button14.setOnClickListener(this);

        button15=findViewById(R.id.b15);
        button15.setOnClickListener(this);

        button16=findViewById(R.id.b16);
        button16.setOnClickListener(this);

        button17=findViewById(R.id.b17);
        button17.setOnClickListener(this);

        button18=findViewById(R.id.b18);
        button18.setOnClickListener(this);

        button19=findViewById(R.id.b19);
        button19.setOnClickListener(this);

        textView1=findViewById(R.id.t1);
        textView2=findViewById(R.id.t2);
        textView3=findViewById(R.id.t3);

    }

    int temp=0;

    @Override
    public void onClick(View view)
    {
        if(view==button1||view==button16)
        {
            if(temp==0)
            {
                //Nothing
            }
            else
            {
                if(view==button1)
                {
                    temp=0;
                    textView1.setText("=0");
                    textView1.setVisibility(textView1.GONE);
                    textView2.setText("0");
                    textView3.setText("0");
                    textView3.setVisibility(textView3.INVISIBLE);
                }
                else
                {
                    //TODO Equals to, function
                }
            }
        }
        else if(view==button2||view==button17)
        {
            if(temp==0)
            {
                textView1.setVisibility(view.VISIBLE);
            }
            else
            {
                if(view==button2)
                {
                    String str=giveString(textView2);
                    if(str.length()>1)
                    {
                        rearrange(temp,button2);
                    }
                    else
                    {
                        if(temp==2)
                        {
                            temp=1;
                            textView2.setText(giveString(textView3));
                            textView3.setText("0");
                            textView3.setVisibility(View.INVISIBLE);
                            textView1.setText("="+giveString(textView2));
                        }
                        else
                        {
                            textView2.setText("0");
                            textView1.setText("=0");
                        }
                    }
                }
                else if(view==button17&&temp==1)
                {
                    String str=giveString(textView2);
                    double t=giveDouble(str);
                    t=t/100;
                    textView2.setText(t+"");
                }
            }
        }
        else if(temp==1&&(view==button3||view==button4||view==button8||view==button12))
        {
            temp=2;
            String str=giveString(textView2);
            if(view==button3)
            {
                textView2.setText("/");
            }
            else if(view==button4)
            {
                textView2.setText("*");
            }
            else if(view == button8)
            {
                textView2.setText("-");
            }
            else if(view == button12)
            {
                textView2.setText("+");
            }
            textView3.setVisibility(View.VISIBLE);
            textView3.setText(str+"");
        }
        else
        {
            if(temp==0)
            {
                temp=1;
            }
            //B5 7
            if(view==button5)
            {
                String str=giveString(textView2);
                if(str.equals("0"))
                {
                    textView2.setText("7");
                }
                else
                {
                    textView2.setText(str+"7");
                }
                rearrange(temp,button5);
            }
            //B6 8
            else if(view==button6)
            {
                String str=giveString(textView2);
                if(str.equals("0"))
                {
                    textView2.setText("8");
                }
                else
                {
                    textView2.setText(str+"8");
                }
                rearrange(temp,button6);
            }
            //B7 9
            else if(view==button7)
            {
                String str=giveString(textView2);
                if(str.equals("0"))
                {
                    textView2.setText("9");
                }
                else
                {
                    textView2.setText(str+"9");
                }
                rearrange(temp,button7);
            }

            //B9 4
            else if(view==button9)
            {
                String str=giveString(textView2);
                if(str.equals("0"))
                {
                    textView2.setText("4");
                }
                else
                {
                    textView2.setText(str+"4");
                }
                rearrange(temp,button9);
            }
            //B10 5
            else if(view==button10)
            {
                String str=giveString(textView2);
                if(str.equals("0"))
                {
                    textView2.setText("5");
                }
                else
                {
                    textView2.setText(str+"5");
                }
                rearrange(temp,button10);
            }
            //B11 6
            else if(view==button11)
            {
                String str=giveString(textView2);
                if(str.equals("0"))
                {
                    textView2.setText("6");
                }
                else
                {
                    textView2.setText(str+"6");
                }
                rearrange(temp,button11);
            }

            //B13 1
            else if(view==button13)
            {
                String str=giveString(textView2);
                if(str.equals("0"))
                {
                    textView2.setText("1");
                }
                else
                {
                    textView2.setText(str+"1");
                }
                rearrange(temp,button13);
            }
            //B14 2
            else if(view==button14)
            {
                String str=giveString(textView2);
                if(str.equals("0"))
                {
                    textView2.setText("2");
                }
                else
                {
                    textView2.setText(str+"2");
                }
                rearrange(temp,button14);
            }
            //B15 3
            else if(view==button15)
            {
                String str=giveString(textView2);
                if(str.equals("0"))
                {
                    textView2.setText("3");
                }
                else
                {
                    textView2.setText(str+"3");
                }
                rearrange(temp,button15);
            }
        }
    }
    public void rearrange(int temp,View button)
    {
        if(temp==1)
        {
            String str=giveString(textView2);
            if(button==button5||button==button6||button==button7||button==button9||button==button10
                    ||button==button11||button==button13||button==button14||button==button15)
            {
                textView1.setVisibility(View.VISIBLE);
                textView1.setText("="+str);
            }
            else if(button2==button)
            {
                str=str.substring(0,str.length()-1);
                textView2.setText(str);
                textView1.setText("="+str);
            }
        }
        else if(temp==2)
        {
            if(button2==button)
            {
                String str=giveString(textView2);
                if(str.length()<=2)
                {
                    str = str.substring(0, str.length() - 1);
                    textView2.setText(str);
                    textView1.setText("=" + giveString(textView3));
                    return;
                }
                str=str.substring(0,str.length()-1);
                textView2.setText(str);
            }
            String str1 = giveString(textView3);
            String str2 = giveString(textView2);
            double t1=giveDouble(str1);
            double t2=giveDouble(str2.substring(1));
            double ans;
            if(str2.charAt(0)=='+')
            {
                ans=t1+t2;
            }
            else if(str2.charAt(0)=='-')
            {
                ans=t1-t2;
            }
            else if(str2.charAt(0)=='/')
            {
                ans=t1/t2;
            }
            else
            {
                ans=t1*t2;
            }
            textView1.setText("="+ans+"");
        }
    }

    //Text to String and String to Double
    public String giveString(TextView view)
    {
        return view.getText().toString();
    }
    public Double giveDouble(String str)
    {
        return Double.parseDouble(str);
    }
}