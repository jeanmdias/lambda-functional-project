package lambda;

@FunctionalInterface
public interface Validator<T> {
	
	boolean check(T t);
	
}
