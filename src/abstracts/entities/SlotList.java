package abstracts.entities;

import java.util.List;

public abstract class SlotList<S extends Slot> {
    private List<S> slots;

    public SlotList(List<S> slots){
        this.slots = slots;
    }

    public void print(){
        for (S slot : this.slots){
            System.out.println(slot.display());
        }
    } 
}
