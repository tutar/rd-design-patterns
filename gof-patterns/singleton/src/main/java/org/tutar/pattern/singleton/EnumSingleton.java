package org.tutar.pattern.singleton;

/**
 * 基于Enum的单例实现，参考 Effective Java 2nd Edition (Joshua Bloch)第3条
 * 优点：简单，绝对防止多次实例化，即使面对序列化和反射攻击
 * @author tutar
 */
public enum  EnumSingleton {

    /**
     *
     */
    INSTANCE;

    @Override
    public String toString(){
        return this.getDeclaringClass()+"@"+this.hashCode();
    }
}
