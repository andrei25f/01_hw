package ait.manipulation.infra;

import ait.manipulation.model.Manipulation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Utils {
    public static void caller(String fileFrom, String fileTo, String manipulation) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileFrom));

            Class<Manipulation> clazz = Manipulation.class;
            Method method = clazz.getDeclaredMethod(manipulation, List.class);
            lines = (List<String>) method.invoke(clazz.getDeclaredConstructor().newInstance(), lines);

            Files.write(Paths.get(fileTo), lines);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(manipulation + " doesn't exists");
        }
    }
}
