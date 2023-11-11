package lab02;

public class AIMS {
    public static void main(String[] args) {
        Cart newCart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Five Nights At Freddy's", "Horror", "Emma Tammi", 110, 110000);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Past Lives", "Romatic", "Celine Song", 106, 140000);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Creator", "Action", "Gareth Edwards", 133, 150000);

        newCart.addDigitalVideoDisc(dvd1);
        newCart.addDigitalVideoDisc(dvd2);
        newCart.addDigitalVideoDisc(dvd3);

        System.out.println("Your total cost: " + newCart.TotalCost());

        newCart.removeDigitalDisc(dvd2);

        System.out.println("Your total cost: " + newCart.TotalCost());
    }
}

// apply-release-flow


// branch abc