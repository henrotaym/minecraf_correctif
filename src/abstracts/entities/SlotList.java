package abstracts.entities;

public abstract class SlotList<S extends Slot> {
    private S[] slots;

    public SlotList(S[] slots){
        this.slots = slots;
    }

    public void print(){
        for (S slot : this.slots){
            System.out.println(slot.display());
        }
    } 
}
