package com.zipcodewilmington.froilansfarm;

public interface Rideable<AnyRider extends Rider> {

    boolean canRide(AnyRider Rider);
}
