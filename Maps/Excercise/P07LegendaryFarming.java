package Maps.Excercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        boolean isWin = false;
        Map<String, Integer> junks = new LinkedHashMap<>();


        while (!isWin) {
            String command = scanner.nextLine();
            String[] commandData = command.split(" ");
            for (int i = 0; i < commandData.length - 1; i += 2) {
                int quantity = Integer.parseInt(commandData[i]);

                String material = commandData[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = materials.get(material);
                    materials.put(material, currentQuantity + quantity);
                } else {
                    if (!junks.containsKey(material)) {
                        junks.put(material, quantity);

                    } else {
                        int currentQuantity = junks.get(material);
                        junks.put(material, currentQuantity + quantity);
                    }
                }
                if (materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("motes")>=250) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes",materials.get("motes")-250);
                    isWin=true;
                    break;
                }
            }
        }
        for (Map.Entry<String, Integer> entry : materials.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue());

        }
        for (Map.Entry<String, Integer> entry : junks.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }


    }

}

