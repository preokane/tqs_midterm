package tqs.midterm.entity;

public class State {

    String state;

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state=state;
    }

    @Override
    public String toString() {
        return this.state;
    }
}
