package com.langlab.myapplication11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("res=","230 res="+find(230) / 2);
        Log.d("res=","6000 res="+find(6000) / 2);
        Log.d("res=","20000 res="+find(20000) / 2);
    }

    private int find(int num) {
        int res=0;
        for (int i = 1; i <= num; i++) {
            if (findPairs(i)) {
                res++;
                //Log.d("res=","i="+i+" res="+res);
            }
        }
        return res;
    }

    private boolean findPairs(int num) {
        int res = 0;
        int sum = findDivisors(num);
//Log.d("res=","sum="+sum+" sum2="+findDivisors(sum));
        if (findDivisors(sum) == num && sum != num) {
            Log.d("res=", "num="+num+" sum="+sum);
            return true;
        }
        return false;
    }

    private int findDivisors(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}