package org.tutar.pattern.singleton;

/**
 * 双重校验所保证线程安全
 * @author tutar
 */
public class SingletonDoubleCheckLockThreadSafe {

    private static volatile SingletonDoubleCheckLockThreadSafe instance;

    private SingletonDoubleCheckLockThreadSafe(){
        if(instance==null){
            instance = this;
        }else{
            throw new IllegalStateException("Already initialized");
        }
    }

    public static SingletonDoubleCheckLockThreadSafe getInstance(){

        if(instance == null){
            synchronized(SingletonDoubleCheckLockThreadSafe.class){
                if(instance==null){
                    instance = new SingletonDoubleCheckLockThreadSafe();
                }
            }
        }
        return instance;
    }
}
