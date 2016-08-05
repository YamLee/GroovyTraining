package me.yamlee.training.differ

/**
 * Created by yamlee on 8/5/16.
 */
class DifferWithJava {
    //1. Default Imports

    //2. Multi-methods
    int method(String arg) {
        return 1;
    }

    int method(Object arg) {
        return 2
    }

    void multiMethods() {
        Object object = "test"
        String result = method(object)
        println result
    }

    //3.Array initializers
//    int[] array = {1,3,4}
//    int[] array2 = [1,2,3]

    //4. Package scope visibility
    String name="hello";

    //5. ARM blocks
    void readTextFile() {
        String filePath = System.getProperty("user.dir")+File.separator+"testFile.txt"
        new File(filePath).eachLine {
            println it
        }
    }



    public static void main(String[] args) {
        DifferWithJava differWithJava = new DifferWithJava()
//        differWithJava.multiMethods()
       differWithJava.readTextFile()
    }
}
