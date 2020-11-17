package org.tutar.pattern.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 单例：一个类只有一实例，并提供全局访问点
 *
 * @author tutar
 */
public class SingletonApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(SingletonApp.class);

    public static void main(String[] args){
        //类静态实例方法
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        LOGGER.info("\nsingleton1:{},\nsingleton2:{}",singleton1,singleton2);



        // double check lock
        SingletonDoubleCheckLockThreadSafe dcSingle1 = SingletonDoubleCheckLockThreadSafe.getInstance();
        SingletonDoubleCheckLockThreadSafe dcSingle2= SingletonDoubleCheckLockThreadSafe.getInstance();
        LOGGER.info("\ndcSingle1:{},\ndcSingle2=:{}", dcSingle1,dcSingle2);

        // DemandHolderIdiom single
        SingletonInitializationOnDemandHolderIdiom demandHolderSingleton1 = SingletonInitializationOnDemandHolderIdiom.getInstance();
        SingletonInitializationOnDemandHolderIdiom demandHolderSingleton2 = SingletonInitializationOnDemandHolderIdiom.getInstance();
        LOGGER.info("\ndemandHolderSingleton1:{},\ndemandHolderSingleton2=:{}", demandHolderSingleton1,demandHolderSingleton2);

        // enum singleton
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        LOGGER.info("\nenumSingleton1:{},\nenumSingleton2=:{}", enumSingleton1,enumSingleton2);
    }
}
