package com.kpi.bardin.selfevaluatingtest.processors;

import com.kpi.bardin.selfevaluatingtest.exceptions.*;
import com.kpi.bardin.selfevaluatingtest.models.TrainModel;

public class TrainProcessor implements com.kpi.bardin.selfevaluatingtest.interfaces.TrainProcessor {
    private TrainModel train;

    public TrainProcessor(TrainModel train) {
        if (train == null) {
            throw new NullPointerException("Train cannot be null");
        }

        this.train = train;
    }

    @Override
    public void addPassengers(int amount) throws TrainIsMoveException {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be greater or equals than zero.");
        }

        if (train.isMove()) {
            throw new TrainIsMoveException("Impossible to add passengers while train is moving.");
        }

        train.setPassengersAmount(train.getPassengersAmount() + amount);
    }

    @Override
    public void removePassengers(int amount) throws NotEnoughPassengersException, TrainIsMoveException {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be greater or equals than zero.");
        }

        if (train.isMove()) {
            throw new TrainIsMoveException("Impossible to add passengers while train is moving.");
        }

        var currentAmountOfPassengers = train.getPassengersAmount();

        if (currentAmountOfPassengers < amount) {
            throw new NotEnoughPassengersException("There`re not enough passengers at the train.");
        }
        train.setPassengersAmount(train.getPassengersAmount() - amount);
    }

    @Override
    public void changeSpeed(float delta) throws TooBigSpeedDeltaException {
        var currentSpeed = train.getSpeed();

        if (currentSpeed + delta < 0 || delta > 10) {
            throw new TooBigSpeedDeltaException();
        }

        train.setSpeed(currentSpeed + delta);
    }

    @Override
    public void move(float initialSpeed) throws TrainAlreadyMovingException, ToLowSpeedException {
        if (train.isMove()) {
            throw new TrainAlreadyMovingException("Train is already moving.");
        }

        if (initialSpeed <= 5) {
            throw new ToLowSpeedException("Too low speed.");
        }

        if (!train.isMove() && train.getSpeed() == 0) {
            train.setSpeed(initialSpeed);
            train.setMove(true);
        }
    }

    @Override
    public void stop() throws TrainAlreadyStopedException, SpeedIsToHighException {
        if (!train.isMove()) {
            throw new TrainAlreadyStopedException("Train is already staying.");
        }

        if (train.getSpeed() > 20) {
            throw new SpeedIsToHighException("Speed is too high.");
        }

        train.setSpeed(0);
        train.setMove(false);
        train.setStopsAmount(train.getStopsAmount() + 1);
    }

    @Override
    public String showCurrentState() {
        return "Passengers: " + train.getPassengersAmount() +
                ", Speed: " + train.getSpeed() +
                (train.isMove() ? " Moving" : " Staying") +
                ", Stops: " + train.getStopsAmount();
    }

    @Override
    public int showAmountOfStops() {
        return 0;
    }
}
