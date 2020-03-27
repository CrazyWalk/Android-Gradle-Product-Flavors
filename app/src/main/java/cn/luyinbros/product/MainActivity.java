package cn.luyinbros.product;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cn.luyinbros.demo.domain.DomainInstance;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DomainInstance.get().printInfo();

    }
}
