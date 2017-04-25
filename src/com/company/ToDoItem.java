package com.company;

/**
 * Created by jaradtouchberry on 4/5/17.
 */
public class ToDoItem {
    String text;
    boolean isDone;
    int id;

    public ToDoItem() {

    }

    public ToDoItem(int id, String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}