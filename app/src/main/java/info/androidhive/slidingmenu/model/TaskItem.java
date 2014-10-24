package info.androidhive.slidingmenu.model;

import android.content.res.Resources;

/**
 * Created by fukuokak on 2014/10/24.
 */
public class TaskItem {
    private String scheduleDate ;
    private String taskTitle ;
    private String taskInterval ;
    private int taskNum ;

    final private String TASK_INTERVAL_DAILY = "DAILY";
    final private String TASK_INTERVAL_WEEKLY = "WEEKLY";
    final private String TASK_INTERVAL_MONTHLY = "MONTHLY";

    public TaskItem(String scheduleDate, int taskNum , String taskTitle, String taskInterval) throws NullPointerException{
        this.scheduleDate = scheduleDate;
        this.taskNum = taskNum;
        this.taskTitle = taskTitle;
        if (taskInterval.equals(TASK_INTERVAL_DAILY)||
                taskInterval.equals(TASK_INTERVAL_WEEKLY)||
                taskInterval.equals(TASK_INTERVAL_MONTHLY)){
            this.taskInterval = taskInterval;
        } else{
            throw new NullPointerException
                    ("taskInterval is not match");
        }
    }

    public String getScheduleDate() {
        return scheduleDate;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public String getTaskInterval() {
        return taskInterval;
    }

    public int getTaskNum() {
        return taskNum;
    }

}
