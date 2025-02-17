package by.bogdanova.L23_01_2025;

public class Building {
    String material;
    String street;
    int quantityWindow;
    int quantityDoor;
    Integer height;           // высота здания в метрах
    Integer yearBuilt;        // год постройки

    public Building(String material, String street, int quantityWindow, int quantityDoor) {
        this.material = material;
        this.street = street;
        this.quantityWindow = quantityWindow;
        this.quantityDoor = quantityDoor;
    }
/*3.Задача: Расширение класса "Здание"
Добавьте новые поля:
Поле height (высота здания), которое будет представлять высоту здания в метрах.
Поле yearBuilt (год постройки), представляющее год, в который было построено здание.
Измените класс Building:
Добавьте новый конструктор который будет включать новые поля.
Обновите метод getDescription(), чтобы он также включал информацию о высоте и о годе постройки.*/

    public Building(String material, String street, int quantityWindow, int quantityDoor, int height, int yearBuilt) {
        this.material = material;
        this.street = street;
        this.quantityWindow = quantityWindow;
        this.quantityDoor = quantityDoor;
        this.height = height;
        this.yearBuilt = yearBuilt;
    }

    public Building(int quantityWindow, int quantityDoor, int height, int yearBuilt) {
        this.quantityWindow = quantityWindow;
        this.quantityDoor = quantityDoor;
        this.height = height;
        this.yearBuilt = yearBuilt;
    }

     String getDescription (){
        String getDescription;
        if (yearBuilt == null && height == null){
            getDescription = "здание на улице " + street + ": " + quantityWindow + " окон, "
                + quantityDoor + " дверей, из " + removeLastVowel(material) + "a";
        } else
            getDescription = "здание на улице " + street + ": " + quantityWindow + " окон, "
                    + quantityDoor + " дверей, из " + removeLastVowel(material) + "a. Год постройки " + yearBuilt
                    + ", высота здания " + height + " метров.";
        return getDescription;
     }

    private static String removeLastVowel(String str) {
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        if (str.length() - 1 >= 0 && vowels.indexOf(str.charAt(str.length() - 1)) != -1) {
            StringBuilder result = new StringBuilder(str);
            result.deleteCharAt(str.length() - 1);
            return result.toString();
        }
        return str;
    }
}
