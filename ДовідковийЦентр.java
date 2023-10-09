public class ДовідковийЦентр{
    private class Маршрут {
        private String лінія;
        private String час;
        private double вартість;

        public Маршрут(String лінія, String час, double вартість) {
            this.лінія = лінія;
            this.час = час;
            this.вартість = вартість;
        }

        public String getЛінія() {
            return лінія;
        }

        public String getЧас() {
            return час;
        }

        public double getВартість() {
            return вартість;
        }
    }

    public void додатиМаршрут(String лінія, String час, double вартість) {
        Маршрут новийМаршрут = new Маршрут(лінія, час, вартість);
        // Тут можна додати новий маршрут до довідкового центру
        System.out.println("Додано новий маршрут: " + лінія + ", " + час + ", " + вартість);
    }

    public static void main(String[] args) {
        ДовідковийЦентр довідковийЦентр = new ДовідковийЦентр();
        довідковийЦентр.додатиМаршрут("Лінія 1", "Час відправлення: 8:00", 75.90);
        довідковийЦентр.додатиМаршрут("Лінія 2", "Час відправлення: 9:30",  100.00);
    }
}
