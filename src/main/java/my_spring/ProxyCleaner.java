package my_spring;

public class ProxyCleaner implements Cleaner{
    @Override
    public void clean() {
        Cleaner cleaner = ObjectFactory.getInstance().createObject(CleanerImpl.class);
        long start = (int) System.nanoTime();
        cleaner.clean();
        long end = (int) System.nanoTime();
        System.out.println(end - start);
    }
}
