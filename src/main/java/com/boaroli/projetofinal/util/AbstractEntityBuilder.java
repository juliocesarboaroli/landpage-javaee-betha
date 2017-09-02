package com.boaroli.projetofinal.util;

public abstract class AbstractEntityBuilder<T, B extends AbstractEntityBuilder> {
    protected T entity;
    
    public AbstractEntityBuilder(T entity) {
        this.entity = entity;
    }
    
    public T build() {
        return entity;
    }
}
