package lab02;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20; // MAX ORDERED IN CART
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc [MAX_NUMBERS_ORDERED];

    private int count_Order = 0; // Numbers of order already in cart

    //add DVD to cart
    public void addDigitalVideoDisc(DigitalVideoDisc newDVD) {
        if(count_Order <= 20) {
            itemsOrdered[count_Order] = newDVD;
            count_Order ++;
            System.out.println("\""+newDVD.getTitle()+"\""+" has been added to your cart!");
        }else {
            System.out.println("Cart is already full!");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for(DigitalVideoDisc dvd : dvdList){
            if(count_Order <= 20){
                itemsOrdered[count_Order++] = dvd;
            }else {
                System.out.println("Cart is already full!");
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        itemsOrdered[count_Order++] = dvd1;
        itemsOrdered[count_Order++] = dvd2;
    }
    //remove DVD to cart
    public void removeDigitalDisc(DigitalVideoDisc removedDVD) {
        // Find title by arr[index].getTitle()
        for(int i = 0; i < count_Order; i++) {
            if(itemsOrdered[i].getTitle() == removedDVD.getTitle()) {
                for(int j = i; j < count_Order; j++) {
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                count_Order--;
                System.out.println("\""+removedDVD.getTitle()+"\""+" has been removed!");
                break;
            }
        }
    }
    //calculate total cost
    public float TotalCost() {
        float totalCost = 0;
        for(int i = 0; i < count_Order; i++) {
            totalCost += itemsOrdered[i].getCost();
        }
        return totalCost;
    }
}
