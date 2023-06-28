package com.epam.rd.autotasks;

public class TaskCarousel {
    private final int capacity;
    private int currentCapacity, pointerOnList = 0;
    Task[] taskList;
    public TaskCarousel(int capacity) {
    this.capacity = capacity;
    taskList = new Task[capacity];
    currentCapacity = 0;}
    public boolean addTask(Task task) {
        if (task.isFinished() || isFull()) return false;
        taskList[currentCapacity++] = task;return true;
    }
    public boolean execute() {
        if(!isEmpty()){
            if(pointerOnList >= currentCapacity) pointerOnList = 0;
            taskList[pointerOnList].execute();
            if(taskList[pointerOnList].isFinished())
                deleteFromList(taskList, pointerOnList);
            pointerOnList++; return true;
        } else return false;
    }
    public boolean isFull() {
    return currentCapacity == capacity;
    }
    public boolean isEmpty() {
    return currentCapacity == 0;
    }
    private void deleteFromList(Task[] list, int position){
        int i;
        for (i = position; i < currentCapacity - 1; i++){
            list[i] = list[i + 1];
        }
        list[i] = null;currentCapacity--;pointerOnList--;
    }
}
