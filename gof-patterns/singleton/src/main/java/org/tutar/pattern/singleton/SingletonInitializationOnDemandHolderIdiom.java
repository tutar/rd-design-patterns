package org.tutar.pattern.singleton;

/**
 * 利用Java类初始化的LC锁，所有版本的编译器中均可行
 *
 * @see <a href="https://docs.oracle.com/javase/specs/jls/se15/html/jls-12.html">12.4.2. Detailed Initialization Procedure  initialization lock LC</a>
 * @author tutar
 */
public class SingletonInitializationOnDemandHolderIdiom {

    private static class LazyHolder{
        private static final SingletonInitializationOnDemandHolderIdiom INSTANCE
                = new SingletonInitializationOnDemandHolderIdiom();
    }

    public static SingletonInitializationOnDemandHolderIdiom getInstance(){
        return LazyHolder.INSTANCE;
    }
}
