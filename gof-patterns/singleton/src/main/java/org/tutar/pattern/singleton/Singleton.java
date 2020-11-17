package org.tutar.pattern.singleton;

/**
 * 类静态实例保证线程安全
 * @author tutar
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    /**
     * 防止反射调用私有构造器
     */
    private Singleton() {
        if(INSTANCE != null){
            throw new IllegalStateException("Already initialized");
        }
    }

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
