package my_spring;

public class RecommendSon extends Recommender{
    @Override
    @Benchmark
    void recommend() {
        System.out.println("Лучше бы не мусорили");
    }
}
