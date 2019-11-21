import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;
import sheffield.*;

public class ProcessCameraFile{

    public static Camera[] cameras = new Camera[0];

    /*public static Camera[] addCamera(Camera[] cameras, Camera cameraToAdd) {
        Camera[] newCameras = new Camera[cameras.length + 1];
        System.arraycopy(cameras, 0, newCameras, 0, cameras.length);
        newCameras[newCameras.length - 1] = cameraToAdd;

        return newCameras;
    }*/
    public static Camera[] addCamera(Camera[] cameras, Camera cameraToAdd) {
        Camera[] newCameras = new Camera[cameras.length + 1];
        //System.arraycopy(cameras, 0, newCameras, 0, cameras.length);
        for(int i =0;i<cameras.length;i++){

            newCameras[i] = cameras[i];

        }
        newCameras[newCameras.length - 1] = cameraToAdd;

        return newCameras;
    }

    // display cameras that have a given name
    private static void searchByName(Camera[] a, int n, String s) {

        // CODE MISSING
        for(int i = 0;i<a.length;i++){

            if(a[i].getName().equals(s)){

                n++;

            }

        }
        System.out.println("The number of camera： " + s +" is " + n);

    }

    // display cameras with a given stock code
    private static void searchByStockCode(Camera[] a, int n, StockCode c) {

        // CODE MISSING
        for(int i =0; i<a.length;i++){

            if(a[i].getStock_code().getValue().equals(c.getValue())){

                n++;

            }

        }
        System.out.println("The number of camera： " + c.getValue() +" is " + n);


    }
    // main method
    public static void main(String[] args) {

        // CODE MISSING
        //Camera[] cameras = new Camera[0];
        //ProcessCameraFile pc = new ProcessCameraFile();
        String[] a = new String[1000];
        int i =0;
        EasyReader file = new EasyReader("D:\\java practice\\week7\\src\\cameras.txt");
        while (!file.eof()){

            String content = file.readString();
            a[i] = content;
            //System.out.println(a[i]);
            i++;

        }
        for(int n = 0;n<i;n = n+4){

            String name = a[n];
            StockCode stockCode = new StockCode(a[n+1]);
            if(!stockCode.isValid()){

                System.out.println("camera code: " + a[n+1] + " is not a valid code");

            }
            int condition = Integer.parseInt(a[n+2]);
            Double price = Double.parseDouble(a[n+3]);
            Camera newCamera = new Camera(name,price,condition,stockCode);
            //System.out.println(newCamera.toString());
            cameras =addCamera(cameras,newCamera);
            //System.out.println(cameras[0].toString());

        }
        System.out.println(cameras[2].toString());
        searchByName(cameras,0,"Canon T90");
        StockCode stockCode = new StockCode("KHG-0-7507");
        searchByStockCode(cameras,0,stockCode);

    }


}