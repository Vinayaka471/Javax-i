public class HoliRunner{
public static void main(String[] args) {
        Holi h1 = new Holi();
        Holi h2 = new Holi("Dry");
        Holi h3 = new Holi("Wet", "India");
        Holi h4 = new Holi("Organic", "India", "Festival of Colors");
        Holi h5 = new Holi("Synthetic", "India", "Celebration", "March");
        Holi h6 = new Holi("Natural", "India", "Tradition", "March", 100);
        Holi h7 = new Holi("Mixed", "India", "Fun", "March", 150, "Gujiya");

        h1.display();
        h2.display();
        h3.display();
        h4.display();
        h5.display();
        h6.display();
        h7.display();
    }
} 

