package com.kpi.bardin.selfevaluatingtest.interfaces;

import com.kpi.bardin.selfevaluatingtest.exceptions.*;

public interface TrainProcessor {
    void addPassengers(int amount) throws TrainIsMoveException;
    void removePassengers(int amount) throws NotEnoughPassengersException, TrainIsMoveException;
    void changeSpeed(float delta) throws TooBigSpeedDeltaException;
    void move(float initialSpeed) throws TrainAlreadyMovingException, ToLowSpeedException;
    void stop() throws TrainAlreadyStopedException, SpeedIsToHighException;
    String showCurrentState();
    int showAmountOfStops();
}
