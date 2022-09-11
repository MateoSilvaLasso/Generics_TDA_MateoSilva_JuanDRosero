package model;

import java.util.HashSet;
import java.util.Set;
public class board<T> implements IBoard<T>{

    private Set<T> set;

    public board() {
        this.set = new HashSet<>();
    }

    public board(Set<T> all) {
        this.set = all;
    }

    public boolean addElement(T p){
       return this.set.add(p);
    }

    public int Cardinality(){
        int count=0;
      for(T s: set){
          count++;
      }

      return count;
    }

    public String showElements(){
       String out="";
       for(T s: set){
           out+= s.toString() + "\n";
       }

       return out;
    }

    public boolean empty(){

        return set.isEmpty();
    }


}
