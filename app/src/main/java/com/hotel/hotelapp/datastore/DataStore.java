package com.hotel.hotelapp.datastore;

import android.util.SparseArray;

public final class DataStore {
    private DataStore() {
    }

    public static SparseArray<Menus> populateData() {
        SparseArray<Menus> list = new SparseArray<>();
        String[] titles = {"Guac de la Costa", "Chincharron y Cerveza", "Daurade Inka",
                "Chilitos con Canveda"};
        String[] descriptions =
                {"tortillas de mais, fruit de la passion, mango", "citron vert / Corona sauce",
                        "leche de tigre, patate douce, chulpe", "padrones tempura, gambas"};
        int[] rates = {7, 12, 32, 41};
        boolean[] isNonVeg = {true, false, true, true};
        boolean[] isDining = {false, true, true, false};
        for (int i = 0; i < 4; i++) {
            Menus menu = new Menus();
            menu.setTitle(titles[i]);
            menu.setDescription(descriptions[i]);
            menu.setRate(rates[i]);
            menu.setDining(isDining[i]);
            menu.setNonVeg(isNonVeg[i]);

            list.put(i, menu);
        }

        return list;
    }
}
