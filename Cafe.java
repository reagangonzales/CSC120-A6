/* This is a stub for the Cafe class */
/**
 * Represents a Cafe, a type of Building that sells coffee and maintains an inventory of ingredients.
 */
public class Cafe extends Building {
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;
  
    /**
     * Constructor to initialize the Cafe with a name, address, floors, and starting inventory.
     *
     * @param name The name of the cafe
     * @param address The address of the cafe
     * @param nFloors The number of floors in the cafe
     * @param nCoffeeOunces Initial ounces of coffee in inventory
     * @param nSugarPackets Initial packets of sugar in inventory
     * @param nCreams Initial units of cream in inventory
     * @param nCups Initial number of cups in inventory
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
      super(name, address, nFloors);
      this.nCoffeeOunces = nCoffeeOunces;
      this.nSugarPackets = nSugarPackets;
      this.nCreams = nCreams;
      this.nCups = nCups;
    }
  
    /**
     * Sells a cup of coffee and adjusts the inventory.
     *
     * @param size The size of the coffee in ounces
     * @param nSugarPackets The number of sugar packets for the coffee
     * @param nCreams The number of creams for the coffee
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
      if (nCoffeeOunces < size || nSugarPackets > this.nSugarPackets || nCreams > this.nCreams || nCups <= 0) {
        restock(size - nCoffeeOunces, nSugarPackets - this.nSugarPackets, nCreams - this.nCreams, 1);
      }
      nCoffeeOunces -= size;
      nSugarPackets -= nSugarPackets;
      nCreams -= nCreams;
      nCups -= 1;
    }
  
    /**
     * Restocks the cafe's inventory.
     *
     * @param nCoffeeOunces Additional ounces of coffee to restock
     * @param nSugarPackets Additional packets of sugar to restock
     * @param nCreams Additional units of cream to restock
     * @param nCups Additional cups to restock
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
      this.nCoffeeOunces += nCoffeeOunces;
      this.nSugarPackets += nSugarPackets;
      this.nCreams += nCreams;
      this.nCups += nCups;
    }
}
  