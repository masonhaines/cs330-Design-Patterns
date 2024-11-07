public class TestLog{

    String debug = "This is a debug test for debugging.";
    String error = "This is a error test for debugging.";
    String magicError = "This is a magic error test for debugging.";

    void runTest()
    {
        SingletonLogger testObject = SingletonLogger.getInstance();

        testObject.debugging(debug);
        testObject.error(error);
        testObject.magicError(magicError);
    }
}
