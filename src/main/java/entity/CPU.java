package entity;

public class CPU {
    private int price;

    public CPU(int price) {
        this.price = price;
    }

    public class Processor {
        private int coreAmount;
        private String menufacturer;

        public Processor(int coreAmount, String menufacturer) {
            this.coreAmount = coreAmount;
            this.menufacturer = menufacturer;
        }

        public double getCache(){
            return 4.3;
        }
    }

    public class Ram {
        private int memory;
        private String menufacturer;

        public Ram(int memory, String menufacturer) {
            this.memory = memory;
            this.menufacturer = menufacturer;
        }

        public double getClockSpeed(){
            return 5.5;
        }
    }
}
