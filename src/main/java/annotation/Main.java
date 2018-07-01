package annotation;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException {
        EntityAnnotationProcessor entityAnnotationProcessor = new EntityAnnotationProcessor();
        entityAnnotationProcessor.process(User.class);
    }
}
