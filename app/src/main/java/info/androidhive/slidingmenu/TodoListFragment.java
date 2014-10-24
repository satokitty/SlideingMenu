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

import info.androidhive.slidingmenu.listener.ToDoListFragmentButtonListener;
import info.androidhive.slidingmenu.listener.toDoListItemOnItemClickListener;

/**
 * Created by fukuokak on 2014/10/24.
 */
public class TodoListFragment extends Fragment{
    ListView toDoList ;
    View rootView ;

    public TodoListFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_todo, container, false);
        ImageButton addButton = (ImageButton)rootView.findViewById(R.id.addButton);
        addButton.setOnClickListener(new ToDoListFragmentButtonListener(getActivity()));

        toDoList = (ListView)rootView.findViewById(R.id.toDoListView);
        toDoList.setOnItemClickListener(new toDoListItemOnItemClickListener());

        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        String[] members = { "mhidaka", "rongon_xp", "kacchi0516", "kobashinG",
                "seit", "kei_i_t", "furusin_oriver" };

        toDoList = (ListView)rootView.findViewById(R.id.toDoListView);

        Bundle bundle =getArguments();
        if (bundle != null){
            members = bundle.getStringArray("toDoList");
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_expandable_list_item_1, members);

        toDoList.setAdapter(adapter);

    }
}
