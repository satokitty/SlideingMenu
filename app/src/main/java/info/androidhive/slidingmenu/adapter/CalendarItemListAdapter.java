package info.androidhive.slidingmenu.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import info.androidhive.slidingmenu.R;
import info.androidhive.slidingmenu.model.CalendarItem;

/**
 * Created by fukuokak on 2014/10/24.
 */
public class CalendarItemListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<CalendarItem> calendarItems;

    public CalendarItemListAdapter(Context context, ArrayList<CalendarItem> calendarItems){
        this.context = context;
        this.calendarItems = calendarItems;
    }
    @Override
    public int getCount() {
        return calendarItems.size();
    }

    @Override
        public Object getItem(int position) {
            return calendarItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.drawer_list_item, null);
        }

//        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.icon);
//        TextView txtTitle = (TextView) convertView.findViewById(R.id.title);
//        TextView txtCount = (TextView) convertView.findViewById(R.id.counter);
//
//        imgIcon.setImageResource(calendarItems.get(position).getIcon());
//        txtTitle.setText(calendarItems.get(position).getTitle());
//
//        // displaying count
//        // check whether it set visible or not
//        if(calendarItems.get(position).getCounterVisibility()){
//            txtCount.setText(calendarItems.get(position).getCount());
//        }else{
//            // hide the counter view
//            txtCount.setVisibility(View.GONE);
//        }

        return convertView;

    }

}
