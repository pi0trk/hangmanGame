package pl.karnas;

import java.util.LinkedList;

import static pl.karnas.GibbetPartsEnum.BODY;
import static pl.karnas.GibbetPartsEnum.GROUND;
import static pl.karnas.GibbetPartsEnum.GIBBET_BASE;
import static pl.karnas.GibbetPartsEnum.GIBBET_TOP;
import static pl.karnas.GibbetPartsEnum.HANDS;
import static pl.karnas.GibbetPartsEnum.HEAD;
import static pl.karnas.GibbetPartsEnum.LEGS;
import static pl.karnas.GibbetPartsEnum.ROPE;

class DrawHangman {


    @Override
    public String toString() {
        return "DrawHangman{}";
    }

    static StringBuilder drawing(int falseAttempts){
        StringBuilder sb = new StringBuilder();
        for (int i = falseAttempts; i >0 ; i--) {
            sb.append(steps.get(i-1));
        }
        return sb;
    }

    private static final LinkedList<GibbetPartsEnum> steps = createLinkedList(GROUND, GIBBET_BASE, LEGS, BODY, HANDS, HEAD, ROPE, GIBBET_TOP);

    private static <T> LinkedList<T> createLinkedList(T...elements) {
        LinkedList<T> newList = new LinkedList<>();
        for (T el : elements) {
            //todo: improve below
            newList.add(el);
        }
        return newList;
    }
}
