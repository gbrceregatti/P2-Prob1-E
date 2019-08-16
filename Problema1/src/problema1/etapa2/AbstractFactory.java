package problema1.etapa2;

/**
 *
 * @author heichstadt
 */
public interface AbstractFactory<T> {
    T create(String type);
}
