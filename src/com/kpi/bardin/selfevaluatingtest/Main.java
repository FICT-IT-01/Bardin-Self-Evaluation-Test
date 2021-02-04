package com.kpi.bardin.selfevaluatingtest;

import com.kpi.bardin.selfevaluatingtest.exceptions.*;
import com.kpi.bardin.selfevaluatingtest.models.TrainModel;
import com.kpi.bardin.selfevaluatingtest.processors.TrainProcessor;

public class Main {

    public static void main(String[] args) {
        var trainProcessor = new TrainProcessor(new TrainModel());

        try {
            trainProcessor.addPassengers(10);
        } catch (TrainIsMoveException e) {
            System.out.println(e.getMessage());
        }

        try {
            trainProcessor.move(10);
        } catch (TrainAlreadyMovingException | ToLowSpeedException e) {
            System.out.println(e.getMessage());
        }

        try {
            trainProcessor.changeSpeed(10);
        } catch (TooBigSpeedDeltaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(trainProcessor.showCurrentState());

        try {
            trainProcessor.removePassengers(5);
        } catch (NotEnoughPassengersException | TrainIsMoveException e) {
            System.out.println(e.getMessage());
        }

        try {
            trainProcessor.stop();
        } catch (TrainAlreadyStopedException | SpeedIsToHighException e) {
            System.out.println(e.getMessage());
        }

        try {
            trainProcessor.removePassengers(10);
        } catch (NotEnoughPassengersException | TrainIsMoveException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(trainProcessor.showCurrentState());
    }
}
