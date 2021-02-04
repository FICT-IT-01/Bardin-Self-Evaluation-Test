package com.kpi.bardin.selfevaluatingtest.models;

public class TrainModel {
    private int passengersAmount;
    private int stopsAmount;
    private float speed;
    private boolean isMove;

    public TrainModel() {
        this.passengersAmount = 0;
        this.speed = 0;
        this.stopsAmount = 0;
        this.isMove = false;
    }

    public TrainModel(int passengersAmount, float speed, int stopsAmount) {
        this.passengersAmount = passengersAmount;
        this.speed = speed;
        this.isMove = speed > 5 ? true : false;
        this.stopsAmount = stopsAmount;
    }

    public int getPassengersAmount() {
        return passengersAmount;
    }

    public void setPassengersAmount(int passengersAmount) {
        this.passengersAmount = passengersAmount;
    }

    public int getStopsAmount() {
        return stopsAmount;
    }

    public void setStopsAmount(int stopsAmount) {
        this.stopsAmount = stopsAmount;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public boolean isMove() {
        return isMove;
    }

    public void setMove(boolean move) {
        isMove = move;
    }
}
