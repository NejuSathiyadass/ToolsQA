package Utilities;

import org.openqa.selenium.WebElement;

import java.lang.reflect.Field;

public class PageObjectGenerator {

    private static Object generatePageObjectFromString(String pageObjectString) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String[] parts = pageObjectString.split("\\.");

        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid page object string format. Should be in the format 'ClassName.variableName'");
        }

        String className = parts[0];
        String variableName = parts[1];

        Class<?> clazz = Class.forName("PageObjects." + className);

        try {
            Field field = clazz.getDeclaredField(variableName);
            field.setAccessible(true);
            if (field.getType().isAssignableFrom(WebElement.class)) {
                return field.get(null);
            } else {
                throw new IllegalArgumentException("Field '" + variableName + "' in class '" + className + "' is not a WebElement");
            }
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException("Variable '" + variableName + "' not found in class '" + className + "'");
        }
    }


    public static WebElement convertToWebElement(String element) {
        try {
            Object object = generatePageObjectFromString(element);
            try {
                return (WebElement) object;
            } catch (ClassCastException e) {
                throw new IllegalArgumentException("Object cannot be converted to WebElement");
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }


}
