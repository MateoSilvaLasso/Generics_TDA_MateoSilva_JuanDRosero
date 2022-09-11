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

    public void addElement(T p){
        this.set.add(p);
    }

    public int Cardinality(){
        int count=0;
      for(T player: set){
          count++;
      }

      return count;
    }

    public void deleteElement(T p){
        set.remove(p);
        return;
    }

    public T search(T p){
        T a=null;
        for(T sets: set){
            if(sets==p){
                a=sets;
                break;
            }
        }
        return a;
    }


}
