package FactoryMethodPattern;
/**
 * Factory สำหรับสร้างอ็อบเจกค์ Shipment
 */
public class ShipmentFactory {
    public Shipment createShipment(String type){
        if ("STANDARD".equalsIgnoreCase(type)) {
            return new StandardShipment();
        } else if ("EXPRESS".equalsIgnoreCase(type)) {
            return new ExpressShipment();
        }
        throw new IllegalArgumentException("Unknown shipment type: " + type);
    }
    
}
