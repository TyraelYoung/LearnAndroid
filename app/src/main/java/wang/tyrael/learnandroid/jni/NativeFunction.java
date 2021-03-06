package wang.tyrael.learnandroid.jni;

public class NativeFunction {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    public native int sizeOfLong();

    public native int sizeOfJlong();

    public native void testLong(long l);
}
