package oving1;

public class StopWatch {
    boolean start;
    boolean stop;
    int lapTime;
    int time;
    int lastLapTime;
    int ticks;

    public StopWatch() {
        this.start = false;
        this.stop = false;

    }

    public void tick(int ticks) {
        if (this.stop == false) {
            this.time += ticks;
            this.lapTime += ticks;

        }
        this.ticks += ticks;

    }

    public void start() {
        this.start = true;
        this.time = 0;
        this.lapTime = 0;
    }

    public void lap() {
        this.lastLapTime = this.lapTime;
        this.lapTime = 0;

    }

    public void stop() {
        this.stop = true;
        this.lastLapTime = this.lapTime;
        this.lapTime = 0;

    }

    public boolean isStarted() {
        return this.start;
    }

    public boolean isStopped() {
        return this.stop;

    }

    public int getTicks() {
        return this.ticks;
    }

    public int getTime() {
        if (this.start == false) {
            return -1;
        } else
            return this.time;

    }

    public int getLapTime() {
        if (this.start == false) {
            return -1;
        } else if (this.stop == true) {
            return 0;
        }
        return this.lapTime;

    }

    public int getLastLapTime() {
        if (this.start == false) {
            return -1;
        } else if (this.lastLapTime == 0) {
            return -1;
        }
        return this.lastLapTime;
    }

    public String toString() {
        return "StopWatch [start=" + start + ", stop=" + stop + ", lapTime=" + lapTime + ", time=" + time
                + ", lastLapTime=" + lastLapTime + "]";
    }

    public static void main(String[] args) {
        StopWatch w = new StopWatch();
        // w.start();
        w.tick(2);
        w.start();
        // w.lap();
        // w.tick(5);
        // w.tick(2);
        // w.stop();
        System.out.println(w.getTicks());
        // w.stop();
        // System.out.println(w);
    }

}
