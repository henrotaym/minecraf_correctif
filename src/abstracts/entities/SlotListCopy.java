package abstracts.entities;

public abstract class SlotListCopy<S extends Slot> {
    private S[] slots;

    public SlotListCopy(S[] slots){
        this.slots = slots;
    }

    public void print(){
        for (S slot : this.slots){
            System.out.println(slot.display());
        }
    } 
}
