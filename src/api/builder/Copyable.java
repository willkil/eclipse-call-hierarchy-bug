package api.builder;

public interface Copyable<I, B extends Builder<I>> {
	B copy();
}
