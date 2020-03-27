package cn.luyinbros.demo.repository;

public class RepositoryInstance {

    public static RepositoryFactory get() {
        return new RepositoryFactory();
    }
}
