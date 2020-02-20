public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public void takeOff() {
        this.flying = true;
        System.out.println(this.getName() + " is taking off !");
    }

    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.flying = true;
            this.altitude += meters;
            System.out.println(this.getName() + " is ascending at " + this.altitude + " meters.");
        }
        return this.getAltitude();
    }

    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude -= meters;
            System.out.println(this.getName() + " is descending at " + this.altitude + " meters.");
        }
        return this.altitude;
    }

    @Override
    public void glide() {
        System.out.println(this.getName() + " is gliding at " + this.altitude + " meters.");
    }


    @Override
    public void land() {
        System.out.println(this.getName() + " is landing !");
        if(altitude == 0) {
            this.flying = false;
            System.out.println(this.getName() + " is landed !");
        }
    }

    @Override
    public String sing() {
        return "Screech!";
    }
}
