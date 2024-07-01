/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author home
 */
public class AplikasiData {

    public static void main(String[] args) {
//      Contoh Penggunaan MemoryStorage
        DataStorage memoryStorage = new MemoryStorage2();
        memoryStorage.writeData("Data stored in memory");
        System.out.println("Memory storage: " + memoryStorage.readData());
        
//      Contoh Penggunaan FileStorage
        DataStorage fileStorage = new FileStorage("data.txt");
        fileStorage.writeData("Data stored in file");
        System.out.println("File Storage: " + fileStorage.readData());
        
//      Contoh Penggunaan DatabaseStorage
        DataStorage databaseStorage = new DatabaseStorage("F:\\Septian\\Java Projects\\AplikasiData\\src\\main\\java\\com\\mycompany\\aplikasidata\\database.db");
        databaseStorage.writeData("Data stored in database");
        System.out.println("Database Storage: " + databaseStorage.readData());
    }
}
