package model;

public interface IBoard<E> {

    public boolean addElement(E i);

    public int Cardinality();

    public String showElements();

    public boolean empty();
}
