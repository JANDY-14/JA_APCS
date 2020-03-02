import java.util.ArrayList;

public class CleanTempSensorData {
    public static void main(String args[]) {
        SensorData CLE = new SensorData();
        //////////////////////////////////////////////////////////
        ArrayList<Integer> clorox = cleanData(CLE.getTempSensorData());
        //////////////////////////////////////////////////////////
        for (int bleach : clorox)
            System.out.println(bleach);
        //////////////////////////////////////////////////////////
    }

    ///////////////////// making array list/////////////////////////////////////
    public static ArrayList cleanData(int[] arr) {
        ArrayList<Integer> cleanData = new ArrayList<>();
        ////////////////////// for loop////////////////////////////////////
        for (int i = 0; i < arr.length; i++) {
            ////////////////////// if statment cleaning avrage data with a rough estimate of  a temp////////////////////////////////////
            if (arr[i] < 20 ) {
                cleanData.add(arr[i]);
            }

        }
    return cleanData;
    }
    

}//noice