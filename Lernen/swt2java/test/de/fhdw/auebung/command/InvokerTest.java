package de.fhdw.auebung.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvokerTest {
    @Test
    void test(){
        Item schwert1 = new Item("Blutfeuer", 50);
        Item schwert2 = new Item("Laubklinge", 80);

        Invoker schwertInvoker = new Invoker();

        String name1 = "Herbstblatt0";
        String name2 = "Herbstblatt1";
        String name3 = "Herbstblatt2";
        String name4 = "Herbstblatt3";
        String name5 = "Herbstblatt4";

        ItemHitPointEvent hpEvent = new ItemHitPointEvent(schwert1);
        ItemNameEvent nEvent = new ItemNameEvent(schwert2);



        schwertInvoker.execute(hpEvent);
        assertEquals(55, schwert1.getDmg());

        schwertInvoker.execute(hpEvent);
        assertEquals(60, schwert1.getDmg());

        schwertInvoker.execute(hpEvent);
        assertEquals(65, schwert1.getDmg());

        schwertInvoker.execute(hpEvent);
        assertEquals(70, schwert1.getDmg());

        schwertInvoker.undo(hpEvent);
        assertEquals(65, schwert1.getDmg());

        schwertInvoker.undo(hpEvent);
        assertEquals(60, schwert1.getDmg());

        schwertInvoker.undo(hpEvent);
        assertEquals(55, schwert1.getDmg());

        schwertInvoker.redo(hpEvent);
        assertEquals(60, schwert1.getDmg());

        schwertInvoker.execute(hpEvent);
        assertEquals(65, schwert1.getDmg());

        schwertInvoker.undo(hpEvent);
        assertEquals(60, schwert1.getDmg());

        schwertInvoker.undo(hpEvent);
        assertNotEquals(55, schwert1.getDmg());



        schwertInvoker.execute(nEvent);
        schwertInvoker.setName(nEvent, name1);
        assertEquals(name1, schwert2.getName());

        schwertInvoker.execute(nEvent);
        schwertInvoker.setName(nEvent, name2);
        assertEquals(name2, schwert2.getName());

        schwertInvoker.execute(nEvent);
        schwertInvoker.setName(nEvent, name3);
        assertEquals(name3, schwert2.getName());

        schwertInvoker.undo(nEvent);
        schwertInvoker.setName(nEvent, name4);
        assertEquals(name4, schwert2.getName());

        schwertInvoker.redo(nEvent);
        schwertInvoker.setName(nEvent, name5);
        assertEquals(name5, schwert2.getName());
    }

}