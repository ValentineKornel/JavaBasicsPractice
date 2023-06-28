package com.epam.rd.autotasks;

public class CompleteByRequestTask implements Task {
    private boolean isCompleted = false;
    private boolean isFin = false;
    @Override
    public void execute() {
    if (isCompleted)
        isFin = true;
    }
    @Override
    public boolean isFinished() {
    return isFin;
    }
    public void complete() {
    isCompleted = true;
    }
}
