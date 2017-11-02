import java.util.LinkedList;

public class Train {

    private Engine[] mEngines;
    private Wagon[] mWagons;
    LinkedList<Wagon> mWagonss = new LinkedList<Wagon>();
    private int mEngineCount;
    private int mWagonCount;
    private int mTrainNumber;
    private double mWeight; // Total weight in kilograms

    public Train(int number)
    {
        mTrainNumber = number;
        mEngines = new Engine[6]; // The train can have up to 6 engines
        mEngineCount = 0;
        mWagons = new Wagon[100]; // The train can have up to 100 wagons
        mWagonCount = 0;
        mWeight = 0;
    }

    public int getNumberOfWagons()
    {

        return mWagonCount;

    }

    public void addWagon(Wagon wagon) {

        mWagonss.addFirst(wagon);

    }

    public void addEngine( Engine newEngine )
    {
        mEngines[mEngineCount] = newEngine;
        mEngineCount++;
    }
    public Engine removeEngine()
    {
        mEngineCount--;
        return mEngines[mEngineCount];
    }

    public Wagon removeWagon()
    {
     mWagonCount--;
     return mWagons[mWagonCount];
    }
    public double getWeight()
    {
        for (int i = 0; i < mWagons.length; i++) {

            mWeight += mWagons[i].getWeight();

        } for (int j = 0; j < mEngines.length; j++) {

            mWeight += mEngines[j].getWeight();

    }
        return mWeight;
    }
}

