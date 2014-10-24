package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

import info.androidhive.slidingmenu.adapter.TaskItemListAdapter;
import info.androidhive.slidingmenu.listener.ToDoListFragmentButtonListener;
import info.androidhive.slidingmenu.listener.toDoListItemOnItemClickListener;
import info.androidhive.slidingmenu.model.TaskItem;

/**
 * Created by fukuokak on 2014/10/24.
 */
public class TodoListFragment extends Fragment {
    ListView toDoList;
    View rootView;

    public TodoListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_todo, container, false);
        ImageButton addButton = (ImageButton) rootView.findViewById(R.id.addButton);
        addButton.setOnClickListener(new ToDoListFragmentButtonListener(getActivity()));

        toDoList = (ListView) rootView.findViewById(R.id.toDoListView);
        toDoList.setOnItemClickListener(new toDoListItemOnItemClickListener());

        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        toDoList = (ListView) rootView.findViewById(R.id.toDoListView);

        toDoList.setAdapter(setInitialTaskItemAdapter());

    }

    public TaskItemListAdapter setInitialTaskItemAdapter() {
        ArrayList<TaskItem> taskItemArrayList = new ArrayList<TaskItem>();
        TaskItem ti1 = new TaskItem("12/24", 1, "睡眠", TaskItem.TASK_INTERVAL_DAILY, "00:00");
        TaskItem ti2 = new TaskItem("12/24", 2, "メリークリスマス", TaskItem.TASK_INTERVAL_YEARLY, "12:00");
        taskItemArrayList.add(ti1);
        taskItemArrayList.add(ti2);

        TaskItemListAdapter todoAdapter = new TaskItemListAdapter(getActivity().getApplicationContext(),
                taskItemArrayList);
        return todoAdapter;
    }
}
