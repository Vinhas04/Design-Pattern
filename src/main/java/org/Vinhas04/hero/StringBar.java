package org.Vinhas04.hero;

public class StringBar extends Bar{
    private boolean happy=false;
    @Override
    public boolean isHappyHour() {
        return happy;
    }

    @Override
    public void startHappyHour() {
        happy=true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        happy=false;
        notifyObservers();
    }
}
