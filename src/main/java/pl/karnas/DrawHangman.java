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
        for (int i = 0; i< falseAttempts; i++) {
            sb.append(steps.get(i));
        }
        return sb;
    }

    private static final LinkedList<GibbetPartsEnum> steps = createLinkedList(GIBBET_TOP, ROPE, HEAD, HANDS, BODY, LEGS, GIBBET_BASE , GROUND);

    private static <T> LinkedList<T> createLinkedList(T...elements) {
        LinkedList<T> newList = new LinkedList<>();
        for (T el : elements) {
            //todo: improve below
            newList.add(el);
        }
        return newList;
    }
}
