package com.skwaweru254;

public class GenericsClass<T> {

    //private variable of type T
    private T data;

    public GenericsClass(T data){
        this.data=data;

    }

    //method that return T type variable
    public T getData(){

        return this.data;
    }
}
