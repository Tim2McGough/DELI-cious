package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptGenerator {

    public void generateReceipt(Order order) {
        // Designate where the receipt will be saved
        String filename = "src/main/resources/Receipts/Receipts" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss")) + ".txt";

        // receipt content
        StringBuilder receiptContent = new StringBuilder();
        receiptContent.append("DELI-cious Sandwich Shop\n");
        receiptContent.append("Order Date & Time: ").append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))).append("\n");
        receiptContent.append("Total Items: ").append(order.getItems().size()).append("\n"); // Number of items
        receiptContent.append("Total Price: $").append(order.getTotalPrice()).append("\n");

        // Write to file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(receiptContent.toString());
            System.out.println("Receipt generated!");
        } catch (IOException e) {
            System.out.println("Error generating receipt: " + e.getMessage());
        }
    }

}
