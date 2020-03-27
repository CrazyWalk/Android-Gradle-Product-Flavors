package cn.luyinbros.demo.domain;

import android.util.Log;

import cn.luyinbros.demo.repository.RepositoryFactory;
import cn.luyinbros.demo.repository.RepositoryInstance;

public class DomainFactory {

    public void printInfo() {
        Log.d("DomainFactory","product1");
        RepositoryInstance.get().printInfo();
    }
}
