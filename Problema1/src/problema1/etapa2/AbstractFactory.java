package problema1.etapa2;

public interface AbstractFactory<T> {
    T create(String type);
}
