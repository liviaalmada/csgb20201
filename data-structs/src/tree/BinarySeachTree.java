package tree;

public interface BinarySeachTree {
	Node getRoot();
	Node search(int value);
	boolean insert(int value);
	Node searchAndRemove(int value);
}
