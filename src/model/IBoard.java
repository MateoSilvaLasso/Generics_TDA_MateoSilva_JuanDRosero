package model;

public interface IBoard<E> {

    public void addElement(E i);

    public int Cardinality();

    public void deleteElement(E i);

    public E search(E i);
}
