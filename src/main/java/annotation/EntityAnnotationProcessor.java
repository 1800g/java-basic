package annotation;

import java.lang.reflect.Field;

public class EntityAnnotationProcessor {

    private String tableName;
    private String primaryKey;

    public void process(Class<?> clazz) throws NoSuchFieldException {
        Table table = clazz.getAnnotation(Table.class);
        System.out.println("select * from "+table.name());
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field:declaredFields){
            field.setAccessible(true);
        }
    }
}
