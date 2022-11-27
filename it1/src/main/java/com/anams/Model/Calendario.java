package com.anams.Model;

import java.util.List;

public class Calendario {
    private int id;
    private List<Slot> slots;

    private static int contador = 0;

    public Calendario(){
        setId(++contador);
        setSlots(null);
    }

    public Calendario(List<Slot> slots){
        setId(++contador);
        setSlots(slots);
    }

    private void setId(int id) { this.id = id; }

    public int getId() { return this.id; }

    public void setSlot(Slot slot) { this.slots.add(slot); }

    public void setSlots(List<Slot> slots) { this.slots = slots; }

    public List<Slot> getSlots() { return this.slots; }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tCódigo -> ");
        sb.append(this.id);
        sb.append("\n\tMarcações -> ");
        for(Slot s : slots){
            sb.append(s);
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object outro) {
        if(this == outro) {
            return true;
        }
        if(outro == null || this.getClass() != outro.getClass()) {
            return false;
        }
        Calendario obj = (Calendario) outro;
        return this.id == obj.id
                && this.slots.equals(obj.slots);
    }

}
