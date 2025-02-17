package by.bogdanova.L23_01_2025;

//String material, String street, int quantityWindow, int quantityDoor

import java.util.Random;

public class Task01 {

    public static void main(String[] args) {


        Building building1 = new Building("дерево", "Правды"
                , 10, 2);

        Building building2 = new Building("бетон", "Смоленская"
                , 7, 1);

        System.out.println(building1.getDescription());
        System.out.println(building2.getDescription());

        String material = "бетон";
        String street = "Смоленская";

/*1.Создайте 200 объектов класса Building с одинаковыми улицей и материалом, но с рандомным количеством окон и дверей от 0 - 20.
Объяснение: получить рандомное число (
Random r = new Random();
int a = r.nextInt(20);)
В цикле for создаются 200 объектов Building с одинаковыми улицей и материалом, но с рандомным количеством окон и дверей.
Второй for вывод описания, каждый объект здания выводится на консоль с помощью метода getDescription().*/

        Building[] buildings = createBuilding(material, street);
        getDescriptionArray(buildings);

/*2.Найти в предыдущем массиве Building который содержит 10 окон и заменить у этих домов материал на другой(любой).
После изменения материала снова выводится описание всех зданий.*/

        Building[] buildings2 =getBuildingWithCountWindows(buildings, 10);
        String newMaterial = "кирпич";
        changeBuildingMaterial (buildings2, newMaterial);
        getDescriptionArray(buildings2);

/*4.Создайте 200 объектов класса Building:
Высота здания должна быть случайным числом от 1 до 50 метров.
Год постройки должен быть случайным числом в диапазоне от 1900 до 2023 года.
Выведите описание каждого здания:
Каждое описание должно теперь включать высоту здания и  год постройки*/

        Building[] buildings4 = createBuilding(material, street, "height", "yearBuilt");
        getDescriptionArray(buildings4);

/*  5.Найдите самое высокое здание и выведите его в консоль (если их несколько то выведите любое)*/

        Building getTallestBuilding = getTallestBuilding(buildings4);
        System.out.println("Самое высокое здание:\n" + getTallestBuilding.getDescription());

/*6.Найдите самое старое здание и выведите его в консоль (если их несколько то выведите любое)*/

        Building getOldestBuilding = getOldestBuilding(buildings4);
        System.out.println("Самое старое здание:\n" + getOldestBuilding.getDescription());

/*7*.Задача: Класс "Здание" с рандомными улицами и материалами
Создайте массивы:
Массив с различными улицами.
Массив с различными материалами.
Создайте 200 объектов класса Building:
Все поля (число окон, дверей, высота, год постройки, улица и материал) должны быть случайными.
Улицы и материалы выбирайте из ранее созданных массивов.*/

        BuildingRandomMaterialRandomStreet[] buildings7 = createBuilding();
        getDescriptionArray(buildings7);

/*8*. Найдите в этом массиве самое новое здание из бетона высота которого превышает 40 метров*/

        BuildingRandomMaterialRandomStreet[] buildings8 =findConcreteBuilding(buildings7, "бетон",  40);
        System.out.println("Массив здание из бетона, высотой более 40 метров");
        getDescriptionArray(buildings8);

        BuildingRandomMaterialRandomStreet getNewestBuilding = getNewestBuilding(buildings8);
        System.out.println("Самое новое здание из бетона высота которого превышает 40 метров\n"
                + getNewestBuilding.getDescription());
    }

    private static Building[] createBuilding(String material, String street) {
        Random random = new Random();
        Building[] buildings = new Building[200];
        for (int i = 0; i < buildings.length; i++) {
            buildings[i] = new Building(material, street,  random.nextInt(20),  random.nextInt(20));
        }
        return buildings;
    }

    private static Building[] createBuilding(String material, String street, String height, String yearBuilt) {
        Random random = new Random();
        Building[] buildings = new Building[200];
        for (int i = 0; i < buildings.length; i++) {
            buildings[i] = new Building(material, street,  random.nextInt(20)
                    ,  random.nextInt(20),  random.nextInt(1200),  random.nextInt(1800, 2025));
        }
        return buildings;
    }

    private static BuildingRandomMaterialRandomStreet[] createBuilding() {
        Random random = new Random();
        BuildingRandomMaterialRandomStreet[] buildings = new BuildingRandomMaterialRandomStreet[200];
        for (int i = 0; i < buildings.length; i++) {
            buildings[i] = new BuildingRandomMaterialRandomStreet(random.nextInt(20)
                    ,  random.nextInt(20),  random.nextInt(1200),  random.nextInt(1800, 2025));
        }
        return buildings;
    }

    private static void getDescriptionArray(Building[] buildings) {
        for (int i = 0; i < buildings.length; i++) {
            System.out.println(buildings[i].getDescription());
        }
    }

    private static Building[] getBuildingWithCountWindows(Building[] buildings, int countWindows) {
        int count = 0;
        for (int i = 0; i < buildings.length; i++) {
            if (buildings[i].quantityDoor == countWindows) {
                count++;
            }
        }
        Building[] tempBuildings = new Building[count];
        int index = 0;
            for (int i = 0; i < buildings.length; i++) {
                if (buildings[i].quantityDoor == countWindows) {
                    tempBuildings[index] = buildings[i];
                    index++;
                }
            }
        return tempBuildings;
    }

    private static Building[] changeBuildingMaterial (Building[] buildings, String newMaterial) {
        for (int i = 0; i < buildings.length; i++) {
            buildings[i].material = newMaterial;
        }
        return buildings;
    }

    private static Building getTallestBuilding(Building[] buildings) {
        Building tallestBuilding = buildings[0];
        for (Building building : buildings) {
            if (building.height > tallestBuilding.height) {
                tallestBuilding = building;
                break;
            }
        }
        return tallestBuilding;
    }

    private static Building getOldestBuilding(Building[] buildings) {
        Building oldestBuilding = buildings[0];
        for (Building building : buildings) {
            if (building.yearBuilt < oldestBuilding.yearBuilt) {
                oldestBuilding = building;
                break;
            }
        }
        return oldestBuilding;
    }

    private static BuildingRandomMaterialRandomStreet[] findConcreteBuilding(
            BuildingRandomMaterialRandomStreet[] buildings, String material,  int height) {
        int count = 0;
        for (BuildingRandomMaterialRandomStreet building : buildings) {
            if (material.equals(building.material) && building.height > height) {
                count++;
            }
        }
        BuildingRandomMaterialRandomStreet[] tempBuildings = new BuildingRandomMaterialRandomStreet[count];
        int index = 0;
        for (BuildingRandomMaterialRandomStreet building : buildings) {
            if (material.equals(building.material) && building.height > height) {
                tempBuildings[index] = building;
                index++;
            }
        }
        return tempBuildings;
    }

    private static BuildingRandomMaterialRandomStreet getNewestBuilding(
            BuildingRandomMaterialRandomStreet[] buildings) {
        for (int i = 0; i < buildings.length - 1; i++) {
            for (int j = 0; j < buildings.length - 1 - i; j++) {
                if (buildings[j].yearBuilt > buildings[j + 1].yearBuilt) {
                    BuildingRandomMaterialRandomStreet temp = buildings[j];
                    buildings[j] = buildings[j + 1];
                    buildings[j + 1] = temp;
                }
            }
        }
        return buildings[buildings.length-1];
    }
}
