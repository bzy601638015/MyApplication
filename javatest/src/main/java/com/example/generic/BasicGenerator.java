package com.example.generic;

/**
 * Created by baozhiyuan on 15/11/28.
 */
public class BasicGenerator<T> implements Generator<T> {

    private Class<T> type;

    public BasicGenerator(Class<T> tClass){
        this.type = tClass;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static <T> Generator<T> create(Class<T> type){
        return new BasicGenerator<T>(type);
    }

    public static void main(String[] args){
        Generator<Latte> generator = BasicGenerator.create(Latte.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(generator.next());
        }
    }

}
