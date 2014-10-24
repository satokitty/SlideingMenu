package info.androidhive.slidingmenu.listener;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import info.androidhive.slidingmenu.R;
import info.androidhive.slidingmenu.TodoListFragment;
import info.androidhive.slidingmenu.adapter.TaskItemListAdapter;

/**
 * Created by fukuokak on 2014/10/24.
 */
public class ToDoListFragmentButtonListener implements View.OnClickListener{
    private Activity activity;
    public ToDoListFragmentButtonListener(Activity activity){
        this.activity = activity ;
    }
    @Override
    public void onClick(View v) {

        String[] members =  { "1","2" } ;

        ListView toDoList =  (ListView)activity.findViewById(R.id.toDoListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(activity.getApplicationContext(),
                    android.R.layout.simple_expandable_list_item_1, members);
        toDoList.setAdapter(adapter);

    }

}
