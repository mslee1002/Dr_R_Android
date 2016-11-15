package com.example.hosea.dr_r_android.dao;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Hosea on 2016-11-09.
 */
public class DiaryVO {
    private int u_id;
    private String breakfast;
    private String lunch;
    private String dinner;
    private int temperature;
    private int humid;
    private int sleepTime;
    private int bloodPressure;
    private String drinking;
    private String memo;

    public DiaryVO() {}

    public DiaryVO (JSONObject json) {
        try {
//            this.breakfast = json.getString("c_breakfast");
//            this.lunch = json.getString("c_lunch");
//            this.dinner = json.getString("c_dinner");
//            this.temperature = json.getInt("c_temperature");
//            this.humid = json.getInt("c_humid");
//            this.sleepTime = json.getInt("c_sleepTime");
//            this.bloodPressure = json.getInt("c_bloodPressure");
//            this.drinking = json.getString("c_drinking");
//            this.memo = json.getString("c_memo");
            breakfast = json.getString("c_breakfast");
            lunch = json.getString("c_lunch");
            dinner = json.getString("c_dinner");
            temperature = json.getInt("c_temperature");
            humid = json.getInt("c_humid");
            sleepTime = json.getInt("c_sleepTime");
            bloodPressure = json.getInt("c_bloodPressure");
            drinking = json.getString("c_drinking");
            memo = json.getString("c_memo");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "{" + "u_id:" + u_id + "breakfast:" + u_id + "lunch:" + u_id + "dinner:"
                + u_id + "temperature:" + u_id + "humid:" + u_id + "sleepTime:" + u_id
                + "bloodPressure:" + u_id + "drinking:" + u_id + "memo:" + u_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumid() {
        return humid;
    }

    public void setHumid(int humid) {
        this.humid = humid;
    }

    public int getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getDrinking() {
        return drinking;
    }

    public void setDrinking(String drinking) {
        this.drinking = drinking;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}