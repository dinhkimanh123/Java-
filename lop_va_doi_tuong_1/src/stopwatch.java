public class stopwatch {
    public double startTime;
    public double endTime;
    public boolean running;

    public stopwatch() {
        this.running =false;
    }
    public void setStartTime(){
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }
    public void setEndTime(){
        this.endTime= System.currentTimeMillis();
        this.running = false;
    }
    public double getElapsedTime(){
        double elapsed;
        if (running){
            elapsed = (System.currentTimeMillis() - startTime);
        }else {
            elapsed = (endTime - startTime);
        }
        return elapsed;
    }
    public double getStartTimeSecs(){
        double elapsed;
        if (running){
            elapsed = ((System.currentTimeMillis() - startTime) / 1000);
        }else {
            elapsed = ((this.endTime - this.startTime) /1000);
        }
        return elapsed;
    }


}
