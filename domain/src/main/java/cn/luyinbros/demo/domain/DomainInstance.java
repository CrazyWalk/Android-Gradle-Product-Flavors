package cn.luyinbros.demo.domain;

import cn.luyinbros.demo.repository.RepositoryFactory;

public class DomainInstance {

    public static cn.luyinbros.demo.domain.DomainFactory get() {
        return new cn.luyinbros.demo.domain.DomainFactory();
    }


}
