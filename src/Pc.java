import java.util.Comparator;

class Pc implements Comparable <Pc>, Comparator  <Pc> {

    //instance variables
    private int id;    //no setter
    private String cpu;
    private String ram;
    private String storage;
    private String lcdMaker;
    private boolean hasGpu;

    //constructors
    Pc(int id, String cpu, String ram, String storage, String lcdMaker, boolean hasGpu) {
        this.id = id;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.lcdMaker = lcdMaker;
        this.hasGpu = hasGpu;
    }


    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getLcdMaker() {
        return lcdMaker;
    }

    public void setLcdMaker(String lcdMaker) {
        this.lcdMaker = lcdMaker;
    }

    public boolean getGpu() {
        return hasGpu;
    }

    public void setGpu(boolean hasGpu) {
        this.hasGpu = hasGpu;
    }


    //methods
    @Override
    public String toString() {
        return String.format("Id: %d\nCPU: %s\nRAM: %s\nStorage: %s\nLCD Maker: %s\nGPU: %b\n", id, cpu, ram, storage, lcdMaker, hasGpu);
        //returns a formatted String
    }

    @Override
    public Object clone() {

        Pc clone = new Pc(id, cpu, ram, storage, lcdMaker, hasGpu);
        return clone;
    }


    @Override
    public int compare(Pc o1, Pc o2) {
        if (o1.getId() > o2.getId())
            return -1;
        else if (o1.getId() < o2.getId())
            return 1;

        return 0;
    }

    @Override
        public boolean equals(Object o){

        Pc p = (Pc)o;   //casting object to Pc
        if (p == null) return false;

        return this.id == p.id && this.cpu.equals(p.cpu) && this.ram.equals(p.ram) && this.storage.equals(p.storage)
            && this.lcdMaker.equals(p.lcdMaker) && this.hasGpu == p.hasGpu;   //this returns true if the Pcs are equal
        }


        @Override
        public int compareTo(Pc o) {
        if(this.getId() > o.getId())
                return -1;
            else if (this.getId() < o.getId())
                return 1;

            return 0;
        }
    }

