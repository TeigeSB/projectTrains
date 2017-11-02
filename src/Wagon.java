import java.util.LinkedList;

public class Wagon extends RollingStock {

    private Parcel[] mParcels;
    private int mParcelCount;
    LinkedList<Parcel> parcels = new LinkedList<Parcel>();

    public Wagon(int ID)
    {
        super(ID, 32000); // Empty wagon weighs 32000 kilograms
        mParcels = new Parcel[100];
        mParcelCount = 0;
    }

    // Accessor methods
    public int getWagonID() { return this.getID(); }
    public double getWeight()
    {
        int wWeight = 32000;
        for (int i = 0; i < mParcels.length; i++) {

         wWeight += mParcels[i].getWeight();

     }
     return wWeight;
    }

    public void addParcel(Parcel parcel) {

        parcels.addFirst(parcel);

    }

    public Parcel getParcel() {

        Parcel wow = parcels.getFirst();
        return wow;
    }
// Other methods



}
