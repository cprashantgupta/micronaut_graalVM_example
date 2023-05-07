package com.prashant;

import jakarta.inject.Singleton;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Singleton
public class ConferenceService {

    private static final List<Conference> CONFERENCE_LIST = Arrays.asList(
            new Conference("Indigo"),
            new Conference("Violet"),
            new Conference("Blue")
    );

    public Conference randomConference(){
        return CONFERENCE_LIST.get(new Random().nextInt(CONFERENCE_LIST.size()));
    }
}
