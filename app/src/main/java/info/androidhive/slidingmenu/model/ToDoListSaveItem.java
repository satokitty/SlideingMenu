package info.androidhive.slidingmenu.model;

import android.app.Activity;

import org.json.JSONArray;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 * Created by fukuokak on 2014/10/25.
 */
public class ToDoListSaveItem {
    //ToDo:実装すること
    //TaskItem → 保管できる
    //ArrayList<TaskItem> → 保管できる
    //日にちごとに保管/取得できるITEMであること
    private Activity activity ;
    private String toDoListSaveItemKey ;
    private String toDoListSaveItemString ;
    private boolean toDoListSaveItemDoCheckBox ;

    public ToDoListSaveItem(Activity activity , TaskItem taskItem,boolean taskItemDo){
        this.activity = activity ;
        this.toDoListSaveItemKey = taskItem.getScheduleDate() +',' +taskItem.getTaskNum();
        this.toDoListSaveItemString = taskItem.getTaskTitle()+',' +taskItem.getTaskInterval();
        this.toDoListSaveItemDoCheckBox = taskItemDo ;
    }

    public ToDoListSaveItem(Activity activity , ArrayList<TaskItem> taskItemArray , boolean[] taskItemDo) {

    }

     public String getToDoListSaveItemKey() {
        return toDoListSaveItemKey;
    }

    public String getToDoListSaveItemString() {
        return toDoListSaveItemString;
    }

    public boolean isToDoListSaveItemDoCheckBox() {
        return toDoListSaveItemDoCheckBox;
    }

    public void saveFile() throws FileNotFoundException, UnsupportedEncodingException {

        try {
            OutputStream out = activity.openFileOutput("a.txt", Activity.MODE_PRIVATE);
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(out, "UTF-8"));
            writer.append(getToDoListSaveItemKey()+","+getToDoListSaveItemString()+","+isToDoListSaveItemDoCheckBox());
            writer.close();
        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
