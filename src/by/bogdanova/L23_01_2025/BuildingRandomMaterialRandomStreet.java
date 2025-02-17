package by.bogdanova.L23_01_2025;

/*
7*.Задача: Класс "Здание" с рандомными улицами и материалами
Создайте массивы:
Массив с различными улицами.
Массив с различными материалами.
Создайте 200 объектов класса Building:
Все поля (число окон, дверей, высота, год постройки, улица и материал) должны быть случайными.
Улицы и материалы выбирайте из ранее созданных массивов.
*/

import java.util.Random;

public class BuildingRandomMaterialRandomStreet extends Building {

    public BuildingRandomMaterialRandomStreet(int quantityWindow, int quantityDoor, int height, int yearBuilt) {
        super(quantityWindow, quantityDoor, height, yearBuilt);
        Random random = new Random();
        this.material = getArrMaterial()[random.nextInt(getArrMaterial().length)];
        this.street = getArrStreet()[random.nextInt(getArrStreet().length)];
    }

     private String[] getArrMaterial(){
        String[] arrMaterial = new String[5];
        arrMaterial[0] = "кирпич";
        arrMaterial[1] = "бетон";
        arrMaterial[2] = "дерево";
        arrMaterial[3] = "камень";
        arrMaterial[4] = "солома";
        return arrMaterial;
     }

    private String[] getArrStreet(){
        String[] arrStreet = new String[5];
        arrStreet[0] = "Смоленская";
        arrStreet[1] = "Правды";
        arrStreet[2] = "Кирова";
        arrStreet[3] = "Димитрова";
        arrStreet[4] = "Чапаева";
        return arrStreet;
    }
}