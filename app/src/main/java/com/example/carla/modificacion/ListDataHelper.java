package com.example.carla.modificacion;

import java.util.ArrayList;

public class ListDataHelper {
    public static ArrayList<ListViewItem> provideItems(){
        ArrayList<ListViewItem> list = new ArrayList<>();
        list.add(new ListViewItem(R.drawable.ic_android_black_24dp,android.R.color.holo_blue_bright, "android"));
        list.add(new ListViewItem(R.drawable.ic_call_black_24dp,android.R.color.holo_blue_light, "Llamadas"));
        list.add(new ListViewItem(R.drawable.ic_cast_black_24dp,android.R.color.holo_green_dark, "Cast"));
        list.add(new ListViewItem(R.drawable.ic_cloud_queue_black_24dp,android.R.color.holo_green_light, "Nube"));
        list.add(new ListViewItem(R.drawable.ic_collections_black_24dp, android.R.color.holo_orange_dark,"Fotos"));
        list.add(new ListViewItem(R.drawable.ic_question_answer_black_24dp,android.R.color.holo_purple, "Mensajes Directos"));
        list.add(new ListViewItem(R.drawable.ic_query_builder_black_24dp, android.R.color.holo_red_dark,"Reloj"));
        list.add(new ListViewItem(R.drawable.ic_language_black_24dp, android.R.color.holo_blue_dark,"Internet"));
        list.add(new ListViewItem(R.drawable.ic_cloud_queue_black_24dp,android.R.color.holo_blue_bright,"Nube"));

        return list;
    }
}
