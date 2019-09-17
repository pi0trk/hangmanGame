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


    static StringBuilder drawing(int falseAttempts){
        StringBuilder sb = new StringBuilder();
        for (int i = falseAttempts; i >0 ; i--) {
            sb.append(steps.get(i));
        }
        return sb;
    }


    //static LinkedList<GibbetPartsEnum> steps = createLinkedList(GIBBET_TOP, ROPE, HEAD, HANDS, BODY, LEGS, GIBBET_BASE, GROUND);
    static LinkedList<GibbetPartsEnum> steps = createLinkedList(GROUND, GIBBET_BASE, LEGS, BODY, HANDS, HEAD, ROPE, GIBBET_TOP);


    private static <T> LinkedList<T> createLinkedList(T...elements) {
        LinkedList<T> newList = new LinkedList<T>();
        for (T el : elements) {
            newList.add(el);
        }
        return newList;
    }

//        for (Integer item : a) {
//        System.out.println(item);
//    }
//
//    String drawing(int falseAttempts){
//        gibbet.add()
//        return "";
//    }


}
